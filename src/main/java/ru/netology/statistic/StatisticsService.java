package ru.netology.statistic;

public class StatisticsService {

    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int avgSales = sumAllSales(sales) / sales.length;
        return avgSales;
    }

    public int maxSalesAmount(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsBelowAverageSales(int[] sales) {
        int belowAvgMonth = 0;
        int month = 0;
        int avgSales = sumAllSales(sales) / sales.length;
        for (int sale : sales) {
            if (sale < avgSales) {
                belowAvgMonth += 1;
            }
            month = month + 1;
        }
        return belowAvgMonth;
    }

    public int monthsAboveAverageSales(int[] sales) {
        int aboveAvgMonth = 0;
        int month = 0;
        int avgSales = sumAllSales(sales) / sales.length;
        for (int sale : sales) {
            if (sale > avgSales) {
                aboveAvgMonth += 1;
            }
            month = month + 1;
        }
        return aboveAvgMonth;
    }
}