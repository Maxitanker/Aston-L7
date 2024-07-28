//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        sumCheck(1, 11);
        negativePositiveNumberCheck(-1);
        negativeNumberCheck(20);
        printMultiple("Java", 5);
        yearCheck(2024, true);
        arrayInverter();
        arrayHundred();
        arrayMult();
        cornerArrays();
        customArray(6,10);
    }

    public static void printThreeWords()
    {
        System.out.println("Print Method 1 - printThreeWords():");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }
    public static void checkSumSign()
    {
        System.out.println("Print Method 2 - checkSumSign():");
        int a=42,b=69;
        int c= a + b;
        if (c>=0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
        System.out.println();
    }
    public static void printColor()
    {
        System.out.println("Print Method 3 - printColor():");
        int value=101;
        if (value <=0)
            System.out.println("Красный");
        else if (value >0 && value<=100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
            System.out.println();
    }
    public static void compareNumbers()
    {
        System.out.println("Print Method 4 - compareNumbers():");
        int a=1;
        int b=2;
        if (a>=b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
            System.out.println();
    }
    public static void sumCheck(int a, int b)
    {
        System.out.println("Print Method 5 - sumCheck():");
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
            System.out.println();
    }
    public static void negativePositiveNumberCheck(int number)
    {
        System.out.println("Print Method 6 - negativeNumberCheck():");
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
            System.out.println();
    }
    public static boolean negativeNumberCheck(int number)
    {
        System.out.println("Print Method 7 - negativeNumberCheck():");
        System.out.println();
        return (number >= 0);
    }
    public static void printMultiple(String str, int a) {
        System.out.println("Print Method 8 - printMultiple():");
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
            System.out.println();
    }
    public static boolean yearCheck(int year, boolean b) {
        System.out.println("Print Method 9 - yearCheck():");
        System.out.println();
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void arrayInverter() {
        System.out.println("Print Method 10 - arrayInverter():");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++)
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }

        System.out.println("Измененный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void arrayHundred() {
        System.out.println("Print Method 11 - arrayHundred():");
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Измененный массив ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void arrayMult() {
        System.out.println("Print Method 12 - arrayMult():");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Измененный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void cornerArrays() {
        System.out.println("Print Method 13 - arrayHundred():");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            matrix[i][i] = 1;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
             }
            System.out.println();
        }
        System.out.println(" ");
    }
    public static void customArray(int len, int initialValue) {
        System.out.println("Print Method 14 - customArray():");
        int[] resultArray = new int [len];
        for (int num : resultArray) {
            num = initialValue;
            System.out.print(num + " ");
        }
    }
}