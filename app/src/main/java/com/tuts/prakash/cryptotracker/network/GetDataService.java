package com.tuts.prakash.cryptotracker.network;

import com.tuts.prakash.cryptotracker.model.Crypto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by prakash on 1/27/2018.
 */

public interface GetDataService {

    @GET("/v1/ticker/")
    Call<List<Crypto>> getAllCryptos();
}
