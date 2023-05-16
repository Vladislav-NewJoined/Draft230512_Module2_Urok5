import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Draft4_Task2_5_4 {

    //        Пример 2 ППППППППППППППППППППППППППППППППППП УДАЛСЯ ОКОНЧАТЕЛЬНО !!!!!!!!!!!!!!!!!!
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Задание: \n4.\tВ файле 10 дробных чисел. Считайте в массив, выведите те, что больше числа пи.\n\nРешение: ");
        //  double[] a = new double [15]; инфо здесь: видео мин 20.04

        // Создаем файл txt. В нем 10 дробных чисел. Файл создан в корневом каталоге проекта по адресу: \\10_doubles.txt


        // Считываем переменные double из файла по адресу: \\10_doubles.txt
        System.out.println("Создаем файл txt. В нем 10 дробных чисел. Файл создан в корневом каталоге проекта по адресу: \\10_doubles.txt");
        System.out.println("В файле содержатся следующие переменные: [4.353, 8.121, 1.233, 5.637, 3.001, 4.286, 2.367, 4.551, 2.992, 5.777]");
        System.out.println("Выводим те переменные, которые больше числа пи: ");
        System.out.println();

        FileReader fileReader = new FileReader("10_doubles.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        Double[] part = new Double[10];
        Double pi = Math.PI;

        for (int i=0; i<10; i++) {
            part [i] = Double.valueOf(reader.readLine());
            /*System.out.println(reader.readLine());*/ // Эта строка почему-то не работает
            /*System.out.println(part [i]);*/
            if (part [i] > pi) {
                System.out.println(part [i]);
            }
        }
    }
//        Конец Примера 2 КККККККККККККККК






//    //        Пример 1 ППППППППППППППППППППППППППППППППППП  из второго задания
//    public static void main(String[] args) {
//        System.out.println("Задание: \n4.\tВ файле 10 дробных чисел. Считайте в массив, выведите те, что больше числа пи.\n\nРешение: ");
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
