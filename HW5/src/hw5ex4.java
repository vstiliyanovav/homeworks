import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

//Напишете програма, която създава масив с 10 елемента от тип int
// и обходете масива:
//1) с помоща на for loop
//2) с помоща на while loop
//Да се изведат елементите на екрана.
public class hw5ex4 {
    static void arrayOfTen() {
        Scanner scanner = new Scanner(System.in);
        int[] intNewArray = new int[4];
        int i = 0;
        for (i = 0; i < intNewArray.length; i++) {
            intNewArray[i] = Integer.parseInt(scanner.nextLine());
        }
        i=0;
        while (i < intNewArray.length) {
            System.out.println(intNewArray[i]);
            i++;
        }
    }
    public static void main(String[] args) {
        arrayOfTen();
    }
}