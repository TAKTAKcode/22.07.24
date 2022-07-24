package com.tak.Inheritance;

import java.util.Date;

public class ExCar extends Car {

    private double totalMileage;


    public ExCar(String name, int width, int height, int length, double x, double y, double fuel, Date purchaseDay) {
        super(name, width, height, length, x, y, fuel, purchaseDay);
        totalMileage = 0.0;
    }

    public double getTotalMileage() {
        return totalMileage;
    }

    public void putSpec() {
        super.putSpec();
        System.out.printf("총 주행 거리 : %.2kfm\n", totalMileage);
    }

    public boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy);

        if (!super.move(dx, dy)) {
            return false;
        } else {
            totalMileage += dist;
            return true;
        }
    }
}
