import java.util.Scanner;

public class HW4 {
    //Въведете 3 променливи от клавиатурата – брой работни часове (целочислен тип), сума пари (число
    //с плаваща запетая), дали е почивен ден – булев тип. Съставете програма, която взема решения на базата на тези данни по следния начин:
    //ако не е почивен ден ще работя
    //ако имам пари и е почивен ден ще отида на кино
    //ако нямам – ще стоя вкъщи и ще гледам телевизия
    //ако е почивен ден
    //ако имам по-малко от 10 лв ще отида за сладолед
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workingH = Integer.parseInt(scanner.nextLine()); //не се ползва за нищо...
        double sumM = Double.parseDouble(scanner.nextLine());
        boolean hollyDay = Boolean.parseBoolean(scanner.nextLine());
        if (hollyDay){
            if (sumM>=10){
                System.out.println("I will go to the cinema!");
            }
            else if ((sumM>0)&&(sumM<10)){
                System.out.println("I will go for ice cream!");
            }
            else System.out.println("I will stay at home to watch TV!");
        }
        else System.out.println("I will go to work for "+workingH+" h.!");
    }
}
