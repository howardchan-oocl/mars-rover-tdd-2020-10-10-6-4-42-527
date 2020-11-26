package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DemoTest {
    @Test
    void should_return_y_plus_1_when_executeCommands_given_0_0_N_AND_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");

        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(1,marsRover.getLocationY());
        assertEquals("N",marsRover.getDirection());
    }

    @Test
    void should_return_y_minus_1_when_executeCommands_given_0_0_S_AND_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");

        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(-1,marsRover.getLocationY());
        assertEquals("S",marsRover.getDirection());
    }

    @Test
    void should_return_x_minus_1_when_executeCommands_given_0_0_W_AND_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");

        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(-1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    void should_return_x_plus_1_when_executeCommands_given_0_0_E_AND_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");

        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getDirection());
    }

    @Test
    void should_return_W_when_executeCommands_given_0_0_N_AND_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");

        //when
        marsRover.executeCommands("L");

        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    void should_return_E_when_executeCommands_given_0_0_N_AND_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");

        //when
        marsRover.executeCommands("R");

        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getDirection());
    }

    @Test
    void should_return_E_when_executeCommands_given_0_0_S_AND_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");

        //when
        marsRover.executeCommands("L");

        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getDirection());
    }

    @Test
    void should_return_W_when_executeCommands_given_0_0_S_AND_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");

        //when
        marsRover.executeCommands("R");

        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    void should_return_N_when_executeCommands_given_0_0_E_AND_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");

        //when
        marsRover.executeCommands("L");

        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("N",marsRover.getDirection());
    }
}
