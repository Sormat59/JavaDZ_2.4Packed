package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldCalculateTotalRange() {
        SQRService sqrService = new SQRService();
        int from = 200;
        int before = 300;
        int expected = 3;
        int actual = sqrService.calculate(from, before);

        assertEquals(expected, actual);

    }


    @Test
    void shouldCalculateBoundariesFrom() {
        SQRService sqrService = new SQRService();
        int from = 100;
        int before = 102;
        int expected = 1;
        int actual = sqrService.calculate(from, before);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateBoundariesBefore() {
        SQRService sqrService = new SQRService();
        int from = 9800;
        int before = 9900;
        int expected = 1;
        int actual = sqrService.calculate(from, before);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxRange() {
        SQRService sqrService = new SQRService();
        int from = 0;
        int before = 10000;
        int expected = 90;
        int actual = sqrService.calculate(from, before);

        assertEquals(expected, actual);
    }
}