package ru.netology.radio;

import java.util.Scanner;

public class Radio() {
    int currentVolume;
    Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение управления Volume:");
        String buttonVolume = sc.next();
        sc.close();// fgfd

    public void VolumeUp() {

        if (buttonVolume = +) {
            if (currentVolume < 10) {
                currentVolume = currentVolume + 1;
            }
            ;
        } else {
            if (currentVolume > 0) {
                currentVolume = currentVolume - 1;
            }
        }
    }
}
