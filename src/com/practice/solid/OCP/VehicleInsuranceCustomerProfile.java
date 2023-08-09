package com.practice.solid.OCP;

public class VehicleInsuranceCustomerProfile implements InsuranceCustomerProfile {

    @Override
    public boolean isLoyalCustomer() {
        //here each insurance have their own implementation
        return true;
    }
}
