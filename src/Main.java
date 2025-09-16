public class Main {
    public static void main(String[] args) {

        int intOperandA = 24;
        int intOperandB = 5;
        int intSum, intProduct, intDifference, intQuotient, intModulo;
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo);

        System.out.println();

        double doubleOperandA = 24.0;
        double doubleOperandB = 5.0;
        double doubleSum, doubleProduct, doubleDifference, doubleQuotient;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);

        System.out.println();

        double myLunchCost = 12.50;
        int numberOfKidsInFamily = 0;
        boolean isRaining = false;
        double gasPricePerGallon = 3.59;
        int favoriteNumber = 7;
        double shoeSize = 10.5;
        String birthMonth = "September";
        String fullName = "Jacob Hawrot";

        System.out.println("The cost of my lunch is: " + myLunchCost);
        System.out.println("Number of kids in my family: " + numberOfKidsInFamily);
        System.out.println("Is it raining? " + isRaining);
        System.out.println("Price of a gallon of gas: " + gasPricePerGallon);
        System.out.println("My favorite number: " + favoriteNumber);
        System.out.println("My shoe size: " + shoeSize);
        System.out.println("My birth month: " + birthMonth);
        System.out.println("My full name: " + fullName);
    }
}
