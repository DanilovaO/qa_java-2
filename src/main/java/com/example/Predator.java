package com.example;

import java.util.List;

public interface Predator {

    List<String> eatMeat() throws Exception;

    List<String> getFood(String food) throws Exception;

    String getFamily();

    int getKittens(int kittensCount);

    int getKittens();



}
