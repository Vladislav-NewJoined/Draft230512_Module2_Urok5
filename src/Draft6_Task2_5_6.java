import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;


public class Draft6_Task2_5_6 {

    //        Пример 4 ППППППППППППППППППППППППППППППППППП УДАЛСЯ ОКОНЧАТЕЛЬНО !!!!!!!!!!!!!!!!!!  _
    //        С примером из интернет: https://stackoverflow.com/questions/80476/how-can-i-concatenate-two-arrays-in-java?page=1&tab=scoredesc#tab-top , способ 3 3. Merging Arrrays with Stream.concat()
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Задание: \n6.\tЕсть 2 файла по 5 строк в каждом. Сохраните их в 2 массива. Создайте третий " +
        "массив из 10 строк, скопируйте в него строки из первых двух массивов.\n\nРешение: ");

        System.out.println("Создаем два файла txt в корневом каталоге проекта по адресу: \\file1_for_Task6.txt, \\file1_for_Task6.txt. В каждом по 5 строк.");
        System.out.println("Сохраняем строки из файлов в два массива");
        System.out.println("Содержимое массивов: ");

        // Сначала инициализируем общий массив, в котором 'склеим' два первых массива
        /*String[] resultArray = new String[10];*/

        // Первый массив
        FileReader fileReader1 = new FileReader("file1_for_Task6.txt");
        BufferedReader reader1 = new BufferedReader(fileReader1);

        String[] array1 = new String[5];

        for (int i=0; i<5; i++) {
            /*part [i] = String.valueOf(reader.readLine());*/
            array1 [i] = reader1.readLine();
            /*resultArray[1] = String.valueOf(array1 [i]);*/
        }
        System.out.println(Arrays.toString(array1));

        // Второй массив
        FileReader fileReader2 = new FileReader("file2_for_Task6.txt");
        BufferedReader reader2 = new BufferedReader(fileReader2);

        String[] array2 = new String[5];

        for (int i=5; i<10; i++) {
            /*part [i] = String.valueOf(reader.readLine());*/
            array2 [i-5] = reader2.readLine();
            /*resultArray[1+5] = String.valueOf(array2 [i-5]);*/
        }
        System.out.println(Arrays.toString(array2));

        System.out.println();
        System.out.println("Общий массив выглядит так: ");
        /*System.out.println(Arrays.toString(resultArray));*/
        /*String[] resultArray = ArrayUtils.addAll(array1, array2);*/
        String[] resultArray = Stream.concat(Arrays.stream(array1),
                        Arrays.stream(array2))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(resultArray));


    }
//        Конец Примера 4 КККККККККККККККК






//    //        Пример 3 ППППППППППППППППППППППППППППППППППП Текущая редакция _ Работает, но без общего файла. Есть ошибка в общем файле common, проверять
//    public static void main(String[] args) throws IOException, InterruptedException {
//        System.out.println("Задание: \n6.\tЕсть 2 файла по 5 строк в каждом. Сохраните их в 2 массива. Создайте третий " +
//        "массив из 10 строк, скопируйте в него строки из первых двух массивов.\n\nРешение: ");
//
//        System.out.println("Создаем два файла txt в корневом каталоге проекта по адресу: \\file1_for_Task6.txt, \\file1_for_Task6.txt. В каждом по 5 строк.");
//        System.out.println("Сохраняем строки из файлов в два массива");
//        System.out.println("Содержимое массивов: ");
//
//        // Сначала инициализируем общий массив, в котором 'склеим' два первых массива
//        String[] resultArray = new String[10];
//
//        // Первый массив
//        FileReader fileReader1 = new FileReader("file1_for_Task6.txt");
//        BufferedReader reader1 = new BufferedReader(fileReader1);
//
//        String[] array1 = new String[5];
//
//        for (int i=0; i<5; i++) {
//            /*part [i] = String.valueOf(reader.readLine());*/
//            array1 [i] = reader1.readLine();
//            /*resultArray[1] = String.valueOf(array1 [i]);*/
//        }
//        System.out.println(Arrays.toString(array1));
//
//        // Второй массив
//        FileReader fileReader2 = new FileReader("file2_for_Task6.txt");
//        BufferedReader reader2 = new BufferedReader(fileReader2);
//
//        String[] array2 = new String[5];
//
//        for (int i=5; i<10; i++) {
//            /*part [i] = String.valueOf(reader.readLine());*/
//            array2 [i-5] = reader2.readLine();
//            /*resultArray[1+5] = String.valueOf(array2 [i-5]);*/
//        }
//        System.out.println(Arrays.toString(array2));
//
//        System.out.println();
//        System.out.println("Общий массив выглядит так: ");
//        /*System.out.println(Arrays.toString(resultArray));*/
//        /*String[] resultArray = ArrayUtils.addAll(array1, array2);*/
//
//    }
////        Конец Примера 3 КККККККККККККККК






//    //        Пример 2 ППППППППППППППППППППППППППППППППППП Текущая редакция _ Работает, но без общего файла. Есть ошибка в общем файле common, проверять
//    public static void main(String[] args) throws IOException, InterruptedException {
//        System.out.println("Задание: \n6.\tЕсть 2 файла по 5 строк в каждом. Сохраните их в 2 массива. Создайте третий " +
//        "массив из 10 строк, скопируйте в него строки из первых двух массивов.\n\nРешение: ");
//
//        System.out.println("Создаем два файла txt в корневом каталоге проекта по адресу: \\file1_for_Task6.txt, \\file1_for_Task6.txt. В каждом по 5 строк.");
//        System.out.println("Сохраняем строки из файлов в два массива");
//        System.out.println("Содержимое массивов: ");
//
//        // Инициализируем общий массив, в котором 'склеим' два первых массива
//        String[] common = new String[10];
//        // Первый массив
//        FileReader fileReader1 = new FileReader("file1_for_Task6.txt");
//        BufferedReader reader1 = new BufferedReader(fileReader1);
//
//        String[] part1 = new String[5];
//
//        for (int i=0; i<5; i++) {
//            /*part [i] = String.valueOf(reader.readLine());*/
//            part1 [i] = reader1.readLine();
//            common[1] = String.valueOf(part1 [i]);
//        }
//        System.out.println(Arrays.toString(part1));
//
//        // Второй массив
//        FileReader fileReader2 = new FileReader("file2_for_Task6.txt");
//        BufferedReader reader2 = new BufferedReader(fileReader2);
//
//        String[] part2 = new String[5];
//
//        for (int i=5; i<10; i++) {
//            /*part [i] = String.valueOf(reader.readLine());*/
//            part2 [i-5] = reader2.readLine();
//            common[1+5] = String.valueOf(part2 [i-5]);
//        }
//        System.out.println(Arrays.toString(part2));
//
//        System.out.println();
//        System.out.println("Общий массив выглядит так: ");
//        System.out.println(Arrays.toString(common));
//
//    }
////        Конец Примера 2 КККККККККККККККК






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
