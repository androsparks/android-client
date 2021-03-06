package vision.genesis.clientapp.managers;

import android.util.Pair;

import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import io.swagger.client.api.RateApi;
import io.swagger.client.model.RateModel;
import io.swagger.client.model.RatesModel;
import rx.Subscription;
import rx.schedulers.Schedulers;
import rx.subjects.BehaviorSubject;
import vision.genesis.clientapp.model.CurrencyEnum;

/**
 * GenesisVision
 * Created by Vitaly on 3/5/18.
 */

public class RateManager
{
	public static List<String> baseCurrenciesList = new ArrayList<>(Arrays.asList(
			CurrencyEnum.BTC.getValue(),
			CurrencyEnum.ETH.getValue(),
			CurrencyEnum.GVT.getValue(),
			CurrencyEnum.USDT.getValue(),
			CurrencyEnum.USD.getValue(),
			CurrencyEnum.EUR.getValue()));

	private RateApi rateApi;

	private HashMap<Pair<String, String>, BehaviorSubject<Double>> ratesMap = new HashMap<>();

	private BehaviorSubject<HashMap<CurrencyEnum, Double>> baseRatesSubject = BehaviorSubject.create();

	private Subscription rateSubscription;

	private Subscription baseRatesSubscription;

	public RateManager(RateApi rateApi) {
		this.rateApi = rateApi;
	}

	public BehaviorSubject<Double> getRate(String from, String to) {
		BehaviorSubject<Double> rateSubject = getRateSubject(from, to);

		rateSubscription = rateApi.getRate(from, to)
				.observeOn(Schedulers.io())
				.subscribeOn(Schedulers.io())
				.subscribe(response -> handleGetRateResponse(response, rateSubject),
						this::handleGetRateError);

		return rateSubject;
	}

	public BehaviorSubject<HashMap<CurrencyEnum, Double>> getBaseRates() {
		List<String> from = new ArrayList<>();
		from.add(CurrencyEnum.GVT.getValue());

		baseRatesSubscription = rateApi.getRates(from, baseCurrenciesList)
				.observeOn(Schedulers.io())
				.subscribeOn(Schedulers.io())
				.subscribe(this::handleGetBaseRatesResponse,
						this::handleGetBaseRatesError);

		return baseRatesSubject;
	}

	private void handleGetRateResponse(RateModel response, BehaviorSubject<Double> rateSubject) {
		rateSubscription.unsubscribe();
		rateSubject.onNext(response.getRate());
	}

	private void handleGetRateError(Throwable error) {
		rateSubscription.unsubscribe();
	}

	private void handleGetBaseRatesResponse(RatesModel response) {
		baseRatesSubscription.unsubscribe();

		HashMap<CurrencyEnum, Double> responseMap = new HashMap<>();
		LinkedTreeMap rates = (LinkedTreeMap) response.getRates();
		//TODO:
		for (LinkedTreeMap rateItem : (List<LinkedTreeMap>) rates.get("GVT")) {
			getRateSubject(CurrencyEnum.GVT.getValue(), (String) rateItem.get("currency")).onNext((Double) rateItem.get("rate"));
			responseMap.put(CurrencyEnum.fromValue((String) rateItem.get("currency")), (Double) rateItem.get("rate"));
		}
		baseRatesSubject.onNext(responseMap);
	}

	private void handleGetBaseRatesError(Throwable error) {
		baseRatesSubscription.unsubscribe();
	}

	private BehaviorSubject<Double> getRateSubject(String from, String to) {
		Pair<String, String> pairKey = new Pair<>(from, to);
		BehaviorSubject<Double> rateSubject = ratesMap.get(pairKey);
		if (rateSubject == null) {
			rateSubject = BehaviorSubject.create();
			ratesMap.put(pairKey, rateSubject);
		}
		return rateSubject;
	}
}
