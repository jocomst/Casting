package Casting;

public class Calculations implements ScannerFactory {

    public void doCalcs() {
        System.out.println("Enter a number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println(first + " * " + second + " = " + (first * second));
        System.out.println(first + " / " + second + " = " + ((double) first / (double) second));
        System.out.println(first + " % " + second + " = " + (first % second));


    }
}
