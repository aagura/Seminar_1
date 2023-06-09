import java.util.Scanner;


      //     Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
    //    например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
    // Предложить хотя бы одно решение или сообщить, что его нет.
// Под знаком вопроса - одинаковые цифры
// Введите уравнение: ?? + ?? = 44
// Ответ: 22 + 22 = 44

public class HT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите уравнение: ");
        String equation = scanner.nextLine();

        String solution = solveEquation(equation);

        if (solution != null) {
            System.out.println("Ответ: " + solution);
        } else {
            System.out.println("Нет решения");
        }
    }

    public static String solveEquation(String equation) {
        String solution = null;

        for (int i = 0; i < 10; i++) {
            String equationWithDigits = equation.replace("?", String.valueOf(i));
            String[] parts = equationWithDigits.split("[+=]");
            int q = Integer.parseInt(parts[0].trim());
            int w = Integer.parseInt(parts[1].trim());
            int e = Integer.parseInt(parts[2].trim());

            if (q + w == e) {
                solution = q + " + " + w + " = " + e;
                break;
            }
        }

        return solution;
    }
}
