package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int salesAmount(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        int average = 0;

        for (int i = 0; i < sales.length; i++) {
            average = salesAmount(sales) / sales.length;
        }
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int lessThanAverage(int[] sales) {
        int less = 0;
        for (int s : sales) {
            if (s < averageAmount(sales)) {
                less = less + 1;
            }
        }
        return less;
    }

    public int aboveThanAverage(int[] sales) {
        int above = 0;
        for (int s : sales) {
            if (s > averageAmount(sales)) {
                above = above + 1;
            }
        }
        return above;
    }
}
