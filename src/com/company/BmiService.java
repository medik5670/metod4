package com.company;

public class BmiService {
    public int calculate(double weight, double height) {
        int index;
        index = (int) (weight / (height * height));
        return index;
    }
}
