package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {

        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int amount = 999;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void testRemainFell() {

        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

}