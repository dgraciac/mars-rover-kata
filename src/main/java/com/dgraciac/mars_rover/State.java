package com.dgraciac.mars_rover;

public interface State {
    void move();

    void turnRight();

    void turnLeft(Rover rover);
}
