package HW2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, -4, 8, 90, 0, 3, 65};
        pigeonSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(countEvens(array));
        System.out.println(countDifference(array));
        System.out.println(checkZeroes(array));
    }

    private static void pigeonSort(int[] arr) {
        if (arr.length > 1) {
            int min = getMin(arr), max = getMax(arr);

            int[] matches = new int[max - min + 1];
            for (int i : arr) {
                matches[i - min]++;
            }

            int matchesIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                while (matches[matchesIndex] == 0) {
                    matchesIndex++;
                }
                arr[i] = min + matchesIndex;
                matches[matchesIndex]--;
            }
        }
    }

    private static int countEvens(int[] arr) {
        int counter = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int countDifference(int[] arr) {
        return getMax(arr) - getMin(arr);
    }

    private static int getMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            min = Math.min(min, i);
        }
        return min;
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    private static boolean checkZeroes(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
