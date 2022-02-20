package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {


    @Test
    public void shouldGetMissingAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int expected = 500;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMissingAmountMinBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMissingAmountMaxBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMissingAmountMoreFirstBonusAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;
        int expected = 500;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}
