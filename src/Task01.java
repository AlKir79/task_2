//Задание 1
//В переменных х и y хранятся два натуральных числа. Создайте программу, выводящую на консоль:
//- результат целочисленного деления x на y;
//- остаток от деления x на y;
//- квадратный корень x
public class Task01 {
    public static void main(String[] args) {
        int x = 121;
        int y = 23;
        System.out.println("x=121    y=23");
        System.out.println("Целочисленное деление x на y "+x/y);
        System.out.println("Остаток от деления x на y "+x%y);
        System.out.println("Квадратный корень из x "+Math.sqrt(x));
        System.out.println("Квадратный корень из y "+Math.sqrt(y));
    }

}
