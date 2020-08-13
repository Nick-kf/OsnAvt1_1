package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackerServiceTest {

CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
  public void shouldCalculateBonus0() {
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateBonus900() {
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateBonus1000() {
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateBonus1100() {
        int amount = 1100;
        int actual = cashbackHackService.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);
    }

}