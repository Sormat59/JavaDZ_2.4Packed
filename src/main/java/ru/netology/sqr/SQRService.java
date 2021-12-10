package ru.netology.sqr;

public class SQRService {
    public int calculate(int sum) // какие параметры указывать в методе? Я не понимаю.
    {
        sum = 0;
            for (int i = 10; i < 100; i++) {
            if (i * i >= 200 && i * i <= 300) {
               sum = sum + 1;
            }
        }
        return sum;
    }
}
