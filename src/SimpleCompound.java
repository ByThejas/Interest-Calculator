import java.util.Scanner;
public class SimpleCompound{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Select the interest type you need to calculate-\n1.Simple Interest\n2.Compound interest\n");
    System.out.print("Choose the Option 1 or Option 2: \n");
    int choice = scanner.nextInt();
    if(choice == 1){
        SimpleInt();
    }
    else if (choice == 2){
        CompoundInt();
    }
    else{
        System.out.println("Error");
    }
//    System.out.print("Do you want to calculate again-\n1.Yes\n2.No\n");
//    System.out.print("Choose the option 1 or option 2: \n");
//    int repatProcess = scanner.nextInt();

}
public static void SimpleInt(){
    Scanner scanner = new Scanner(System.in);
   double principal;
   double rate;
   int time;
    System.out.println("YOU ARE NOW CALCULATING SIMPLE INTEREST");

    System.out.print("Enter the Principal Amount: \n");
    principal = scanner.nextDouble();
    System.out.print("Enter the Rate of Interest: \n");
    rate = scanner.nextDouble();
    System.out.print("Enter the Time in Years: \n");
    time = scanner.nextInt();

    double simpInt = principal*rate*time/100;
    System.out.printf("Simple interest is: %.2f\n", simpInt);

    double finalAmt = principal + simpInt;
    System.out.printf("Final Amount is: %.2f\n", finalAmt);
}

public static void CompoundInt(){
    Scanner scanner = new Scanner(System.in);
    double principal;
    double rate;
    int time;
    int number;

    System.out.println("YOU ARE NOW CALCULATING COMPOUND INTEREST");

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

    System.out.printf("Final amount is:%.2f\n" , principalMul);

    double compoundInt = principalMul - principal;

    System.out.printf("Compound interest is:%.2f\n" , compoundInt );

    scanner.close();
}
}
