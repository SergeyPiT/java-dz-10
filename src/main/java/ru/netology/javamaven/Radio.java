package ru.netology.javamaven;

public class Radio {
    public int currentRadioStationNumber;
    public int currentVolume;

    public void setToMaxRadioStation() {
        currentRadioStationNumber = 9;
    }

    public void nextMax() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        }
    }

    public void next() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    public void prevMin() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        }
    }

    public void prev() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void increaseVolumePlus() {
        if (currentVolume + 1 >= 100) {
            currentVolume = 100;
        }
    }

    public void increaseVolumeMinus() {
        if (currentVolume - 1 <= 0) {
            currentVolume = 0;
        }
    }


}