/*
 * Core API v1.0
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * RatesModelRates
 */

public class RatesModelRates
{
	@SerializedName("Undefined")
	private List<RateItem> undefined = null;

	@SerializedName("GVT")
	private List<RateItem> GVT = null;

	@SerializedName("ETH")
	private List<RateItem> ETH = null;

	@SerializedName("BTC")
	private List<RateItem> BTC = null;

	@SerializedName("ADA")
	private List<RateItem> ADA = null;

	@SerializedName("USDT")
	private List<RateItem> USDT = null;

	@SerializedName("XRP")
	private List<RateItem> XRP = null;

	@SerializedName("BCH")
	private List<RateItem> BCH = null;

	@SerializedName("LTC")
	private List<RateItem> LTC = null;

	@SerializedName("DOGE")
	private List<RateItem> DOGE = null;

	@SerializedName("BNB")
	private List<RateItem> BNB = null;

	@SerializedName("USD")
	private List<RateItem> USD = null;

	@SerializedName("EUR")
	private List<RateItem> EUR = null;

	public RatesModelRates undefined(List<RateItem> undefined) {
		this.undefined = undefined;
		return this;
	}

	public RatesModelRates addUndefinedItem(RateItem undefinedItem) {
		if (this.undefined == null) {
			this.undefined = new ArrayList<RateItem>();
		}
		this.undefined.add(undefinedItem);
		return this;
	}

	/**
	 * Get undefined
	 *
	 * @return undefined
	 **/
	@ApiModelProperty(value = "")
	public List<RateItem> getUndefined() {
		return undefined;
	}

	public void setUndefined(List<RateItem> undefined) {
		this.undefined = undefined;
	}

	public RatesModelRates GVT(List<RateItem> GVT) {
		this.GVT = GVT;
		return this;
	}

	public RatesModelRates addGVTItem(RateItem GVTItem) {
		if (this.GVT == null) {
			this.GVT = new ArrayList<RateItem>();
		}
		this.GVT.add(GVTItem);
		return this;
	}

	/**
	 * Get GVT
	 *
	 * @return GVT
	 **/
	@ApiModelProperty(value = "")
	public List<RateItem> getGVT() {
		return GVT;
	}

	public void setGVT(List<RateItem> GVT) {
		this.GVT = GVT;
	}

	public RatesModelRates ETH(List<RateItem> ETH) {
		this.ETH = ETH;
		return this;
	}

	public RatesModelRates addETHItem(RateItem ETHItem) {
		if (this.ETH == null) {
			this.ETH = new ArrayList<RateItem>();
		}
		this.ETH.add(ETHItem);
		return this;
	}

	/**
	 * Get ETH
	 *
	 * @return ETH
	 **/
	@ApiModelProperty(value = "")
	public List<RateItem> getETH() {
		return ETH;
	}

	public void setETH(List<RateItem> ETH) {
		this.ETH = ETH;
	}

	public RatesModelRates BTC(List<RateItem> BTC) {
		this.BTC = BTC;
		return this;
	}

	public RatesModelRates addBTCItem(RateItem BTCItem) {
		if (this.BTC == null) {
			this.BTC = new ArrayList<RateItem>();
		}
		this.BTC.add(BTCItem);
		return this;
	}

	/**
	 * Get BTC
	 *
	 * @return BTC
	 **/
	@ApiModelProperty(value = "")
	public List<RateItem> getBTC() {
		return BTC;
	}

	public void setBTC(List<RateItem> BTC) {
		this.BTC = BTC;
	}

	public RatesModelRates ADA(List<RateItem> ADA) {
		this.ADA = ADA;
		return this;
	}

	public RatesModelRates addADAItem(RateItem ADAItem) {
		if (this.ADA == null) {
			this.ADA = new ArrayList<RateItem>();
		}
		this.ADA.add(ADAItem);
		return this;
	}

	/**
	 * Get ADA
	 *
	 * @return ADA
	 **/
	@ApiModelProperty(value = "")
	public List<RateItem> getADA() {
		return ADA;
	}

	public void setADA(List<RateItem> ADA) {
		this.ADA = ADA;
	}

	public RatesModelRates USDT(List<RateItem> USDT) {
		this.USDT = USDT;
		return this;
	}

	public RatesModelRates addUSDTItem(RateItem USDTItem) {
		if (this.USDT == null) {
			this.USDT = new ArrayList<RateItem>();
		}
		this.USDT.add(USDTItem);
		return this;
	}

	/**
	 * Get USDT
	 *
	 * @return USDT
	 **/
	@ApiModelProperty(value = "")
	public List<RateItem> getUSDT() {
		return USDT;
	}

	public void setUSDT(List<RateItem> USDT) {
		this.USDT = USDT;
	}

	public RatesModelRates XRP(List<RateItem> XRP) {
		this.XRP = XRP;
		return this;
	}

	public RatesModelRates addXRPItem(RateItem XRPItem) {
		if (this.XRP == null) {
			this.XRP = new ArrayList<RateItem>();
		}
		this.XRP.add(XRPItem);
		return this;
	}

	/**
	 * Get XRP
	 *
	 * @return XRP
	 **/
	@ApiModelProperty(value = "")
	public List<RateItem> getXRP() {
		return XRP;
	}

	public void setXRP(List<RateItem> XRP) {
		this.XRP = XRP;
	}

	public RatesModelRates BCH(List<RateItem> BCH) {
		this.BCH = BCH;
		return this;
	}

	public RatesModelRates addBCHItem(RateItem BCHItem) {
		if (this.BCH == null) {
			this.BCH = new ArrayList<RateItem>();
		}
		this.BCH.add(BCHItem);
		return this;
	}

	/**
	 * Get BCH
	 *
	 * @return BCH
	 **/
	@ApiModelProperty(value = "")
	public List<RateItem> getBCH() {
		return BCH;
	}

	public void setBCH(List<RateItem> BCH) {
		this.BCH = BCH;
	}

	public RatesModelRates LTC(List<RateItem> LTC) {
		this.LTC = LTC;
		return this;
	}

	public RatesModelRates addLTCItem(RateItem LTCItem) {
		if (this.LTC == null) {
			this.LTC = new ArrayList<RateItem>();
		}
		this.LTC.add(LTCItem);
		return this;
	}

	/**
	 * Get LTC
	 *
	 * @return LTC
	 **/
	@ApiModelProperty(value = "")
	public List<RateItem> getLTC() {
		return LTC;
	}

	public void setLTC(List<RateItem> LTC) {
		this.LTC = LTC;
	}

	public RatesModelRates DOGE(List<RateItem> DOGE) {
		this.DOGE = DOGE;
		return this;
	}

	public RatesModelRates addDOGEItem(RateItem DOGEItem) {
		if (this.DOGE == null) {
			this.DOGE = new ArrayList<RateItem>();
		}
		this.DOGE.add(DOGEItem);
		return this;
	}

	/**
	 * Get DOGE
	 *
	 * @return DOGE
	 **/
	@ApiModelProperty(value = "")
	public List<RateItem> getDOGE() {
		return DOGE;
	}

	public void setDOGE(List<RateItem> DOGE) {
		this.DOGE = DOGE;
	}

	public RatesModelRates BNB(List<RateItem> BNB) {
		this.BNB = BNB;
		return this;
	}

	public RatesModelRates addBNBItem(RateItem BNBItem) {
		if (this.BNB == null) {
			this.BNB = new ArrayList<RateItem>();
		}
		this.BNB.add(BNBItem);
		return this;
	}

	/**
	 * Get BNB
	 *
	 * @return BNB
	 **/
	@ApiModelProperty(value = "")
	public List<RateItem> getBNB() {
		return BNB;
	}

	public void setBNB(List<RateItem> BNB) {
		this.BNB = BNB;
	}

	public RatesModelRates USD(List<RateItem> USD) {
		this.USD = USD;
		return this;
	}

	public RatesModelRates addUSDItem(RateItem USDItem) {
		if (this.USD == null) {
			this.USD = new ArrayList<RateItem>();
		}
		this.USD.add(USDItem);
		return this;
	}

	/**
	 * Get USD
	 *
	 * @return USD
	 **/
	@ApiModelProperty(value = "")
	public List<RateItem> getUSD() {
		return USD;
	}

	public void setUSD(List<RateItem> USD) {
		this.USD = USD;
	}

	public RatesModelRates EUR(List<RateItem> EUR) {
		this.EUR = EUR;
		return this;
	}

	public RatesModelRates addEURItem(RateItem EURItem) {
		if (this.EUR == null) {
			this.EUR = new ArrayList<RateItem>();
		}
		this.EUR.add(EURItem);
		return this;
	}

	/**
	 * Get EUR
	 *
	 * @return EUR
	 **/
	@ApiModelProperty(value = "")
	public List<RateItem> getEUR() {
		return EUR;
	}

	public void setEUR(List<RateItem> EUR) {
		this.EUR = EUR;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RatesModelRates ratesModelRates = (RatesModelRates) o;
		return Objects.equals(this.undefined, ratesModelRates.undefined) &&
				Objects.equals(this.GVT, ratesModelRates.GVT) &&
				Objects.equals(this.ETH, ratesModelRates.ETH) &&
				Objects.equals(this.BTC, ratesModelRates.BTC) &&
				Objects.equals(this.ADA, ratesModelRates.ADA) &&
				Objects.equals(this.USDT, ratesModelRates.USDT) &&
				Objects.equals(this.XRP, ratesModelRates.XRP) &&
				Objects.equals(this.BCH, ratesModelRates.BCH) &&
				Objects.equals(this.LTC, ratesModelRates.LTC) &&
				Objects.equals(this.DOGE, ratesModelRates.DOGE) &&
				Objects.equals(this.BNB, ratesModelRates.BNB) &&
				Objects.equals(this.USD, ratesModelRates.USD) &&
				Objects.equals(this.EUR, ratesModelRates.EUR);
	}

	@Override
	public int hashCode() {
		return Objects.hash(undefined, GVT, ETH, BTC, ADA, USDT, XRP, BCH, LTC, DOGE, BNB, USD, EUR);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RatesModelRates {\n");

		sb.append("    undefined: ").append(toIndentedString(undefined)).append("\n");
		sb.append("    GVT: ").append(toIndentedString(GVT)).append("\n");
		sb.append("    ETH: ").append(toIndentedString(ETH)).append("\n");
		sb.append("    BTC: ").append(toIndentedString(BTC)).append("\n");
		sb.append("    ADA: ").append(toIndentedString(ADA)).append("\n");
		sb.append("    USDT: ").append(toIndentedString(USDT)).append("\n");
		sb.append("    XRP: ").append(toIndentedString(XRP)).append("\n");
		sb.append("    BCH: ").append(toIndentedString(BCH)).append("\n");
		sb.append("    LTC: ").append(toIndentedString(LTC)).append("\n");
		sb.append("    DOGE: ").append(toIndentedString(DOGE)).append("\n");
		sb.append("    BNB: ").append(toIndentedString(BNB)).append("\n");
		sb.append("    USD: ").append(toIndentedString(USD)).append("\n");
		sb.append("    EUR: ").append(toIndentedString(EUR)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}

