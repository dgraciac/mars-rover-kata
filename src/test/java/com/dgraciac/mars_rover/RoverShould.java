package com.dgraciac.mars_rover;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoverShould {
    @Test
    public void be_at_2_1_E_when_grid_is_3_1_and_rover_starts_1_1_E_it_and_moves_1_square_EAST() {
        int width = 3;
        int height = 1;
        Grid grid = new Grid(width, height);
        int x = 1;
        int y = 1;
        Location initialLocation = new Location(x,y);
        Position initialPosition = Position.EAST;
        Rover rover = new Rover(grid, initialLocation, initialPosition);

        rover.move();

        assertThat(rover.location()).isEqualTo(new Location(2, 1));
        assertThat(rover.position()).isEqualTo(Position.EAST);
    }

}
