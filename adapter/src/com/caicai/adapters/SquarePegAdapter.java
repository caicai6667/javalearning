package com.caicai.adapters;

import com.caicai.round.RoundPeg;
import com.caicai.square.SquarePeg;

/*
方孔适配器继承圆孔，重写半径，若满足result是算式
即返回result，然后roundhole类里面再进行判断
 */

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}