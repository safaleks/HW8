package ru.netology.radio;

public class Radio {
    private  int currentVolume = 5;
    private int maxVolume = 10;
    private int minVolume = 0;

    private int currentStation = 5;
    private int maxStation = 9;
    private int minStation = 0;


    public int changeTheStationByRemoteControl(int intendedStation) {
        if (intendedStation <= maxStation && intendedStation >= minStation) {
            currentStation = intendedStation;
        }
        return currentStation;
    }


    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation += 1;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation -= 1;
        }
    }


    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;

        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }
}