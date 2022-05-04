package Casting;

public class TestScores implements ScannerFactory {
    public void grades() {
        System.out.println("Name a number between 0 and 100");
        int num = Integer.valueOf(scanner.nextLine());
        if (num <= 100 && num >= 90) {
            System.out.println("Your grade is an A :)");
        } else if (num < 90 && num >= 80) {
            System.out.println("Your grade is a B :)");
        } else if (num < 80 && num >= 70) {
            System.out.println("Your grade is a C :/");
        } else if (num < 70 && num >= 60) {
            System.out.println("Your grade is a D :/");
        } else if (num < 60) {
            System.out.println("Your grade is an F :(");
        }
    }
}
