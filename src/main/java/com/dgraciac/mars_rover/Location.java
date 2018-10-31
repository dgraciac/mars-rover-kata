package com.dgraciac.mars_rover;

import java.util.Objects;

public class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void increaseXByOne() {
        x += 1;
    }

    int x() {
        return x;
    }

    void setMinimumValueForX() {
        x = 1;
    }

    void decreaseXByOne() {
        x -= 1;
    }

    void setValueForX(int newValue) {
        x = newValue;
    }

    void increaseYByOne() {
        y += 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return x == location.x &&
                y == location.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
