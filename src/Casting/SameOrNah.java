package Casting;

public class SameOrNah implements ScannerFactory {
    public void twoWords() {
        System.out.println("Enter a word: ");
        String first = scanner.nextLine();
        System.out.println("Enter another word: ");
        String second = scanner.nextLine();

        if (first.equals(second)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("THe words are different");
        }
    }

}
