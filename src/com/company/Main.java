package com.company;

public class Main {

    public static void main(String[] args) {
        Person person=new Person("abu");
        Person person2=new Person("nur");
        Person person3=new Person("erkin");
        Person person4=new Person("elka");
        Person person5=new Person("boty");
        Person person6=new Person("maks");
        Person person7=new Person("erbol");
        Person person8=new Person("sezim");

        Kvartira kvartira=new Kvartira("Bishkek");
        Hostel hostel=new Hostel("vostok");
        Hotel hotel=new Hotel("mkr12");

        System.out.println("~~~~~~~Kvartira~~~~~~~\n");
        System.out.println(kvartira);
        kvartira.oplata();
        Person[]kvartirant={person,person2,person3};
        int count=0;
        for (Person person1:kvartirant) {
            count++;
            System.out.println(person1);
        }System.out.println(count+"\n");

        System.out.println("~~~~~~Hotel~~~~~~");
        System.out.println(hotel);
        hotel.arenda();
        Person[]hotel1={person4,person5};
        int count2=0;
        for (Person persons:hotel1) {
            count++;
            System.out.println(persons);

        }
        System.out.println(count2+"\n");

        System.out.println("~~~~~~Hostel~~~~~~~");
        System.out.println(hostel);
        hostel.arenda();
        Person [] hostel1 ={person6,person7,person8};
        int count3 =0;
        for (Person personss:hostel1) {
            count++;
            System.out.println(personss);


        }
        System.out.println(count3+"\n");


            



    }
}
