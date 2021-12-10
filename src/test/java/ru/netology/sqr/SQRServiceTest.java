package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void calculate() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int sum = 0;
        int actual = sqrService.calculate(sum);

        assertEquals(expected, actual);

    }
}