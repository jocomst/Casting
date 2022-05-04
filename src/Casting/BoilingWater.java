package Casting;

public class BoilingWater implements ScannerFactory {

    public void isBurning() {
        System.out.println("Enter a number greater than 212:");
        int temp = Integer.valueOf(scanner.nextLine());
        if (temp > 212) {
            System.out.println("Water is boiling!");
        }
    }
}
