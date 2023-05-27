import java.util.Scanner;

//Да се прочете масив от екрана с 5 числа по избор от тип double
// и да се отпечатат всички резултати
public class hw5ex3 {
    static void arrayOfDoubles() {
        Scanner scanner = new Scanner(System.in);
        double [] doubleArray = new double[5];
        for (int i=0;i<5;i++){
            doubleArray[i] = Double.parseDouble(scanner.nextLine());
        }
        for (int i=0;i<5;i++)
        System.out.println("The array element with index "+i+" is "+doubleArray[i]);
    }
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        arrayOfDoubles();
    }
}
