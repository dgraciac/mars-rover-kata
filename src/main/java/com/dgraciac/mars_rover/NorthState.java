package com.dgraciac.mars_rover;

import java.util.Objects;

public class NorthState implements State {

    @Override
    public void move() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void turnLeft(Rover rover) {
        rover.setState(rover.getWestState());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return NorthState.class.hashCode();
    }
}
