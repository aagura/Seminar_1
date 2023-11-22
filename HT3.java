import java.util.Scanner;

public class HT3 {
    //     Реализовать простой калькулятор (+-/*)
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "cp866");
            System.out.print("Введите 1е число: ");
            int number_1 = sc.nextInt();
            System.out.print("Введите 2е число: ");
            int number_2 = sc.nextInt();
            sc.nextLine();
            System.out.print("Введите действие: ");
            String action = sc.nextLine();
            double result = 0;
            switch (action) {
                case "+":
                result = number_1+ number_2;
                break;
                case "-":
                result = number_1- number_2;
                break;
                case "*":
                result = number_1* number_2;
                break;
                case "/":
                result = number_1/number_2;
                break;
                default:
                System.out.print("Ошибка ввода.");
                break;
            }
            
            String res = number_1 + " " +action + " "  +  number_2 + " = " + result;
            System.out.println(res);
            

    }
}
