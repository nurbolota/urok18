package com.company;

public class Hotel implements Arenda {
    private String address;

    public Hotel(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "address='" + address + '\'' +
                '}';
    }

    @Override
    public void arenda() {
        System.out.println("sutka 100$");

    }
}
