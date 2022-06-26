package com.company;

public class Kvartira implements KomUsluga{
    private String address;

    public Kvartira(String address) {
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
        return "Kvartira{" +
                "address='" + address + '\'' +
                '}';
    }

    @Override
    public void komUsluga() {

    }

    @Override
    public void oplata() {
        System.out.println("oplata 1000 som");

    }
}
