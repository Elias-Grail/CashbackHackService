package ru.netology.service;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void negativeValue() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1001;
        int actual = service.remain(-1);

        assertEquals(expected, actual);

    }

    @Test
    public void zeroValue() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(expected, actual);

    }

    @Test
    public void valueOne() {

        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);

        assertEquals(expected, actual);

    }

    @Test
    public void middleValue() {

        CashbackHackService service = new CashbackHackService();

        int expected = 501;
        int actual = service.remain(499);

        assertEquals(expected, actual);

    }

    @Test
    public void valueNineHundredNinetyNine() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(expected, actual);

    }

    @Test
    public void valueOneThousand() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);

    }

    @Test
    public void valueOneThousandOne() {

        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(expected, actual);

    }

}
