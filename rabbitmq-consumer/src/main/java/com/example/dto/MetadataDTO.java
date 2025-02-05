package com.example.dto;

public class MetadataDTO {
    private String user_id;
    private String wallet_id;

    // Getters and setters
    public String getUser_id() { return user_id; }
    public void setUser_id(String user_id) { this.user_id = user_id; }

    public String getWallet_id() { return wallet_id; }
    public void setWallet_id(String wallet_id) { this.wallet_id = wallet_id; }

    @Override
    public String toString() {
        return "MetadataDTO{" +
                "user_id='" + user_id + '\'' +
                ", wallet_id='" + wallet_id + '\'' +
                '}';
    }
}
