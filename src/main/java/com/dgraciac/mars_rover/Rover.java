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
        return position;
    }

    public void move() {
        if(position.equals(Position.EAST)) {
            if(location.x() == gridDimensions.width()) location.setMinimumValueForX();
            else location.increaseXByOne();
        } else {
            if(location.x() == 1) location.setValueForX(gridDimensions.width());
            else location.decreaseXByOne();
        }
    }
}
