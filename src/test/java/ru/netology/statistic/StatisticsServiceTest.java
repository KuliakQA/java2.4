package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.statistic.StatisticsService;
import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void sumAllSales() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumAllSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageSales() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maxSalesMonth() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSalesAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minSalesMonth() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsBelowAverageSales() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsBelowAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsAboveAverageSales() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsAboveAverageSales(sales);
        assertEquals(expected, actual);
    }

}