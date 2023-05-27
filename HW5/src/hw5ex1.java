import java.util.Scanner;
//Да се състави метод,
// който приема като аргументи две числа и
// отпечатва на екрана техния сбор.
public class hw5ex1 {
    static void sumOfTwo() {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
    }
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        sumOfTwo();
    }
}