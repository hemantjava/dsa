package com.hemant.ds.solid.ocp.problem;

public interface NotificationService {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

}
