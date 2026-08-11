import java.util.Scanner;
class SimpleCompound {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        int again;
        do {
            System.out.print("\nSelect the interest type you need to calculate:\n1.Simple Interest\n2.Compound interest\n");
            System.out.print("Choose the Option 1 or Option 2: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                calc.simpleInterest();
            } else if (choice == 2) {
                calc.compoundInterest();
            } else {
                System.out.println("Error");
            }
            System.out.print("\nDo you want to calculate again: \n1.Yes \n2.No\nChoose your option: ");
            again = scanner.nextInt();
        }while(again == 1);
    }
}

class Calculator{
    public static void simpleInterest(){
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int time;
        System.out.println("\nYOU ARE NOW CALCULATING SIMPLE INTEREST");

        System.out.print("Enter the Principal Amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        rate = scanner.nextDouble();
        System.out.print("Enter the Time in Years: ");
        time = scanner.nextInt();

        double simpInt = principal*rate*time/100;
        System.out.printf("\nSimple interest is: %.2f\n", simpInt);

        double finalAmt = principal + simpInt;
        System.out.printf("Final Amount is: %.2f\n", finalAmt);
    }

    public static void compoundInterest(){
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int time;
        int number;

        System.out.println("\nYOU ARE NOW CALCULATING COMPOUND INTEREST");

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        rate = scanner.nextDouble();
        System.out.print("Enter the number of times the Interest have compunded: ");
        number = scanner.nextInt();
        System.out.print("Enter the time in years: ");
        time = scanner.nextInt();

        double pconv = rate/100;

        double first = pconv/number;
        double second = 1 + first;
        double exp = number*time;
        double power = Math.pow(second, exp);
        double principalMul = principal * power;

        System.out.printf("\nFinal amount is:%.2f\n" , principalMul);

        double compoundInt = principalMul - principal;

        System.out.printf("Compound interest is:%.2f\n" , compoundInt );
    }
}

