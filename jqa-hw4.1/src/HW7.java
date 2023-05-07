public class HW7 {
    //Да се изведат числата от 1 до 100 без числата от 54 до 74.
    // След извършените операции да се отпечатат получените резултати. (hint - continue)
    public static void main(String[] args) {
        int i = 0;
        for(i=1;i<101;i++){
            if ((i > 74) || (i < 54)) {
                System.out.println(i);
            }
        }
    }
}
