package com.tuts.prakash.cryptotracker.activity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.tuts.prakash.cryptotracker.R;
import com.tuts.prakash.cryptotracker.adapter.CryptoAdapter;
import com.tuts.prakash.cryptotracker.model.Crypto;
import com.tuts.prakash.cryptotracker.network.GetDataService;
import com.tuts.prakash.cryptotracker.network.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private CryptoAdapter adapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDialog;
    LinearLayoutManager layoutManager;

    String[] currency_names_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        currency_names_list = getResources().getStringArray(R.array.currency_names_list);

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);

        Call<List<Crypto>> call = service.getAllCryptos();
        call.enqueue(new Callback<List<Crypto>>() {

            @Override
            public void onResponse(Call<List<Crypto>> call, Response<List<Crypto>> response) {
                progressDialog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<Crypto>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    /*Method to generate List of data using RecyclerView with custom adapter*/
    private void generateDataList(List<Crypto> cryptoList) {
        recyclerView = findViewById(R.id.cryptoRecyclerView);
        adapter = new CryptoAdapter(this,cryptoList);
        layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

}
