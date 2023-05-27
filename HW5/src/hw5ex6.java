
//Дадени са два масива със стойности {1, 2, 3} и {1, 2, 3}
// да се състави програма,
// която проверява дали масивите са еднакви
public class hw5ex6 {
    public static void main(String[] args) {
        int arrA[] = {1, 2, 3};
        int arrB[] = {1, 2, 3};
        boolean equal = true;
        if (arrA.length==arrB.length) {
            System.out.println("The two arrays have equal lengths!");
            for (int i=0;i<arrA.length;i++) {
                if (arrA[i]==arrB[i]){
                    equal=true;
                }
                else equal=false;
            }
            if (equal){
                System.out.println("And each two array elements are also equal!");
            }
            else System.out.println("But not each two array elements are equal!");
        }
        else System.out.println("The two arrays have not equal lengths!");
    }
}

