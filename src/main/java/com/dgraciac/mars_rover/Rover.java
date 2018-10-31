package com.dgraciac.mars_rover;

public class Rover {
    private final GridDimensions gridDimensions;
    private final Location location;
    private Position position;

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
        } else if (position.equals(Position.WEST)){
            if(location.x() == 1) location.setValueForX(gridDimensions.width());
            else location.decreaseXByOne();
        } else if (position.equals(Position.NORTH)){
            if(location.y() == gridDimensions.height()) location.setMinimumValueForY();
            else location.increaseYByOne();
        } else {
            if(location.y() == 1) location.setValueForY(gridDimensions.height());
            else location.decreaseYByOne();
        }
    }

    public void turnRight() {
        if(position.equals(Position.NORTH)) position = Position.EAST;
        else if(position.equals(Position.EAST)) position = Position.SOUTH;
        else if(position.equals(Position.SOUTH)) position = Position.WEST;
        else position = Position.NORTH;
    }

    public void turnLeft() {
        if(position.equals(Position.EAST)) position = Position.NORTH;
        else if(position.equals(Position.SOUTH)) position = Position.EAST;
        else if(position.equals(Position.WEST)) position = Position.SOUTH;
        else position = Position.WEST;
    }
}
