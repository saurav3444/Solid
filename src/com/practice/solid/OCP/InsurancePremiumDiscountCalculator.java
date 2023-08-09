package com.practice.solid.OCP;


public class InsurancePremiumDiscountCalculator {

    //Now we don't have to modify this class upon extension
    public int calculatePremiumDiscountCalculator(InsuranceCustomerProfile customer){

        if(customer.isLoyalCustomer()){
            return 20;
        }
        return 0;
    }
}
