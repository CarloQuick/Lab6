import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Subtracting two numbers (first value - second value)");
        System.out.print("\nEnter your 1st Value! ");
        int val1 = scnr.nextInt();

        System.out.print("\nEnter your 2nd Value! ");
        int val2 = scnr.nextInt();

        int difference = val1 - val2;

        System.out.println(val1 + " - " + val2 + " = " + difference);
    }
}
