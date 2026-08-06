import java.util.Scanner;
public class temp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int initTemp;
        char temp;
        char finalTemp;
        System.out.print("Enter the temprature: ");
        initTemp = scanner.nextInt();
        System.out.print("Enter the Current temprature:\n1.C\n2.F\n3.K\nChoose the current temprature: ");
        temp = scanner.next().charAt(0);
        temp = Character.toUpperCase(temp);
        System.out.print("\nEnter the Temprature you need to convert to:\n1.C\n2.F\n3.K\nChoose the Temprature: ");
        finalTemp = scanner.next().charAt(0);
        finalTemp = Character.toUpperCase(finalTemp);
        if(temp == 'C' && finalTemp == 'F'){
            Farhanheit();
        } else if (temp == 'C' && finalTemp == 'K') {
            Kelvin();
        }
        else if (temp == 'F' && finalTemp == 'C'){
            Celsius();
        }
        else if (temp == 'F' && finalTemp == 'K'){
            Kelvin();
        }
        else if (temp == 'K' && finalTemp == 'C'){
            Celsius();
        }
        else if (temp == 'K' && finalTemp == 'F'){
            Farhanheit();
        }
    }

    public static void Celsius(){
        System.out.println("This is Celsius");
    }

    public static void Farhanheit(){
        System.out.println("This is Farhanheit");
    }
    public static void Kelvin(){
        System.out.println("This is Kelvin");
    }

}
