package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldChangeTheStationByRemoteControl() {
        assertEquals(8, radio.changeTheStationByRemoteControl(8));
    }

    @Test
    void shouldChangeTheStationByRemoteControlIfNumberIsWrong() {
        assertEquals(5, radio.changeTheStationByRemoteControl(12));
    }

    @Test
    void shouldChangeTheStationByButtonNextIfCurrentIsNine() {
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldChangeTheStationByButtonNext() {
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldChangeTheStationByPrevButtonIfCurrentIsNull() {
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldChangeTheStationByPrevButton() {
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolumeUnderMinimum() {
        radio.volumeUp();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeIfMax() {
        radio.setCurrentVolume(10);
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeAboveMinimum() {
        radio.setCurrentVolume(10);
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.volumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }


    @Test
    void shouldDecreaseVolumeIfMin() {
        radio.setCurrentVolume(0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    void shouldSetVolume() {
        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());
    }


    @Test
    void shouldSetStation() {
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }


}