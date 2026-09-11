package oop.assigment_problems;

public class PrintNumbers {

    public static void printNumbersUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbersUpToN(5);
    }
}
