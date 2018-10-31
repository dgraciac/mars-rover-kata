package com.dgraciac.mars_rover.test;

import com.dgraciac.mars_rover.GridDimensions;
import com.dgraciac.mars_rover.Location;
import com.dgraciac.mars_rover.Position;
import com.dgraciac.mars_rover.Rover;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoverShould {
    @Test
    public void be_at_2_1_E_when_grid_is_3_1_and_rover_starts_1_1_E_and_it_moves_1_square_EAST() {
        int width = 3;
        int height = 1;
        GridDimensions gridDimensions = new GridDimensions(width, height);
        int x = 1;
        int y = 1;
        Location initialLocation = new Location(x,y);
        Position initialPosition = Position.EAST;
        Rover rover = new Rover(gridDimensions, initialLocation, initialPosition);

        rover.move();

        assertThat(rover.location()).isEqualTo(new Location(2, 1));
        assertThat(rover.position()).isEqualTo(Position.EAST);
    }

    @Test
    public void be_at_3_1_E_when_grid_is_3_1_and_rover_starts_1_1_E_and_it_moves_2_squares_EAST() {
        int width = 3;
        int height = 1;
        GridDimensions gridDimensions = new GridDimensions(width, height);
        int x = 1;
        int y = 1;
        Location initialLocation = new Location(x,y);
        Position initialPosition = Position.EAST;
        Rover rover = new Rover(gridDimensions, initialLocation, initialPosition);

        rover.move();
        rover.move();

        assertThat(rover.location()).isEqualTo(new Location(3, 1));
        assertThat(rover.position()).isEqualTo(Position.EAST);
    }

    @Test
    public void be_at_1_1_E_when_grid_is_3_1_and_rover_starts_1_1_E_and_it_moves_EAST_until_wraps_around() {
        int width = 3;
        int height = 1;
        GridDimensions gridDimensions = new GridDimensions(width, height);
        int x = 1;
        int y = 1;
        Location initialLocation = new Location(x,y);
        Position initialPosition = Position.EAST;
        Rover rover = new Rover(gridDimensions, initialLocation, initialPosition);

        rover.move();
        rover.move();
        rover.move();

        assertThat(rover.location()).isEqualTo(new Location(1, 1));
        assertThat(rover.position()).isEqualTo(Position.EAST);
    }

}
