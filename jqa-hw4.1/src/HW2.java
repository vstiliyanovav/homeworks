import java.util.Scanner;

public class HW2 {
    //Задача 2:
    //Въведете 4 различни числа от конзолата и разменте стойността им две по две.
    // Нека числата бъдат от различен тип (int и duoble).
    // Разпечатайте новите им стойности.
    // Направете кастване (casting) конвертиране на числата веднъж от int to double и после от double to int и
    // след всяко конвертиране изведете сумата им
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        //int c = Integer.parseInt(scanner.nextLine());
        //double d = Double.parseDouble(scanner.nextLine());
        int tempA = a;
        a = (int) b;
        b = (double) a;
        System.out.println("new a = "+a+", New b = "+b+". The sum is "+(a+b));




    }
}
