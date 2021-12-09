package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void calculate() {
        SQRService sqrService = new SQRService();
        int num = 300;
        int expected = 3;
        int actual = sqrService.calculate(num);

        assertEquals(expected, actual);

    }
}