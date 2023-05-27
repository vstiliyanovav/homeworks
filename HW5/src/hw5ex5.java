//Да се състави масив със следните стойности {10 12 1 8 4}.
// След създаването на масива да се копират стойностите в нов масив
public class hw5ex5 {
    public static void main(String[] args) {
        int arrA [] = {10, 12, 1, 8,4};
        int arrB [] = arrA;
        int arrC [] = new int[arrA.length];
        for (int i=0;i<arrA.length;i++){
            System.out.println("original A => "+arrA[i]);
        }
        System.out.println("with arrB = arrA and arrB[i]++:");
        for (int i =0;i<arrA.length;i++){
            arrB[i]++;
            System.out.println("new A => "+arrA[i]+" --- because B => "+arrB[i]);
        }
        System.out.println("with arrC[i] = arrA[i]:");
        for (int i=0;i<arrA.length;i++){
            arrC[i]=arrA[i];
            System.out.println("new A => "+arrA[i]+" --- B => "+arrB[i]+" --- C like copy of new A => "+arrC[i]);
        }
        System.out.println("with arrC[i] = arrA[i]: and arrB[i]--:");
        for (int i=0;i<arrA.length;i++){
            arrB[i]--;
            System.out.println("new new A => "+arrA[i]+" --- because new B => "+arrB[i]+" --- C like copy of new A => "+arrC[i]);
        }

    }
}
