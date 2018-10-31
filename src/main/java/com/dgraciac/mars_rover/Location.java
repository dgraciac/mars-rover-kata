package com.dgraciac.mars_rover;

import java.util.Objects;

public class Location {
    private int x;
    private final int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void increaseXBy1() {
        x += 1;
    }

    int x() {
        return x;
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

    void setMinimumValueForX() {
        x = 1;
    }
}
