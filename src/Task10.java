//Задание 10
//Написать программу расчета идеального веса к росту. В
//константах хранятся рост (height) и вес (weight). Вывести на
//консоль сообщение, сколько килограмм нужно набрать или
//сбросить (идеальный вес = рост - 110).

public class Task10 {
    public static void main(String[] args) {
        final double height = 176;
        final double weight = 96.0;
        double weightIdeal = height - 110;
        if (weightIdeal > weight)
            System.out.println("Для достижения идеального веса Вам нужно набрать " + (weightIdeal-weight)+ "кг");
        else System.out.println("Для достижения идеального веса Вам нужно сбросить " + (weight-weightIdeal)+ " кг");
    }
}