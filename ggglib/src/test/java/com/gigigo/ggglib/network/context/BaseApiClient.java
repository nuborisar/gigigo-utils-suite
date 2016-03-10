package com.gigigo.ggglib.network.context;

import com.gigigo.ggglib.network.context.responses.MockApiResponse;
import retrofit.Call;
import retrofit.http.POST;
import retrofit.http.Path;


public interface BaseApiClient {

  @POST("{type}/")
  Call<MockApiResponse> testHttpConnection(@Path("type") String callType);

}
