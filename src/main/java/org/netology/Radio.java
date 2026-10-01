package org.netology;

public class Radio {
    private int currentRadioStation;
    private int stationCount;
    private int currentVolume;

    public Radio() {
        stationCount = 10;
    }

    public Radio(int stationCount) {
        this.stationCount = stationCount;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation >= stationCount) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        if (currentRadioStation == stationCount - 1) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation++;
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = stationCount - 1;
            return;
        }
        currentRadioStation--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
