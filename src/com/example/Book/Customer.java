package com.example.Book;

public class Customer {
    private String CustomerName;
    private  int CustomerId;

    public Customer(String customerName, int customerId){
        this.CustomerName = customerName;
        this.CustomerId = customerId;
    }

    public String getCustomerName() {return CustomerName;}

    public int getCustomerId() { return CustomerId;}

    public void setCustomerName(String customerName) { this.CustomerName = customerName; }

    public void setCustomerId(int customerId) { this.CustomerId = customerId; }
}
