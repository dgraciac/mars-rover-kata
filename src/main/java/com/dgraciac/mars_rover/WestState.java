package com.dgraciac.mars_rover;

public class WestState implements State {

    @Override
    public void move() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void turnLeft(Rover rover) {
        rover.setState(rover.getSouthState());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return WestState.class.hashCode();
    }
}
