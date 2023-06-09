import java.util.Scanner;

public class HT1 {
//     1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 1 + 2 + 3 1*2*3
public static void main(String[] args) {
Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите n: ");
        int n = sc.nextInt();
        int triangle = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            triangle=triangle+i;
            factorial=factorial*i;

        }
        System.out.print("Треугольное число равно: ");
        System.out.println(triangle);
        System.out.print("Факториал равен: ");
        System.out.println(factorial);
}
}
