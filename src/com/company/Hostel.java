package com.company;

public class Hostel implements Arenda{
    private String address;

    public Hostel(String address) {
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
        return "Hostel{" +
                "address='" + address + '\'' +
                '}';
    }




    @Override
    public void arenda() {
        System.out.println("3000");

    }
}
