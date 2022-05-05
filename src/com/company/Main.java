package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Barsik");
        cat.setPoroda("Scottish");
        cat.setAge(3);
        System.out.println(cat.getName()+"\n"+cat.getPoroda()+"\n"+cat.getAge());

        Dog dog = new Dog();
        dog.setName("Pluto");
        dog.setPoroda("Labrador");
        dog.setAge(3);
        System.out.println(dog.getName()+"\n"+dog.getPoroda()+"\n"+dog.getAge());

        Parrot parrot = new Parrot();
        parrot.setName("Amazon");
        parrot.setPoroda("Jako");
        parrot.setAge(1);
        System.out.println(parrot.getName()+"\n"+parrot.getPoroda()+"\n"+parrot.getAge());

        Fish fish = new Fish();
        fish.setName("Lora");
        fish.setPoroda("Tuna");
        fish.setAge(-5);
        System.out.println(fish.getName()+"\n"+fish.getPoroda()+"\n"+fish.getAge());

    }


    }


