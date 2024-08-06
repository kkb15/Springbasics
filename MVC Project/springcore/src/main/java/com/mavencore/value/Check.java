package com.mavencore.value;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Check {
    @Value("#{3 + 3}")
    private int x;

    @Value("#{22 * 2}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double square;

    @Value("'Kamal'")
    private String name;

    @Value("#{8 >= 8}")
    private boolean isActive;

    @Override
    public String toString() {
        return "Check [x=" + x + ", y=" + y + ", square=" + square + ", name=" + name + ", isActive=" + isActive + "]";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
