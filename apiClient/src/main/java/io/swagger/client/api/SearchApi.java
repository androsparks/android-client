package io.swagger.client.api;

import io.swagger.client.model.CommonPublicAssetsViewModel;
import retrofit2.http.GET;
import rx.Observable;

public interface SearchApi
{
	/**
	 * Program / fund / manager search
	 *
	 * @param mask (optional)
	 * @param take (optional)
	 * @return Call&lt;CommonPublicAssetsViewModel&gt;
	 */
	@GET("v2.0/search")
	Observable<CommonPublicAssetsViewModel> search(
			@retrofit2.http.Query("mask") String mask, @retrofit2.http.Query("take") Integer take
	);

}
