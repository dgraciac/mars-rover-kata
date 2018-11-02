package com.dgraciac.mars_rover;

public class Rover {
    private final GridDimensions gridDimensions;
    private final Location location;
    private Position position;

    private State westState;
    private State state;
    private State eastState;
    private State northState;
    private State southState;

    public Rover(GridDimensions gridDimensions, Location initialLocation, State initialState) {
        this.gridDimensions = gridDimensions;
        this.location = initialLocation;
        this.state = initialState;
        this.westState = new WestState();
        this.eastState = new EastState();
        this.northState = new NorthState();
        this.southState = new SouthState();
    }

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
        state.turnLeft(this);
    }

    State getWestState() {
        return westState;
    }

    void setState(State state) {
        this.state = state;
    }

    State getEastState() {
        return eastState;
    }

    State getNorthState() {
        return northState;
    }

    State getSouthState() {
        return southState;
    }

    public State getState() {
        return state;
    }
}
