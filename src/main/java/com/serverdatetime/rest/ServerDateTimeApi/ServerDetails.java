package com.serverdatetime.rest.ServerDateTimeApi;

public class ServerDetails {
    private String serverDateTimeMilli;

    public ServerDetails(String serverDateTimeMilli) {
        this.serverDateTimeMilli = serverDateTimeMilli;
    }

    public String getServerDateTimeMilli() {
        return serverDateTimeMilli;
    }

    public void setServerDateTimeMilli(String serverDateTimeMilli) {
        this.serverDateTimeMilli = serverDateTimeMilli;
    }
}
