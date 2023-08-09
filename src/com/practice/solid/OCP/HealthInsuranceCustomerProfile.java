package com.practice.solid.OCP;

public class HealthInsuranceCustomerProfile implements InsuranceCustomerProfile{
    @Override
    public boolean isLoyalCustomer() {
        return false;
    }
}
