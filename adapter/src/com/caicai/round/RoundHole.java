package com.caicai.round;

/*
创一个圆孔类，参数也是半径，也get一下，
然后看看能不能修，如果洞的半径大于孔的半径就返回true
 */

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}