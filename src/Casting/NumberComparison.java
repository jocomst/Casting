package Casting;

public class NumberComparison implements ScannerFactory {

    public void compare() {
        System.out.println("Enter a number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int second = Integer.valueOf(scanner.nextLine());

        if (first == second) {
            System.out.println("Numbers are the same");
        } else if (first > second) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }

    }

}
