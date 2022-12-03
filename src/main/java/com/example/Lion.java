package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    Predator predator;

    int kittens;

    public Lion(String sex, Predator predator) throws Exception {
        this.predator = predator;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }
    public int getLionKittens() {
        return predator.getKittens(predator.getKittens());
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.getFood("Хищник");
    }
}
