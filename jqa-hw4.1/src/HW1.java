import java.util.Scanner;
public class HW1 {
    //Задача 1:
    //Да се изпишат подканващи съобщения към user, с които да въведе две числа от клавиатурата (тип int или double).
    // След всяко въвеждане числата да бъдат отпечатени с подходящ текст.
    // Да се въведе и 3-то число като се провери дали то е между първото и второто, като се изведе подходящо съобщение.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert two digits:");
        double a=0.00;
        double b=0.00;
        double n=0.00;
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("Your first digit is "+a);
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("Your first digit is "+b);
        System.out.println("Please insert one more digit:");
        n = Double.parseDouble(scanner.nextLine());
        if ((a<n)&&(n<b)){
            System.out.println("The third digit is between the first and the second!");
        } else {
            System.out.println("Your third digit is not the first and the second!");
        }
    }
}