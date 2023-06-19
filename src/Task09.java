//Задание 9
//Проверить, имеет ли число вещественную часть. Например, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5.0
//и 10.0 – нет.
//Задание 9
//Проверить, имеет ли число вещественную часть. Например, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5.0
//и 10.0 – нет.
import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        double num = in.nextDouble();
        if (num%1==0) System.out.println("Число не имеет вещественной части");
        else System.out.println("Число имеет вещественную часть");
        System.out.println(num);
    }

    }