import java.util.Scanner;
public class TipCalcRunner {
    public static void main(String[] args) {

        // asking user for information
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("What was the total bill today? ");
        double totalBill = scan.nextDouble();
        System.out.print("What is the tip percentage? (As a decimal!): ");
        double tipDecimal = scan.nextDouble();
        System.out.print("How many people in your party this fine day? ");
        int numPeople = scan.nextInt();

        TipCalc calc = new TipCalc(numPeople, tipDecimal);
        calc.addMeal(totalBill);

        // printing results
        System.out.println();
        System.out.printf("Total tip amount: $%.2f\n", calc.tipAmount());
        System.out.printf("Total bill including tip: $%.2f\n", calc.totalBill());
        System.out.printf("Tip per person: $%.2f\n", calc.perPersonTipAmount());
        System.out.printf("Total per person: $%.2f\n", calc.perPersonTotalCost());
    }
}
