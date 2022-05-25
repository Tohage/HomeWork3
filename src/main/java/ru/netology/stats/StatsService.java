package ru.netology.stats;

public class StatsService {

    public static long sumSales(int[] salesInMonth) {
        int sumSales = 0;
        for (int sale : salesInMonth) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public static long averageSalesAmount(int[] salesInMonth) {
        long average = sumSales(salesInMonth) / 12;
        return average;
    }

    public static int numMonthMaxSales(int[] salesInMonth) {
        int maxSales = 0;
        int month = 0;
        for (long sale : salesInMonth) {
            if (sale >= salesInMonth[maxSales]) {
                maxSales = month;
            }
            month = month + 1;
        }
        return maxSales + 1;
    }

    public static int numMonthMinSales(int[] salesInMonth) {
        int minMonth = 0;
        int month = 0;
        for (long sale : salesInMonth) {
            if (sale <= salesInMonth[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public static int amountMountSalesBelowAverage(int[] salesInMonth) {
        long average = sumSales(salesInMonth) / 12;
        int mountSalesBelowAverage = 0;
        int mounth = 0;
        for (int i = 0; i <= 11; i++) {
            if (salesInMonth[i] < average) {
                mountSalesBelowAverage = mounth++;
            }
        }
        return mountSalesBelowAverage;
    }

    public static int amountMountSalesAboveAverage(int[] salesInMonth) {
        long average = sumSales(salesInMonth) / 12;
        int mountSalesAboveAverage = 0;
        int mounth = 0;
        for (int i = 0; i <= 11; i++) {
            if (salesInMonth[i] < average) {
                mountSalesAboveAverage = mounth++;
            }
        }
        return mountSalesAboveAverage;
    }
}
