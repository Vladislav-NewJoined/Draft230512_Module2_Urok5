import java.util.Arrays;
import java.util.Scanner;

public class Draft1_Task2_5_1 {

    //        Пример 1 ППППППППППППППППППППППППППППППППППП  УДАЛСЯ ОКОНЧАТЕЛЬНО !!!!!!!!!!!!!!!!!!
    public static void main(String[] args) {
        System.out.println("Задание: \n1.\tПользователь вводит 10 чисел, сохраните их в массив\n\nРешение: ");
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите 10 целых чисел, разделителем является нажатие Enter: ");

        int[] a = new int[10];
//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//        a[3] = 4;
//        a[4] = 5;
//        a[5] = 6;
//        a[6] = 7;
//        a[7] = 8;
//        a[8] = 9;
//        a[9] = 10;

        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
            /*System.out.println(a[i]);*/
        }
        System.out.println();
        System.out.println("Вы ввели 10 чисел. Они сохранены в следующий массив: ");
        System.out.println(Arrays.toString(a));
    }
//        Конец Примера 1 КККККККККККККККК

}
