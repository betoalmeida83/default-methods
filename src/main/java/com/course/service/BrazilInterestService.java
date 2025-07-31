package com.course.service;

public class BrazilInterestService {

    private Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public double payment(Double amount, Integer months) {
        return amount * Math.pow((1 + interestRate/100), months);
    }
}
