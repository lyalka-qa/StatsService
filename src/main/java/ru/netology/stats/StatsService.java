package ru.netology.stats;

public class StatsService {

    public int calcSumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAverageSumSales(long[] sales) {
        return calcSumSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int amountOfMonthSalesLowerAverage(long[] sales) {
        int monthCounter = 0;
        int averageSumSales = calcSumSales(sales) / sales.length;
        for (long sale : sales) {
            if (sale < averageSumSales) {
                monthCounter = monthCounter + 1;
            }
        }
        return monthCounter;

    }

    public int amountOfMonthSalesHigherAverage(long[] sales) {
        int monthCounter = 0;
        int averageSumSales = calcSumSales(sales) / sales.length;
        for (long sale : sales) {
            if (sale > averageSumSales) {
                monthCounter = monthCounter + 1;
            }
        }
        return monthCounter;

    }
}
