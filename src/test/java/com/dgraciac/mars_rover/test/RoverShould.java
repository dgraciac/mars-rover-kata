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

    @Test
    public void be_at_3_1_E_when_grid_is_3_1_and_rover_starts_3_1_W_and_it_moves_WEST_until_wraps_around() {
        int width = 3;
        int height = 1;
        GridDimensions gridDimensions = new GridDimensions(width, height);
        int x = 3;
        int y = 1;
        Location initialLocation = new Location(x,y);
        Position initialPosition = Position.WEST;
        Rover rover = new Rover(gridDimensions, initialLocation, initialPosition);

        rover.move();
        rover.move();
        rover.move();

        assertThat(rover.location()).isEqualTo(new Location(3, 1));
        assertThat(rover.position()).isEqualTo(Position.WEST);
    }

    @Test
    public void be_at_1_2_N_when_grid_is_1_3_and_rover_starts_1_1_N_and_it_moves_1_square_NORTH() {
        int width = 1;
        int height = 3;
        GridDimensions gridDimensions = new GridDimensions(width, height);
        int x = 1;
        int y = 1;
        Location initialLocation = new Location(x,y);
        Position initialPosition = Position.NORTH;
        Rover rover = new Rover(gridDimensions, initialLocation, initialPosition);

        rover.move();

        assertThat(rover.location()).isEqualTo(new Location(1, 2));
        assertThat(rover.position()).isEqualTo(Position.NORTH);
    }

    @Test
    public void be_at_1_1_N_when_grid_is_1_3_and_rover_starts_1_3_N_and_it_moves_1_square_NORTH() {
        int width = 1;
        int height = 3;
        GridDimensions gridDimensions = new GridDimensions(width, height);
        int x = 1;
        int y = 3;
        Location initialLocation = new Location(x,y);
        Position initialPosition = Position.NORTH;
        Rover rover = new Rover(gridDimensions, initialLocation, initialPosition);

        rover.move();

        assertThat(rover.location()).isEqualTo(new Location(1, 1));
        assertThat(rover.position()).isEqualTo(Position.NORTH);
    }
}
