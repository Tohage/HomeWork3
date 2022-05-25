package ru.netology.stats;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class StatsService {

    public static long sumSales(int @NotNull [] salesInMonth) {
        int sumSales = 0;
        for (int sale : salesInMonth) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public static int averageSumSalesAmount(int @NotNull [] salesInMonth) {
        int averageSum = 0;
        for (int sale : salesInMonth) {
            averageSum = averageSum + sale;
        }
        return averageSum / 12;
    }

    public static int numMonthMaxSales(int @NotNull [] salesInMonth) {
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

    public static int numMonthMinSales(int @NotNull [] salesInMonth) {
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

    public static int amountMountSalesBelowAverage(int @NotNull [] salesInMonth) {
        int averageSum = 0;
        int mountSalesBelowAverage = 0;
        int mounth = 0;
        for (int sale : salesInMonth) {
            averageSum = averageSum + sale;
        }
        for (int i = 0; i <=11; i++) {
            if (salesInMonth[i] < averageSum/12) {
                mountSalesBelowAverage = mounth++;
            }
        }
        return mountSalesBelowAverage;
    }

    public static int amountMountSalesAboveAverage(int @NotNull [] salesInMonth) {
        int averageSum = 0;
        int mountSalesAboveAverage = 0;
        int mounth = 0;
        for (int sale : salesInMonth) {
            averageSum = averageSum + sale;
        }
        for (int i = 0; i <=11; i++) {
            if (salesInMonth[i] > averageSum/12) {
                mountSalesAboveAverage = mounth++;
            }
        }
        return mountSalesAboveAverage;
    }
}
