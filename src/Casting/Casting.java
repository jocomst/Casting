package Casting;

public class Casting {

    public static void main(String[] args) {
        double dubNum = 112.35;
        int numInt = 12;

        numInt = (int) dubNum;

        System.out.println("Double: " + dubNum);
        System.out.println("int: " + numInt);

        String stringNum = "49";
        int secondNum = Integer.parseInt(stringNum);
        System.out.println("The string value is: " + stringNum);
        System.out.println("The integer value is: " + secondNum);
        Calculations calc = new Calculations();
        calc.doCalcs();
        BoilingWater boil = new BoilingWater();
        boil.isBurning();
        NumberComparison nums = new NumberComparison();
        nums.compare();
        TestScores scores = new TestScores();
        scores.grades();
        SameOrNah nah = new SameOrNah();
        nah.twoWords();


    }
}

