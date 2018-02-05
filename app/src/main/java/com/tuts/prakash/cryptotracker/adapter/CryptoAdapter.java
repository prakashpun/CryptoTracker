package com.tuts.prakash.cryptotracker.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tuts.prakash.cryptotracker.R;
import com.tuts.prakash.cryptotracker.databinding.CryptoRowBinding;
import com.tuts.prakash.cryptotracker.model.Crypto;
import java.util.List;

public class CryptoAdapter extends RecyclerView.Adapter<CryptoAdapter.CustomViewHolder> {

    private List<Crypto> dataList;
    private Context context;

    public CryptoAdapter(Context context, List<Crypto> cryptoList) {
        this.context = context;
        this.dataList = cryptoList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        private CryptoRowBinding binding;

        CustomViewHolder(CryptoRowBinding _binding) {
            super(_binding.getRoot());
            binding = _binding;
        }

        void bindConnection(Crypto _crypto){
            binding.setCrypto(_crypto);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CryptoRowBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.crypto_row,parent,false);
        return new CustomViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {
        holder.bindConnection(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
