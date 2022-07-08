package ru.netology.stats;

public class StatsService {

    // Сумма продаж
    public int salesSum(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    // Средняя сумма продаж в месяц
    public  int averageSales(int[]sales) {
        int monthSales = salesSum(sales) / sales.length;
        return monthSales;
    }

    // Номер месяца, в котором был пик продаж
    public int maxSalesMonth(int[]sales) {
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

    /*
    public long maxSalesMonth(long[]sales) {
        long maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }
     */

    // Номер месяца, в котором был минимум продаж
    public int minSalesMonth(int[]sales) {
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

    // Кол-во месяцев, в которых продажи были ниже среднего
    public int monthBelowAverageSales(int[]sales) {
        int monthBelow = 0;
        int average = averageSales(sales);

        for (int sale : sales) {
            if (sale < average) {
                monthBelow = monthBelow + 1;
            }
        }
        return monthBelow;
    }

    // Кол-во месяцев, в которых продажи были выше среднего
    public  int monthAboveAverageSales(int[]sales) {
        int monthAbove = 0;
        int average = averageSales(sales);

        for (int sale : sales) {
            if (sale > average) {
                monthAbove = monthAbove + 1;
            }
        }
        return monthAbove;
    }
}



