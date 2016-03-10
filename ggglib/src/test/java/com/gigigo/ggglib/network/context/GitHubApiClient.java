package com.gigigo.ggglib.network.context;

import com.gigigo.ggglib.network.context.responses.GitHubResponse;
import retrofit.Call;
import retrofit.http.GET;


public interface GitHubApiClient {

  @GET("users/defunkt")
  Call<GitHubResponse> getOneUser();

}
