package ru.netology.sqr;

public class SQRService {
    public int calculate(int from, int before) {

        int sum = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= from && i * i <= before) {
                sum = sum + 1;
            }
        }
        return sum;
    }
}
