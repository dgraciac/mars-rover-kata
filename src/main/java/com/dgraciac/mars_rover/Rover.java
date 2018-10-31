package com.dgraciac.mars_rover;

public class Rover {
    private final GridDimensions gridDimensions;
    private final Location location;
    private final Position position;

    public Rover(GridDimensions gridDimensions, Location initialLocation, Position initialPosition) {
        this.gridDimensions = gridDimensions;
        this.location = initialLocation;
        this.position = initialPosition;
    }

    public Location location() {
        return location;
    }

    public Position position() {
        return Position.EAST;
    }

    public void move() {
        location.increaseXBy1();
    }
}
