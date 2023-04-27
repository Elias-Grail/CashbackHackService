package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {


    @Test
    void negativeValue() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1001;
        int actual = service.remain(-1);

        assertEquals(actual, expected);

    }

    @Test
    void zeroValue() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);

    }

    @Test
    void valueOne() {

        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);

        assertEquals(actual, expected);

    }

    @Test
    void middleValue() {

        CashbackHackService service = new CashbackHackService();

        int expected = 501;
        int actual = service.remain(499);

        assertEquals(actual, expected);

    }

    @Test
    void valueNineHundredNinetyNine() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(actual, expected);

    }

    @Test
    void valueOneThousand() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);

    }

    @Test
    void valueOneThousandOne() {

        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(actual, expected);

    }
}