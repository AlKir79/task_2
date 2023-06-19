//Задание 7
//Разработать программу, которая позволит при известном
//годовом проценте вычислить сумму вклада в банке через
//два года, если задана исходная величина вклада.
public class Task07 {
    public static void main(String[] args) {
    double perc = 12.5;
    double money = 100;
    for (int i=0;i<2;i++) {
        money=money+(money*perc/100);
    }
    System.out.println("Сумма накоплений за 2 года при проценте "+ perc+" и первоначальной сумме 100 равна "+ Math.round(money));
    }
}
