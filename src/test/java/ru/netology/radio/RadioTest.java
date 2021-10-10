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
//        Radio radio = new Radio();
        assertEquals(5, radio.changeTheStationByRemoteControl(12));
    }

    @Test
    void shouldChangeTheStationByButtonNextIfCurrentIsNine() {
//        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldChangeTheStationByButtonNext() {
        //       Radio radio = new Radio();
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldChangeTheStationByPrevButtonIfCurrentIsNull() {
//        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldChangeTheStationByPrevButton() {
        //       Radio radio = new Radio();
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolumeUnderMinimum() {
        //      Radio radio = new Radio();
        radio.volumeUp();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeAboveMinimum() {
//        Radio radio = new Radio();
        radio.setCurrentVolume(10);
//        shouldDecreaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
//        Radio radio = new Radio();
        radio.volumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }


    @Test
    void shouldDecreaseVolumeIfMin() {
//        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

}