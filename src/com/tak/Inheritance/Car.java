package com.tak.Inheritance;

import java.util.Date;

public class Car {
    private String name;        //이름
    private int width;          //폭
    private int height;         //높이
    private int length;         //길이
    private double x;           //현재 위치의 x 좌표
    private double y;           //현재 위치의 y 좌표
    private double fuel;        //남은 연료
    private Date purchaseDay;   //구입일

    public Car(String name, int width, int height, int length, double x, double y, double fuel, Date purchaseDay) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        this.purchaseDay = new Date();
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getFuel() {
        return fuel;
    }
    public Date getPurchaseDay() {
        return new Date();
    }

    public void putSpec() {
        System.out.println("이름 : " + name);
        System.out.println("전폭 : " + width + "mm");
        System.out.println("전고 : " + height + "mm");
        System.out.println("전장 : " + width + "mm");
    }

    public boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy);         //이동거리

        if (dist > fuel) {

            return false;
        } else {
            fuel -= dist;
            x += dx;
            y += dy;
            return true;
        }
    }
}
