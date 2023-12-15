package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public <T, G> List<G> boxingMethod(T name) {
        List<T> firstList = new ArrayList<>();
        firstList.add(name);
        List<G> secondList = new ArrayList<>();
        secondList.add((G)firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public <T> T genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3
    public<T> void cloneMethod(List<T> consumer, List<? extends T> producer) {
        consumer.addAll(producer);
    }

}
