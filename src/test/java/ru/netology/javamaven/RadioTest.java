package ru.netology.javamaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void radioChannelNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        radio.next();
        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioChannelNextNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioChannelPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioChannelPrevNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectRadioStationLowerMinusOne() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectRadioStationLowerNull() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectRadioStationLowerOne() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectRadioStationUpper() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectRadioStationUpperNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectRadioStationUpperTen() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    // .....
    @Test
    public void selectVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(45);

        int expected = 45;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectVolumeLowerMinusOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectVolumeLowerNull() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectVolumeLowerOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectVolumeUpper() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectVolumeUpperNineOneHundred() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectVolumeUpperTenOneHundredAndOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


//    @Test
//    public void selectRadioStation() {
//        Radio radio = new Radio();
//
//        radio.currentRadioStationNumber = 5;
//
//        int expected = 5;
//        int actual = radio.currentRadioStationNumber;
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public  void selectMaxRadioStation() {
//        Radio radio = new Radio();
//
//        radio.setToMaxRadioStation();
//
//        int expected = 9;
//        int actual = radio.currentRadioStationNumber;
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void selectNextMaxRadioStation() {
//        Radio radio = new Radio();
//
//        radio.currentRadioStationNumber = 9;
//
//        radio.nextMax();
//
//        int expected = 0;
//        int actual = radio.currentRadioStationNumber;
//    }
//
//    @Test
//    public void selectNextRadioStation() {
//        Radio radio = new Radio();
//
//        radio.next();
//
//        int expected = 1;
//        int actual = radio.currentRadioStationNumber;
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public  void selectPrevMinRadioStation() {
//        Radio radio = new Radio();
//
//        radio.prevMin();
//
//        int expected = 9;
//        int actual = radio.currentRadioStationNumber;
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public  void selectPrevRadioStation() {
//        Radio radio = new Radio();
//
//        radio.currentRadioStationNumber = 9;
//
//        radio.prev();
//
//        int expected = 8;
//        int actual = radio.currentRadioStationNumber;
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void increaseVolumeNext() {
//        Radio radio = new Radio();
//
//        radio.increaseVolume();
//
//        int expected = 1;
//        int actual = radio.currentVolume;
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void increaseVolumeMax() {
//        Radio radio = new Radio();
//
//        radio.currentVolume = 100;
//
//        radio.increaseVolumePlus();
//
//        int expected = 100;
//        int actual = radio.currentVolume;
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void increaseVolumeMin() {
//        Radio radio = new Radio();
//
//        radio.currentVolume = 0;
//
//        radio.increaseVolumeMinus();
//
//        int expected = 0;
//        int actual = radio.currentVolume;
//
//        Assertions.assertEquals(expected, actual);
//    }
}
