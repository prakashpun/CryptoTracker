package com.tuts.prakash.cryptotracker.model;

/**
 * Created by prakash on 1/27/2018.
 */


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Crypto{

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("symbol")
    private String symbol;
    @SerializedName("rank")
    private String rank;
    @SerializedName("price_usd")
    private String price_usd;
    @SerializedName("price_btc")
    private String price_btc;
    @SerializedName("24h_volume_usd")
    private String volume_usd_h24;
    @SerializedName("market_cap_usd")
    private String market_cap_usd;
    @SerializedName("available_supply")
    private String available_supply;
    @SerializedName("total_supply")
    private String total_supply;
    @SerializedName("max_supply")
    private String max_supply;
    @SerializedName("percent_change_1h")
    private String percent_change_1h;
    @SerializedName("percent_change_24h")
    private String percent_change_24h;
    @SerializedName("percent_change_7d")
    private String percent_change_7d;
    @SerializedName("last_updated")
    private String last_updated;

    public Crypto(String id, String name, String symbol, String rank, String price_usd, String price_btc,
                  String volume_usd_h24, String market_cap_usd, String available_supply, String total_supply,
                  String max_supply, String percent_change_1h, String percent_change_24h, String percent_change_7d,
                  String last_updated) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.rank = rank;
        this.price_usd = price_usd;
        this.price_btc = price_btc;
        this.volume_usd_h24 = volume_usd_h24;
        this.market_cap_usd = market_cap_usd;
        this.available_supply = available_supply;
        this.total_supply = total_supply;
        this.max_supply = max_supply;
        this.percent_change_1h = percent_change_1h;
        this.percent_change_24h = percent_change_24h;
        this.percent_change_7d = percent_change_7d;
        this.last_updated = last_updated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPrice_usd() {
        return price_usd;
    }

    public void setPrice_usd(String price_usd) {
        this.price_usd = price_usd;
    }

    public String getPrice_btc() {
        return price_btc;
    }

    public void setPrice_btc(String price_btc) {
        this.price_btc = price_btc;
    }

    public String getVolume_usd_h24() {
        return volume_usd_h24;
    }

    public void setVolume_usd_h24(String volume_usd_h24) {
        this.volume_usd_h24 = volume_usd_h24;
    }

    public String getMarket_cap_usd() {
        return market_cap_usd;
    }

    public void setMarket_cap_usd(String market_cap_usd) {
        this.market_cap_usd = market_cap_usd;
    }

    public String getAvailable_supply() {
        return available_supply;
    }

    public void setAvailable_supply(String available_supply) {
        this.available_supply = available_supply;
    }

    public String getTotal_supply() {
        return total_supply;
    }

    public void setTotal_supply(String total_supply) {
        this.total_supply = total_supply;
    }

    public String getMax_supply() {
        return max_supply;
    }

    public void setMax_supply(String max_supply) {
        this.max_supply = max_supply;
    }

    public String getPercent_change_1h() {
        return percent_change_1h;
    }

    public void setPercent_change_1h(String percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public String getPercent_change_24h() {
        return percent_change_24h;
    }

    public void setPercent_change_24h(String percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public String getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_7d(String percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

}
