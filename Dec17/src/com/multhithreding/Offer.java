package com.multhithreding;

public class Offer {
    private String offerText;

    public Offer(String offerText) {
        this.offerText = offerText;
    }

    public String getOfferText() {
        return offerText;
    }

    @Override
    public String toString() {
        return "Offer [offerText=" + offerText + "]";
    }
}