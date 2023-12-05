package ru.netology.javamaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void selectRadioStation() {
        Radio radio = new Radio();

        radio.currentRadioStationNumber = 5;

        int expected = 5;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void selectMaxRadioStation() {
        Radio radio = new Radio();

        radio.setToMaxRadioStation();

        int expected = 9;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectNextMaxRadioStation() {
        Radio radio = new Radio();

        radio.currentRadioStationNumber = 9;

        radio.nextMax();

        int expected = 0;
        int actual = radio.currentRadioStationNumber;
    }

    @Test
    public void selectNextRadioStation() {
        Radio radio = new Radio();

        radio.next();

        int expected = 1;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void selectPrevMinRadioStation() {
        Radio radio = new Radio();

        radio.prevMin();

        int expected = 9;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void selectPrevRadioStation() {
        Radio radio = new Radio();

        radio.currentRadioStationNumber = 9;

        radio.prev();

        int expected = 8;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeNext() {
        Radio radio = new Radio();

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();

        radio.currentVolume = 100;

        radio.increaseVolumePlus();

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMin() {
        Radio radio = new Radio();

        radio.currentVolume = 0;

        radio.increaseVolumeMinus();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
