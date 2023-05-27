import java.util.Scanner;

public class HW3 {
    //Въведете 3 числа от клавиатурата ч1, ч2 и ч3.
    // Разменете стойностите им така, че ч1 да има стойността на ч2, ч2 да има стойността на ч3, а ч3 да има старатастойност на ч1.
    // Съберете ч1 и ч2 и след това намерете разликата между получения сбор и ч3.
    // Разпечатете стойностите на числата на етапи
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        System.out.println("new n1 = "+n2+", the new n2 = "+n3+", and the new n3 = "+n1);
        System.out.println("the sum of n1 and n2 is "+(n2+n3)+", and the final result is = "+(n2+n3+n1));
        //second variant:
        int temp = n1;
        n1=n2;
        System.out.println("new n1 = "+n1);
        n2=n3;
        System.out.println("new n2 = "+n2);
        n3=temp;
        System.out.println("new n3 = "+n3);
        System.out.println("the sum of n1 and n2 is "+(n1+n2));
        System.out.println("the final result is = "+(n1+n2+n3));
    }
}
