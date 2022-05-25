import ru.netology.stats.StatsService;

public class Main {
    StatsService service = new StatsService();

    public static void main(String[] args) {
        int[] salesInMonth = new int[]{8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};

        long sum = StatsService.sumSales(salesInMonth);
        System.out.println("Сумма всех продаж = " + sum + ";");

        long averageSumSales = StatsService.averageSumSalesAmount(salesInMonth);
        System.out.println("Средняя сумма продаж в месяц = " + averageSumSales + ";");

        int maxSales = StatsService.numMonthMaxSales(salesInMonth);
        System.out.println("Номер месяца c пиком продаж - " + maxSales + ";");

        int minSales = StatsService.numMonthMinSales(salesInMonth);
        System.out.println("Номер месяца c минимумом продаж - " + minSales + ";");

        int belowAverage = StatsService.amountMountSalesBelowAverage(salesInMonth);
        System.out.println("Количество месяцев с продажами ниже среднего - " + belowAverage + ";");

        int aboveAverage = StatsService.amountMountSalesAboveAverage(salesInMonth);
        System.out.println("Количество месяцев с продажами выше среднего - " + aboveAverage + ";");
    }

}
