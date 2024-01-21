package com.company;

import com.company.BmiService;

public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(98, 1.87);
        System.out.println("Индекс массы тела:" + index);

    }
}
