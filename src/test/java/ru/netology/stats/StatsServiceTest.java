package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindSum() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.getDataSum(data);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageValue() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageValue = 15;
        int actualAverageValue = service.getAverageValue(data);

        Assertions.assertEquals(expectedAverageValue, actualAverageValue);

    }

    @Test
    public void shouldFindMaxSum() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSum = 8;
        int actualMaxSum = service.getMaxSum(data);

        Assertions.assertEquals(expectedMaxSum, actualMaxSum);
    }

    @Test
    public void shouldFindMinSum() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSum = 9;
        int actualMinSum = service.getMinSum(data);

        Assertions.assertEquals(expectedMinSum, actualMinSum);
    }

    @Test
    public void shouldListLowAverageValue() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedListLowAverageValue = 5;
        int actualListLowAverageValue = service.getListLowAverageValue(data);

        Assertions.assertEquals(expectedListLowAverageValue, actualListLowAverageValue);
    }

    @Test
    public void shouldListHiAverageValue() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedListHiAverageValue = 5;
        int actualListHiAverageValue = service.getListHiAverageValue(data);

        Assertions.assertEquals(expectedListHiAverageValue, actualListHiAverageValue);
    }
}
