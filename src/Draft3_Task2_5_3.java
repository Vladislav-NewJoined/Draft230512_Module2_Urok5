import java.util.Arrays;

public class Draft3_Task2_5_3 {

    //        Пример 2 ППППППППППППППППППППППППППППППППППП  УДАЛСЯ ОКОНЧАТЕЛЬНО !!!!!!!!!!!!!!!!!!
    public static void main(String[] args) {
        System.out.println("Задание: \n3.\tСохраните 10 строк в массив, выведите с конца каждую вторую\n\nРешение: ");


        System.out.println("Сохраняем 10 строк в массив: ");
        String[] a = new String[10];
//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        a[0] = "Строка один";
        a[1] = "Строка два";
        a[2] = "Строка три";
        a[3] = "Строка четыре";
        a[4] = "Строка пять";
        a[5] = "Строка шесть";
        a[6] = "Строка семь";
        a[7] = "Строка восемь";
        a[8] = "Строка девять";
        a[9] = "Строка десять";

        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println("Выводим с конца каждую вторую");

        for (int i = 8; i >= 0; i = i - 2) {
            System.out.println(a[i]);
        }
    }
//        Конец Примера 2 КККККККККККККККК











//    //        Пример 1 ППППППППППППППППППППППППППППППППППП  УДАЛСЯ ОКОНЧАТЕЛЬНО !!!!!!!!!!!!!!!!!!
//    public static void main(String[] args) {
//        System.out.println("Задание: \n2.	Сохраните 10 чисел в массив, выведите их с конца\n\nРешение: ");
//
////        int[] a = new int[10];
//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
////        a[0] = 1;
////        a[1] = 2;
////        a[2] = 3;
////        a[3] = 4;
////        a[4] = 5;
////        a[5] = 6;
////        a[6] = 7;
////        a[7] = 8;
////        a[8] = 9;
////        a[9] = 10;
//
//        for (int i = 9; i >= 0; i--) {
//            System.out.println(a[i]);
//        }
//    }
////        Конец Примера 1 КККККККККККККККК

}