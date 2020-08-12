package ru.netology.domain;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    void shouldCalculateBonus0() {
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateBonus900() {
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateBonus1000() {
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateBonus1100() {
        int amount = 1100;
        int actual = cashbackHackService.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }
}