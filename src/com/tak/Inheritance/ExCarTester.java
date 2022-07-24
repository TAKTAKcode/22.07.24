package com.tak.Inheritance;

import java.util.Date;

public class ExCarTester {

    public static void main(String[] args) {
        ExCar myCar = new ExCar("Benz E-Class Coupe", 1845, 1490, 5205, 0, 0,2015,new Date());

        System.out.printf("현재 위치 : (%.2f,%.2f)\n", myCar.getX(), myCar.getY());
        System.out.printf("남은 연료 : %.2f리터\n", myCar.getFuel());
        System.out.printf("구입일 : %s\n", myCar.getPurchaseDay());
    }

}
