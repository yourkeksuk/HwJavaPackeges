package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqr(10, 99);

        assertEquals(expected, actual);
    }

}
