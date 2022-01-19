package ru.netology.sqrs;

public class SQRService {

    public int numbSqrs (int min, int max){

        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                counter++;
            }
        }
        return counter;
    }
}
