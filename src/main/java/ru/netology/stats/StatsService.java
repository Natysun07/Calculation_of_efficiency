package ru.netology.stats;


public class StatsService {
    public int getDataSum(int[] data) {
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }

    public int getAverageValue(int[] data) {
        int sum = getDataSum(data);
        return sum / 12;
    }

    public int getMaxSum(int[] data) {
        int maxSum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= data[maxSum]) {
                maxSum = i;
            }
        }
        return maxSum + 1;
    }

    public int getMinSum(int[] data) {
        int minSum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= data[minSum]) {
                minSum = i;
            }
        }
        return minSum + 1;
    }

    public int getListLowAverageValue(int[] data) {
        int averageValue = getAverageValue(data);
        int listLowAverageValue = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < averageValue) {
                listLowAverageValue++;
            }
        }
        return listLowAverageValue;
    }

    public int getListHiAverageValue(int[] data) {
        int averageValue = getAverageValue(data);
        int listHiAverageValue = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > averageValue) {
                listHiAverageValue++;
            }
        }
        return listHiAverageValue;
    }
}
