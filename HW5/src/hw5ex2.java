import java.util.Scanner;
//Да се състави метод,
// който приема като аргументи две числа
// и връща тяхното средноаритметично.
public class hw5ex2 {
    static void midOfTwo() {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = 0;
        c=(a+b)/2;
        System.out.println("The arithmetic average of "+a+" and "+b+" is "+c);
    }
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        midOfTwo();
    }
}
