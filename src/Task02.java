//Задание 2
//В переменной n хранится натуральное (целое) трехзначное число. Создайте программу,
// вычисляющую и выводящую на экран сумму цифр числа n
public class Task02 {
    public static void main(String[] args) {
        int n=234;
        int n1,n2,n3;
        n1 = n/100;
        n2 = (n-n1*100)/10;
        n3 = n-n1*100-n2*10;
        System.out.println("Сумма цифр числа 234 "+(n1+n2+n3));
    }
}
