package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test                                //номер месяца минимальных продаж
    public void FindMonthOfMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test                                // сумму всех продаж
    public void FindSalesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSalesAmount = 180;
        int actualSalesAmount = service.salesAmount(sales);

        Assertions.assertEquals(expectedSalesAmount, actualSalesAmount);
    }

    @Test                                // среднюю сумму продаж в месяц;
    public void FindaverageAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedaverageAmount = 15;
        int actualaverageAmount = service.averageAmount(sales);

        Assertions.assertEquals(expectedaverageAmount, actualaverageAmount);
    }

    @Test                                //номер месяца максимальных продаж
    public void FindMonthOfMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test                                //продажи были ниже среднего
    public void FindMonthsLessThanAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedLessMonths = 5;
        int actualLessMonths = service.lessThanAverage(sales);

        Assertions.assertEquals(expectedLessMonths, actualLessMonths);

    }

    @Test                                //продажи были выше среднего
    public void FindMonthsAboveThanAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 17, 14, 14, 18};   // тут я заменил одно значение на больше среднего
        int expectedAboveMonths = 6;
        int actualAboveMonths = service.aboveThanAverage(sales);

        Assertions.assertEquals(expectedAboveMonths, actualAboveMonths);
    }
}