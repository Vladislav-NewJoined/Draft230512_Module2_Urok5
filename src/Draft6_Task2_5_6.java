import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Draft6_Task2_5_6 {

    //        Пример 2 ППППППППППППППППППППППППППППППППППП Текущая редакция
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Задание: \n6.\tЕсть 2 файла по 5 строк в каждом. Сохраните их в 2 массива. Создайте третий " +
        "массив из 10 строк, скопируйте в него строки из первых двух массивов.\n\nРешение: ");
        //  double[] a = new double [15]; инфо здесь: видео мин 20.04

        // Создаем файл txt. В нем 10 дробных чисел. Файл создан в корневом каталоге проекта по адресу: \\10_doubles.txt


        // Считываем строки и сохраняем их в массивы из двух файлов по адресу: \\file1_for_Task6.txt, \\file2_for_Task6.txt
        System.out.println("Создаем два файла txt в корневом каталоге проекта по адресу: \\file1_for_Task6.txt, \\file1_for_Task6.txt В каждом по 5 строк.");
        /*System.out.println("В файле содержатся следующие переменные: [4.353, 8.121, 1.233, 5.637, 3.001, 4.286, 2.367, 4.551, 2.992, 5.777]");*/
        System.out.println("Сохраняем строки из файлов в два массива");
        /*System.out.println("Выводим те переменные, которые больше числа пи: ");*/
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






//    //        Пример 1 ППППППППППППППППППППППППППППППППППП из задания 4
//    public static void main(String[] args) throws IOException, InterruptedException {
//        System.out.println("Задание: \n6.\tЕсть 2 файла по 5 строк в каждом. Сохраните их в 2 массива. Создайте третий " +
//        "массив из 10 строк, скопируйте в него строки из первых двух массивов.\n\nРешение: ");
//        //  double[] a = new double [15]; инфо здесь: видео мин 20.04
//
//        // Создаем файл txt. В нем 10 дробных чисел. Файл создан в корневом каталоге проекта по адресу: \\10_doubles.txt
//
//
//        // Считываем переменные double из файла по адресу: \\10_doubles.txt
//        System.out.println("Создаем файл txt. В нем 10 дробных чисел. Файл создан в корневом каталоге проекта по адресу: \\10_doubles.txt");
//        System.out.println("В файле содержатся следующие переменные: [4.353, 8.121, 1.233, 5.637, 3.001, 4.286, 2.367, 4.551, 2.992, 5.777]");
//        System.out.println("Выводим те переменные, которые больше числа пи: ");
//        System.out.println();
//
//        FileReader fileReader = new FileReader("10_doubles.txt");
//        BufferedReader reader = new BufferedReader(fileReader);
//
//        Double[] part = new Double[10];
//        Double pi = Math.PI;
//
//        for (int i=0; i<10; i++) {
//            part [i] = Double.valueOf(reader.readLine());
//            /*System.out.println(reader.readLine());*/ // Эта строка почему-то не работает
//            /*System.out.println(part [i]);*/
//            if (part [i] > pi) {
//                System.out.println(part [i]);
//            }
//        }
//    }
////        Конец Примера 1 КККККККККККККККК






}
