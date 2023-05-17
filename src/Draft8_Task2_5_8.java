import java.io.*;
import java.util.*;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.String.valueOf;
import static java.util.stream.DoubleStream.builder;

public class Draft8_Task2_5_8 {
            /*System.out.println("Задание: \n8.\tПоле чудес с соревнованием. Генерируете 1000 случайных слов на сайте- " +
                    "генераторе (пример: https://sanstv.ru/randomWord, но в поисковике есть много подобных). " +
                    "Сохраняете их в файл. Из файла считываете случайное, и выводите ####. игроки по очереди отгадывают букву. " +
                    "Гласная - 1 балл, согласная - 2 балла, если буква встречается несколько раз - больше. " +
                    "Можно угадать слово целиком - за каждую угаданную букву тогда начислять баллы(гласные 1, согласные 2). " +
                    "Если не угадал- минус 3 балла.\n\nРешение: ");*/

//    Пример можно взять здесь: Модуль 2,Урок 2, Задание 8. 8.	Первый игрок сохраняет слово и подсказку в первый файл,
//    второй игрок во второй. Игра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово противника.
//    Скачивали цитаты: Модуль 1. Урок 8. Задание 4.




    //        Пример _ ППППППППППППППППППППППППППППППППППП Работает с этапом 'закончить'; Далее прописать банк очков и рандомное слово
    public static void main(String[] args) {

        Scanner scanner_Letter_From_First_Player = new Scanner(System.in); // видео мин 23.05
        Scanner scanner_Letter_From_Second_Player = new Scanner(System.in);

        StringBuilder strBuilder = new StringBuilder();
        String word_For_Guess = "береза";
        System.out.println("Слово для отгадывания: " + word_For_Guess);
        String word_With_Closed_Letters; /*= "#####";*/

//            Создаем массив из букв загаданного слова
        char[] chars = new char[word_For_Guess.length()];
        /*String[] currentLetters = new String[word_Of_First_Player.length()];*/
        String[] array_Letters_Of_Word_For_Guess = new String[word_For_Guess.length()];
        String[] array_Letters_Of_Word_With_Closed_Letters = new String[word_For_Guess.length()];
        String currentLetter;
        String currentLetter_Closed;

        String entered_Letter;
        String letter_From_Second_Player;


        for (int i = 0; i < word_For_Guess.length(); i++) {
            currentLetter_Closed = "#";
            array_Letters_Of_Word_With_Closed_Letters[i] = currentLetter_Closed;
            strBuilder.append(array_Letters_Of_Word_With_Closed_Letters[i]);
        }

        /*System.out.print("Массив и буквы слова с закрытыми буквами: ");  // НЕ УДАЛЯТЬ!
        System.out.print(Arrays.toString(array_Letters_Of_Word_With_Closed_Letters));  // НЕ УДАЛЯТЬ!
        System.out.println();*/  // НЕ УДАЛЯТЬ!

        System.out.print("Слово с закрытыми буквами: ");
        word_With_Closed_Letters = strBuilder.toString();
        System.out.println(word_With_Closed_Letters);
        System.out.println();


        // Игроки начинают по очереди отгадывать буквы
        while (!word_With_Closed_Letters.equals(word_For_Guess)) {

            System.out.print("Первый игрок: введите строчную букву кириллицы: ");
            entered_Letter = scanner_Letter_From_First_Player.nextLine();

            for (int i = 0; i < word_For_Guess.length(); i++) {
                if (entered_Letter.equals(valueOf(word_For_Guess.charAt(i)))) {
                    array_Letters_Of_Word_With_Closed_Letters[i] = entered_Letter;

                }
            }

            if (word_For_Guess.contains(entered_Letter) && !entered_Letter.equals("")) {
                System.out.println("Есть такая буква.");
                word_With_Closed_Letters = "";
                for (int i = 0; i < array_Letters_Of_Word_With_Closed_Letters.length; i++) {
                    word_With_Closed_Letters = word_With_Closed_Letters + array_Letters_Of_Word_With_Closed_Letters[i];
                }

                System.out.println("Слово с закрытыми буквами стало: ");
                System.out.println(word_With_Closed_Letters + "\n");
            } else {
                System.out.println("Такой буквы нет." + "\n");

            }
            if (word_With_Closed_Letters.equals(word_For_Guess)) {
                System.out.println("Слово отгадано, конец программы.");
                System.exit(0);
            }










            System.out.print("Второй игрок: введите строчную букву кириллицы: ");
            entered_Letter = scanner_Letter_From_First_Player.nextLine();

            for (int i = 0; i < word_For_Guess.length(); i++) {
                if (entered_Letter.equals(valueOf(word_For_Guess.charAt(i)))) {
                    array_Letters_Of_Word_With_Closed_Letters[i] = entered_Letter;

                }
            }

            if (word_For_Guess.contains(entered_Letter) && !entered_Letter.equals("")) {
                System.out.println("Есть такая буква.");
                word_With_Closed_Letters = "";
                for (int i = 0; i < array_Letters_Of_Word_With_Closed_Letters.length; i++) {
                    word_With_Closed_Letters = word_With_Closed_Letters + array_Letters_Of_Word_With_Closed_Letters[i];
                }

                System.out.println("Слово с закрытыми буквами стало: ");
                System.out.println(word_With_Closed_Letters + "\n");
            } else {
                System.out.println("Такой буквы нет." + "\n");

            }
            if (word_With_Closed_Letters.equals(word_For_Guess)) {
                System.out.println("Слово отгадано, конец программы.");
                System.exit(0);
            }
        }
    }
//        Конец Примера _ КККККККККККККККК







//    //        Пример 17 ППППППППППППППППППППППППППППППППППП проверяем System.exit из интернет
//    public static void main(String[] args) {
//
//        int a[]= {1,2,3,4,5,6,7,8,9,10};
//        for(int i=0;i<a.length;i++)
//        {
//            if(a[i]<=4)
//            {
//                System.out.println("array["+i+"]="+a[i]);
//            }
//            else
//            {
//                System.out.println("Exit from the loop");
//                System.exit(0); //Terminates jvm
//            }
//        }
//
//    }
////        Конец Примера 17 КККККККККККККККК








//    //        Пример 16 ППППППППППППППППППППППППППППППППППП Работает до этапа 'закончить'; взято за основу (образец - Пример 2, Пример 13): из задания Модуль 2,Урок 2, Задание 8., где вводят по очереди
//    public static void main(String[] args) {
//
//        Scanner scanner_Letter_From_First_Player = new Scanner(System.in); // видео мин 23.05
//        Scanner scanner_Letter_From_Second_Player = new Scanner(System.in);
//
//        StringBuilder strBuilder = new StringBuilder();
//        String word_For_Guess = "агава";
//        System.out.println("Слово для отгадывания: " + word_For_Guess);
//        String word_With_Closed_Letters; /*= "#####";*/
//
////            Создаем массив из букв загаданного слова
//        char[] chars = new char[word_For_Guess.length()];
//        /*String[] currentLetters = new String[word_Of_First_Player.length()];*/
//        String[] array_Letters_Of_Word_For_Guess = new String[word_For_Guess.length()];
//        String[] array_Letters_Of_Word_With_Closed_Letters = new String[word_For_Guess.length()];
//        String currentLetter;
//        String currentLetter_Closed;
//
//        String letter_From_First_Player;
//        String letter_From_Second_Player;
//
//
//        for (int i = 0; i < word_For_Guess.length(); i++) {
//            currentLetter_Closed = "#";
//            array_Letters_Of_Word_With_Closed_Letters[i] = currentLetter_Closed;
//            strBuilder.append(array_Letters_Of_Word_With_Closed_Letters[i]);
//        }
//
//        /*System.out.print("Массив и буквы слова с закрытыми буквами: ");  // НЕ УДАЛЯТЬ!
//        System.out.print(Arrays.toString(array_Letters_Of_Word_With_Closed_Letters));  // НЕ УДАЛЯТЬ!
//        System.out.println();*/  // НЕ УДАЛЯТЬ!
//
//        System.out.print("Слово с закрытыми буквами: ");
//        word_With_Closed_Letters = strBuilder.toString();
//        System.out.println(word_With_Closed_Letters);
//
//
//        // Игроки начинают по очереди отгадывать буквы
//        while (!word_With_Closed_Letters.equals(word_For_Guess)) {
//
//            System.out.print("Первый игрок: введите строчную букву кириллицы: ");
//            letter_From_First_Player = scanner_Letter_From_First_Player.nextLine();
//
//            for (int i = 0; i < word_For_Guess.length(); i++) {
//                /*while (true) {*/
//                /*System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");*/
//                if (letter_From_First_Player.equals(valueOf(word_For_Guess.charAt(i)))) {
//                    array_Letters_Of_Word_With_Closed_Letters[i] = letter_From_First_Player;
//
//                }
//            }
//
//            if (word_For_Guess.contains(letter_From_First_Player)) {
//                System.out.println("Есть такая буква.");
//                word_With_Closed_Letters = "";
//                for (int i = 0; i < array_Letters_Of_Word_With_Closed_Letters.length; i++) {
//                    word_With_Closed_Letters = word_With_Closed_Letters + array_Letters_Of_Word_With_Closed_Letters[i];
//                }
//
//                // ОБЕРНУТЬ В ЦИКЛ WHILE
//                System.out.println("Слово с закрытыми буквами стало: ");
//                System.out.println(word_With_Closed_Letters);
//            } else {
//                System.out.println("Такой буквы нет.");
//
//                }
//
//
//
//            /*System.out.println(Arrays.toString(array_Letters_Of_Word_With_Closed_Letters));*/  // НЕ УДАЛЯТЬ
//        /*}
//        while (word_With_Closed_Letters.contains("#")) {*/
//
//            System.out.print("Второй игрок: введите строчную букву кириллицы: ");
//            letter_From_First_Player = scanner_Letter_From_First_Player.nextLine();
//
//            for (int i = 0; i < word_For_Guess.length(); i++) {
//                /*while (true) {*/
//                /*System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");*/
//                if (letter_From_First_Player.equals(valueOf(word_For_Guess.charAt(i)))) {
//                    array_Letters_Of_Word_With_Closed_Letters[i] = letter_From_First_Player;
//                    /*System.out.println("Есть такая буква.");*/
//                }
//            }
//
//
//
//            /*System.out.println(Arrays.toString(array_Letters_Of_Word_With_Closed_Letters));*/  // НЕ УДАЛЯТЬ
//            word_With_Closed_Letters = "";
//            for (int i = 0; i < array_Letters_Of_Word_With_Closed_Letters.length; i++) {
//                word_With_Closed_Letters = word_With_Closed_Letters + array_Letters_Of_Word_With_Closed_Letters[i];
//            }
//
//            // ОБЕРНУТЬ В ЦИКЛ WHILE
//            System.out.println("Слово с закрытыми буквами стало: ");
//            System.out.println(word_With_Closed_Letters);
//        }
//
//    }
////        Конец Примера 16 КККККККККККККККК








//    //        Пример 15 ППППППППППППППППППППППППППППППППППП Работает до этапа 'закончить'; взято за основу (образец - Пример 2, Пример 13): из задания Модуль 2,Урок 2, Задание 8., где вводят по очереди
//    public static void main(String[] args) {
//
//        Scanner scanner_Letter_From_First_Player = new Scanner(System.in); // видео мин 23.05
//        Scanner scanner_Letter_From_Second_Player = new Scanner(System.in);
//
//        StringBuilder strBuilder = new StringBuilder();
//        String word_For_Guess = "агава";
//        System.out.println("Слово для отгадывания: " + word_For_Guess);
//        String word_With_Closed_Letters; /*= "#####";*/
//
////            Создаем массив из букв загаданного слова
//        char[] chars = new char[word_For_Guess.length()];
//        /*String[] currentLetters = new String[word_Of_First_Player.length()];*/
//        String[] array_Letters_Of_Word_For_Guess = new String[word_For_Guess.length()];
//        String[] array_Letters_Of_Word_With_Closed_Letters = new String[word_For_Guess.length()];
//        String currentLetter;
//        String currentLetter_Closed;
//
//        String letter_From_First_Player;
//        String letter_From_Second_Player;
//
//
//        for (int i = 0; i < word_For_Guess.length(); i++) {
//            currentLetter_Closed = "#";
//            array_Letters_Of_Word_With_Closed_Letters[i] = currentLetter_Closed;
//            strBuilder.append(array_Letters_Of_Word_With_Closed_Letters[i]);
//        }
//
//        /*System.out.print("Массив и буквы слова с закрытыми буквами: ");  // НЕ УДАЛЯТЬ!
//        System.out.print(Arrays.toString(array_Letters_Of_Word_With_Closed_Letters));  // НЕ УДАЛЯТЬ!
//        System.out.println();*/  // НЕ УДАЛЯТЬ!
//
//        System.out.print("Слово с закрытыми буквами: ");
//        word_With_Closed_Letters = strBuilder.toString();
//        System.out.println(word_With_Closed_Letters);
//
//
//        // Игроки начинают по очереди отгадывать буквы
//        while (!word_With_Closed_Letters.equals(word_For_Guess)) {
//
//            System.out.print("Первый игрок: введите строчную букву кириллицы: ");
//            letter_From_First_Player = scanner_Letter_From_First_Player.nextLine();
//
//            for (int i = 0; i < word_For_Guess.length(); i++) {
//                /*while (true) {*/
//                /*System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");*/
//                if (letter_From_First_Player.equals(valueOf(word_For_Guess.charAt(i)))) {
//                    array_Letters_Of_Word_With_Closed_Letters[i] = letter_From_First_Player;
//                }
//            }
//
//
//            System.out.println("Есть такая буква.");
//
//            /*System.out.println(Arrays.toString(array_Letters_Of_Word_With_Closed_Letters));*/  // НЕ УДАЛЯТЬ
//            word_With_Closed_Letters = "";
//            for (int i = 0; i < array_Letters_Of_Word_With_Closed_Letters.length; i++) {
//                word_With_Closed_Letters = word_With_Closed_Letters + array_Letters_Of_Word_With_Closed_Letters[i];
//            }
//
//            // ОБЕРНУТЬ В ЦИКЛ WHILE
//            System.out.println("Слово с закрытыми буквами стало: ");
//            System.out.println(word_With_Closed_Letters);
//        /*}
//
//
//        while (word_With_Closed_Letters.contains("#")) {*/
//            System.out.print("Второй игрок: введите строчную букву кириллицы: ");
//            letter_From_First_Player = scanner_Letter_From_First_Player.nextLine();
//
//            for (int i = 0; i < word_For_Guess.length(); i++) {
//                /*while (true) {*/
//                /*System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");*/
//                if (letter_From_First_Player.equals(valueOf(word_For_Guess.charAt(i)))) {
//                    array_Letters_Of_Word_With_Closed_Letters[i] = letter_From_First_Player;
//                }
//            }
//
//
//            System.out.println("Есть такая буква.");
//
//            /*System.out.println(Arrays.toString(array_Letters_Of_Word_With_Closed_Letters));*/  // НЕ УДАЛЯТЬ
//            word_With_Closed_Letters = "";
//            for (int i = 0; i < array_Letters_Of_Word_With_Closed_Letters.length; i++) {
//                word_With_Closed_Letters = word_With_Closed_Letters + array_Letters_Of_Word_With_Closed_Letters[i];
//            }
//
//            // ОБЕРНУТЬ В ЦИКЛ WHILE
//            System.out.println("Слово с закрытыми буквами стало: ");
//            System.out.println(word_With_Closed_Letters);
//        }
//
//    }
////        Конец Примера 15 КККККККККККККККК








//    //        Пример 14 ППППППППППППППППППППППППППППППППППП  РАБОТАЕТ
//    public static void main(String[] args) {
//
//
//    String[] strArr = new String[] { "а", "г", "а", "в", "а" };
//    String str = "";
//        for (int i = 0; i < strArr.length; i++) {
//        str = str + strArr[i];
//    }
//        System.out.println(str);
//
//  или
//
//        String[] strArr = new String[] { "а", "г", "а", "в", "а" };
//        String str = strArr[0];
//        for (int i = 1; i < strArr.length; i++) {
//            str = str + strArr[i];
//        }
//        System.out.println(str);
//    }
////        Конец Примера 14 КККККККККККККККК







    //    //        Пример 13 ППППППППППППППППППППППППППППППППППП из задания Модуль 2,Урок 2, Задание 8., где вводят по очереди
//    public static void main(String[] args) {
//        System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
//        System.out.println("Решение: ");
//
//        // Первый игрок создает файл и пишет подсказку
//        System.out.println("Первый игрок создает файл 'textForTask_8_First_Player.txt'. В нем две строки: " +
//                "секретное слово и подсказка: \nПариж\nФранция\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
//        System.out.println("Подсказка: \nФранция\n");
//        String secrWord_Of_First_Player = "Париж";
//        File myFile_First_Player = new File("src\\" + "textForTask_8_First_Player.txt");
//
//        try {
//            PrintWriter writer_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, false)));
//            writer_First_Player.println("Париж");
//            writer_First_Player.flush();
//            writer_First_Player.close();
//            PrintWriter writer2_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, true)));
//            writer2_First_Player.println("Франция");
////            writer2_First_Player.flush();
//            writer2_First_Player.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // Второй игрок создает файл и пишет подсказку
//        System.out.println("Второй игрок создает файл 'textForTask_8_Second_Player.txt'. В нем две строки: " +
//                "секретное слово и подсказка: \nМадрид\nИспания\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
//        System.out.println("Подсказка: \nИспания\n");
//        String secrWord_Of_Second_Player = "Мадрид";
//        File myFile_Second_Player = new File("src\\" + "textForTask_8_Second_Player.txt");
//
//        try {
//            PrintWriter writer_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, false)));
//            writer_Second_Player.println("Мадрид");
//            writer_Second_Player.flush();
//            writer_Second_Player.close();
//            PrintWriter writer2_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, true)));
//            writer2_Second_Player.println("Испания");
////            writer2_Second_Player.flush();
//            writer2_Second_Player.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // Теперь поочерёдно вводят слова
//        String str_FromFirstPl;
//        String str_FromSecondPl;
//
//        Scanner scanner_FromFirst_Player = new Scanner(System.in); // видео мин 23.05
//        Scanner scanner_FromSecond_Player = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");
//            str_FromFirstPl = scanner_FromFirst_Player.nextLine();
//            if ((secrWord_Of_Second_Player.contains(str_FromFirstPl)) && (!str_FromFirstPl.equals(secrWord_Of_Second_Player)) && (!str_FromFirstPl.equals(""))) {
//                System.out.println("Горячо.");
//            } else if
//            ((!secrWord_Of_Second_Player.contains(str_FromFirstPl)) || (!str_FromFirstPl.equals(secrWord_Of_Second_Player)) || (str_FromFirstPl.equals(""))) {
//                System.out.println("Не верно.");
//            } else {
//                System.out.println("Правильно!");
//                System.out.println("Победил первый игрок.");
//                break;
//            }
//
//            System.out.println("Второй игрок: введите строку (т.е. предполагаемое секретное слово): ");
//            str_FromSecondPl = scanner_FromSecond_Player.nextLine();
//            if ((secrWord_Of_First_Player.contains(str_FromSecondPl)) && (!str_FromSecondPl.equals(secrWord_Of_First_Player)) && (!str_FromSecondPl.equals(""))) {
//                System.out.println("Горячо.");
//            } else if
//            ((!secrWord_Of_First_Player.contains(str_FromSecondPl)) || (!str_FromSecondPl.equals(secrWord_Of_First_Player)) || (str_FromSecondPl.equals(""))) {
//                System.out.println("Не верно.");
//            } else {
//                System.out.println("Правильно!");
//                System.out.println("Победил второй игрок.");
//                break;
//            }
//        }
//    }
////        Конец Примера 13 КККККККККККККККК








//
//    //        Пример 12 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) throws IOException {
//    //  Сохраняем список случайных слов в файле по адресу: C:\Users\PC\IdeaProjectsDrafts\Draft230512_Module2_Urok5\1000_Random_Words,
//    //  т.е. в корневом каталоге проекта. Про сохранение в файл видео здесь: https://www.youtube.com/watch?v=WU0BXXZP3WE
//        String[] randomStrings = new String[1000];
//
//
//        /*//  Программа для сохранения в файл:
//        File myFile = new File ("1000_Random_Words");
//        BufferedWriter writer = new BufferedWriter(new FileWriter (myFile, true));
//        writer.write(Arrays.toString(randomStrings));
//        writer.flush();
//        writer.close();*/
//
//
//
//
//    }
////        Конец Примера 12 КККККККККККККККК





////        Пример 11 ППППППППППППППППППППППППППППППППППП из интернет Генерация случайных слов в Java _  https://translated.turbopages.org/proxy_u/en-ru.ru.6bded37a-6461f4c7-3ef098ba-74722d776562/https/stackoverflow.com/questions/4951997/generating-random-words-in-java
//
//    public static void main(String[] args) {
//
//    }
//    public static String[] generateRandomWords(int numberOfWords)
//    {
//        String[] randomStrings = new String[]{"авеню", "авизо", "авост", "агава", "агами"};
//
//        Random random = new Random();
//        for(int i = 0; i < randomStrings.length; i++)
//        {
//            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
//            for(int j = 0; j < word.length; j++)
//            {
//                word[j] = (char)('a' + random.nextInt(26));
//            }
//            randomStrings[i] = new String(word);
//            System.out.println(randomStrings);
//
//        }
//        return randomStrings;
//    }
//
//    //        Конец Примера 11 ККККККККККККККК








////        Пример 10 ППППППППППППППППППППППППППППППППППП из чистового файла папки Java
//
//        public static void main(String[] args) throws IOException {
//
//            System.out.print("Первый игрок, введите слово с маленькой буквы, пример 'банан': ");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String word_Of_First_Player = reader.readLine();
//            StringBuilder strBuilder = new StringBuilder();
//            String guessedWord;
//
////            Создаем слово и массив с закрытыми буквами (вместо букв пишется символ '#') для первого игрока
//            String[] letters_Closed = new String[word_Of_First_Player.length()];
//            String currentLetter_Closed;
//
//            for (int i = 0; i < word_Of_First_Player.length(); i++) {
//                currentLetter_Closed = "#";
//                letters_Closed[i] = currentLetter_Closed;
//                strBuilder.append(letters_Closed[i]);
//            }
//            guessedWord = strBuilder.toString();
//            System.out.println(guessedWord);
//
////            Создаем слово и массив с открытыми буквами для первого игрока
//            char[] chars = new char[word_Of_First_Player.length()];
//            /*String[] currentLetters = new String[word_Of_First_Player.length()];*/
//            String currentLetter;
//
//            for (int i = 0; i < word_Of_First_Player.length(); i++) {
//                chars[i] = word_Of_First_Player.charAt(i);
//                /*currentLetter = valueOf(chars[i]);*/
//                /*currentLetters[i] = currentLetter;*/
//            }
//            System.out.println();
//            do {
//
//                System.out.print("Второй игрок, введите букву кириллицы: ");
//                String letter_From_Second_Player = reader.readLine();
//
//                guessedWord = guessedWord;
//                for (int i = 0; i < guessedWord.length(); i++) {
//                    chars[i] = word_Of_First_Player.charAt(i);
//                    currentLetter = valueOf(chars[i]);
//
//                    if (letter_From_Second_Player.equals(currentLetter)) {
//                        chars[i] = word_Of_First_Player.charAt(i);
//                        letters_Closed[i] = letter_From_Second_Player;
//                    }
//                }
//                strBuilder = new StringBuilder();
//                for (int i = 0; i < letters_Closed.length; i++) {
//                    strBuilder.append(letters_Closed[i]);
//                }
//                guessedWord = strBuilder.toString();
//                System.out.println(guessedWord);
//            }
//            while (guessedWord.contains("#"));
//
//            System.out.println("Слово отгадано");
//        }
////        Конец Примера 10 ККККККККККККККК








////        Пример 9 ППППППППППППППППППППППППППППППППППП из чистового файла папки Java УДАЛСЯ ДО ЭТОГО ЭТАПА !!!!!!!!!!!!!!!!!!
//        public static void main(String[] args) throws IOException {
//            System.out.println("Задание: \n8.\tПоле чудес с соревнованием. Генерируете 1000 случайных слов на сайте- " +
//                    "генераторе (пример: https://sanstv.ru/randomWord, но в поисковике есть много подобных). " +
//                    "Сохраняете их в файл. Из файла считываете случайное, и выводите ####. игроки по очереди отгадывают букву. " +
//                    "Гласная - 1 балл, согласная - 2 балла, если буква встречается несколько раз - больше. " +
//                    "Можно угадать слово целиком - за каждую угаданную букву тогда начислять баллы(гласные 1, согласные 2). " +
//                    "Если не угадал- минус 3 балла.\n\nРешение: ");
//
//            System.out.print("Первый игрок, введите слово с маленькой буквы, пример 'банан': ");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String word_Of_First_Player = reader.readLine();
//            StringBuilder strBuilder = new StringBuilder();
//            String guessedWord;
//
////            Создаем слово и массив с закрытыми буквами (вместо букв пишется символ '#') для первого игрока
//            String[] letters_Closed = new String[word_Of_First_Player.length()];
//            String currentLetter_Closed;
//
//            for (int i = 0; i < word_Of_First_Player.length(); i++) {
//                currentLetter_Closed = "#";
//                letters_Closed[i] = currentLetter_Closed;
//                strBuilder.append(letters_Closed[i]);
//            }
//            guessedWord = strBuilder.toString();
//            System.out.println(guessedWord);
//
////            Создаем слово и массив с открытыми буквами для первого игрока
//            char[] chars = new char[word_Of_First_Player.length()];
//            /*String[] currentLetters = new String[word_Of_First_Player.length()];*/
//            String currentLetter;
//
//            for (int i = 0; i < word_Of_First_Player.length(); i++) {
//                chars[i] = word_Of_First_Player.charAt(i);
//                currentLetter = valueOf(chars[i]);
//                /*currentLetters[i] = currentLetter;*/
//            }
//            System.out.println();
//            do {
//
//                System.out.print("Второй игрок, введите букву кириллицы: ");
//                String letter_From_Second_Player = reader.readLine();
//
//                guessedWord = guessedWord;
//                for (int i = 0; i < guessedWord.length(); i++) {
//                    chars[i] = word_Of_First_Player.charAt(i);
//                    currentLetter = valueOf(chars[i]);
//
//                    if (letter_From_Second_Player.equals(currentLetter)) {
//                        chars[i] = word_Of_First_Player.charAt(i);
//                        letters_Closed[i] = letter_From_Second_Player;
//                    }
//                }
//                strBuilder = new StringBuilder();
//                for (int i = 0; i < letters_Closed.length; i++) {
//                    strBuilder.append(letters_Closed[i]);
//                }
//                guessedWord = strBuilder.toString();
//                System.out.println(guessedWord);
//            }
//            while (guessedWord.contains("#"));
//
//            System.out.println("Слово отгадано");
//        }
////        Конец Примера 9 ККККККККККККККК





//    //        Пример 8 ППППППППППППППППППППППППППППППППППП УДАЛСЯ ОКОНЧАТЕЛЬНО !!!!!!!!!!!!!!!!!!  Текущая редакция. Подключаем действия второго игрока
////        System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
////        System.out.println("Решение: ");
//    public static void main(String[] args) throws IOException {
//        System.out.print("Первый игрок, введите слово с маленькой буквы, пример 'банан': ");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String word_Of_First_Player = reader.readLine();
//        StringBuilder strBuilder = new StringBuilder();
//        String guessedWord;
//
////            Создаем слово и массив с закрытыми буквами (вместо букв пишется символ '#') для первого игрока
//        /*char[] chars_Closed = new char[word_Of_First_Player.length()];*/
//        String[] letters_Closed = new String[word_Of_First_Player.length()];
//        String currentLetter_Closed;
//
//        for (int i = 0; i < word_Of_First_Player.length(); i++) {
//            /*chars_Closed[i] = word_Of_First_Player.charAt(i);*/
//            /*System.out.print(chars[i]);*/
//            currentLetter_Closed = "#";
//            /*currentLetters.add(currentLetter);*/
//            letters_Closed[i] = currentLetter_Closed;
//            /*System.out.print(currentLetter_Closed);*/
//            strBuilder.append(letters_Closed[i]);
//        }
//        /*System.out.print(Arrays.toString(chars));*/
//        /*System.out.println();*/
//        System.out.print(Arrays.toString(letters_Closed));
//        System.out.println();
//        guessedWord = strBuilder.toString();
//        System.out.println(guessedWord);
//
////            Создаем слово и массив с открытыми буквами для первого игрока
//        char[] chars = new char[word_Of_First_Player.length()];
//        String[] currentLetters = new String[word_Of_First_Player.length()];
//        String currentLetter;
//
//        System.out.println(Arrays.toString(currentLetters));
//
//        for (int i = 0; i < word_Of_First_Player.length(); i++) {
//            chars[i] = word_Of_First_Player.charAt(i);
//            /*System.out.print(chars[i]);*/
//            currentLetter = valueOf(chars[i]);
//            /*currentLetters.add(currentLetter);*/
//            currentLetters[i] = currentLetter;
//            System.out.print(currentLetter);
//        }
//        /*System.out.print(Arrays.toString(chars));*/
//        /*System.out.print(Arrays.toString(currentLetters));*/
//        System.out.println();
//        do {
//
//        System.out.print("Второй игрок, введите букву кириллицы: ");
//        /*BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));*/
//        String letter_From_Second_Player = reader.readLine();
//        /*StringBuilder strBuilder2 = new StringBuilder();*/
//
//        guessedWord = guessedWord;;
//        for (int i = 0; i < guessedWord.length(); i++) {
//            /*do {*/
//                chars[i] = word_Of_First_Player.charAt(i);
//                currentLetter = valueOf(chars[i]);
////                /*currentLetters.add(currentLetter);*/
////                currentLetters[i] = currentLetter;
////                System.out.print(currentLetter);
//
//                if (letter_From_Second_Player.equals(currentLetter)) {
//                    /*chars[i] = guessedWord.replace(letter_From_Second_Player);*/  // меняем символ в строке? видео мин 29.54,  Модуль 1. Урок 2. Практика программирования: переменные, ветвления, циклы. Введение в String API. Использование готовых методов: скачиваем веб-страницу, сохраняем в файл
//                    chars[i] = word_Of_First_Player.charAt(i);
//                    letters_Closed[i] = letter_From_Second_Player;
//                    /*System.out.println(Arrays.toString(letters_Closed));*/
//                    /*strBuilder2.append(letters_Closed[i]);*/
//                    /*guessedWord = strBuilder2.toString();*/
//                }
//                /*System.out.println(guessedWord);*/
//
//            /*}
//            while (!guessedWord.contains("#"));*/
//        }
//        /*guessedWord = strBuilder2.toString();*/
//        System.out.println(Arrays.toString(letters_Closed));
//        strBuilder = new StringBuilder();
//        /*System.out.println(guessedWord);*/
//        for (int i = 0; i < letters_Closed.length; i++) {
//            strBuilder.append(letters_Closed[i]);
//        }
//        guessedWord = strBuilder.toString();
//        System.out.println(guessedWord);
//            }
//            while (guessedWord.contains("#"));
//
//        System.out.println("Слово отгадано");
//
//    }
////        Конец Примера 8 КККККККККККККККК







//    //        Пример 7 ППППППППППППППППППППППППППППППППППП Текущая редакция. Подключаем действия второго игрока
////        System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
////        System.out.println("Решение: ");
//    public static void main(String[] args) throws IOException {
//        System.out.print("Первый игрок, введите слово с маленькой буквы, пример 'банан': ");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String word_Of_First_Player = reader.readLine();
//        StringBuilder strBuilder = new StringBuilder();
//        String guessedWord;
//
////            Создаем слово и массив с закрытыми буквами (вместо букв пишется символ '#') для первого игрока
//        /*char[] chars_Closed = new char[word_Of_First_Player.length()];*/
//        String[] letters_Closed = new String[word_Of_First_Player.length()];
//        String currentLetter_Closed;
//
//        for (int i = 0; i < word_Of_First_Player.length(); i++) {
//            /*chars_Closed[i] = word_Of_First_Player.charAt(i);*/
//            /*System.out.print(chars[i]);*/
//            currentLetter_Closed = "#";
//            /*currentLetters.add(currentLetter);*/
//            letters_Closed[i] = currentLetter_Closed;
//            /*System.out.print(currentLetter_Closed);*/
//            strBuilder.append(letters_Closed[i]);
//        }
//        /*System.out.print(Arrays.toString(chars));*/
//        /*System.out.println();*/
//        System.out.print(Arrays.toString(letters_Closed));
//        System.out.println();
//        guessedWord = strBuilder.toString();
//        System.out.println(guessedWord);
//
////            Создаем слово и массив с открытыми буквами для первого игрока
//        char[] chars = new char[word_Of_First_Player.length()];
//        String[] currentLetters = new String[word_Of_First_Player.length()];
//        String currentLetter;
//
//        System.out.println(Arrays.toString(currentLetters));
//
//        for (int i = 0; i < word_Of_First_Player.length(); i++) {
//            chars[i] = word_Of_First_Player.charAt(i);
//            /*System.out.print(chars[i]);*/
//            currentLetter = valueOf(chars[i]);
//            /*currentLetters.add(currentLetter);*/
//            currentLetters[i] = currentLetter;
//            System.out.print(currentLetter);
//        }
//        /*System.out.print(Arrays.toString(chars));*/
//        /*System.out.print(Arrays.toString(currentLetters));*/
//        System.out.println();
//
//        System.out.print("Второй игрок, введите букву кириллицы: ");
//        /*BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));*/
//        String letter_From_Second_Player = reader.readLine();
//        /*StringBuilder strBuilder2 = new StringBuilder();*/
//
//        guessedWord = guessedWord;;
//        for (int i = 0; i < guessedWord.length(); i++) {
//            do {
//                chars[i] = word_Of_First_Player.charAt(i);
//                currentLetter = valueOf(chars[i]);
////                /*currentLetters.add(currentLetter);*/
////                currentLetters[i] = currentLetter;
////                System.out.print(currentLetter);
//
//                if (letter_From_Second_Player.equals(currentLetter)) {
//                    /*chars[i] = guessedWord.replace(letter_From_Second_Player);*/  // меняем символ в строке? видео мин 29.54,  Модуль 1. Урок 2. Практика программирования: переменные, ветвления, циклы. Введение в String API. Использование готовых методов: скачиваем веб-страницу, сохраняем в файл
//                    chars[i] = word_Of_First_Player.charAt(i);
//                    letters_Closed[i] = letter_From_Second_Player;
//                    /*System.out.println(Arrays.toString(letters_Closed));*/
//                    /*strBuilder2.append(letters_Closed[i]);*/
//                    /*guessedWord = strBuilder2.toString();*/
//                }
//                /*System.out.println(guessedWord);*/
//
//            }
//
//
//            while (!guessedWord.contains("#"));
//        }
//        /*guessedWord = strBuilder2.toString();*/
//        System.out.println(Arrays.toString(letters_Closed));
//        strBuilder = new StringBuilder();
//        /*System.out.println(guessedWord);*/
//        for (int i = 0; i < letters_Closed.length; i++) {
//            strBuilder.append(letters_Closed[i]);
//        }
//        guessedWord = strBuilder.toString();
//        System.out.println(guessedWord);
//
//    }
////        Конец Примера 7 КККККККККККККККК








//    //        Пример 6 ППППППППППППППППППППППППППППППППППП Текущая редакция. Подключаем действия второго игрока
////        System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
////        System.out.println("Решение: ");
//    public static void main(String[] args) throws IOException {
//        System.out.print("Первый игрок, введите слово с маленькой буквы, пример 'банан': ");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String word_Of_First_Player = reader.readLine();
//        StringBuilder strBuilder = new StringBuilder();
//        String guessedWord;
//
////            Создаем слово и массив с закрытыми буквами (вместо букв пишется символ '#') для первого игрока
//        /*char[] chars_Closed = new char[word_Of_First_Player.length()];*/
//        String[] letters_Closed = new String[word_Of_First_Player.length()];
//        String currentLetter_Closed;
//
//        for (int i = 0; i < word_Of_First_Player.length(); i++) {
//            /*chars_Closed[i] = word_Of_First_Player.charAt(i);*/
//            /*System.out.print(chars[i]);*/
//            currentLetter_Closed = "#";
//            /*currentLetters.add(currentLetter);*/
//            letters_Closed[i] = currentLetter_Closed;
//            /*System.out.print(currentLetter_Closed);*/
//            strBuilder.append(letters_Closed[i]);
//        }
//        /*System.out.print(Arrays.toString(chars));*/
//        /*System.out.println();*/
//        System.out.print(Arrays.toString(letters_Closed));
//        System.out.println();
//        guessedWord = strBuilder.toString();
//        System.out.println(guessedWord);
//
////            Создаем слово и массив с открытыми буквами для первого игрока
//        char[] chars = new char[word_Of_First_Player.length()];
//        String[] currentLetters = new String[word_Of_First_Player.length()];
//        String currentLetter;
//
//        System.out.println(Arrays.toString(currentLetters));
//
//        for (int i = 0; i < word_Of_First_Player.length(); i++) {
//            chars[i] = word_Of_First_Player.charAt(i);
//            /*System.out.print(chars[i]);*/
//            currentLetter = valueOf(chars[i]);
//            /*currentLetters.add(currentLetter);*/
//            currentLetters[i] = currentLetter;
//            System.out.print(currentLetter);
//        }
//        /*System.out.print(Arrays.toString(chars));*/
//        /*System.out.print(Arrays.toString(currentLetters));*/
//        System.out.println();
//
//        System.out.print("Второй игрок, введите букву кириллицы: ");
//        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
//        String letter_From_Second_Player = reader.readLine();
//        StringBuilder strBuilder2 = new StringBuilder();
//
//        guessedWord = guessedWord;;
//        for (int i = 0; i < guessedWord.length(); i++) {
//            do {
//                chars[i] = word_Of_First_Player.charAt(i);
//                currentLetter = valueOf(chars[i]);
////                /*currentLetters.add(currentLetter);*/
////                currentLetters[i] = currentLetter;
////                System.out.print(currentLetter);
//
//                if (letter_From_Second_Player.equals(currentLetter)) {
//                    /*chars[i] = guessedWord.replace(letter_From_Second_Player);*/  // меняем символ в строке? видео мин 29.54,  Модуль 1. Урок 2. Практика программирования: переменные, ветвления, циклы. Введение в String API. Использование готовых методов: скачиваем веб-страницу, сохраняем в файл
//                    chars[i] = word_Of_First_Player.charAt(i);
//                    letters_Closed[i] = letter_From_Second_Player;
//                    strBuilder2.append(letters_Closed[i]);
//                    System.out.println(strBuilder2);
//                    guessedWord = strBuilder2.toString();
//                    /*System.out.println(Arrays.toString(letters_Closed));*/
//                    /*guessedWord = strBuilder2.toString();*/
//                }
//                /*System.out.println(guessedWord);*/
//                System.out.println(guessedWord);
//            }
//
//
//            while (!guessedWord.contains("#"));
//        }
//        /*guessedWord = strBuilder2.toString();*/
//        System.out.println(Arrays.toString(letters_Closed));
//        System.out.println(guessedWord);
//
//    }
////        Конец Примера 6 КККККККККККККККК







//    //        Пример 5 ППППППППППППППППППППППППППППППППППП Текущая редакция. Подключаем действия второго игрока
////        System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
////        System.out.println("Решение: ");
//    public static void main(String[] args) throws IOException {
//        System.out.print("Первый игрок, введите слово с маленькой буквы, пример 'банан': ");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String word_Of_First_Player = reader.readLine();
//        StringBuilder strBuilder = new StringBuilder();
//        String guessedWord;
//
////            Создаем слово и массив с закрытыми буквами (вместо букв пишется символ '#') для первого игрока
//        /*char[] chars_Closed = new char[word_Of_First_Player.length()];*/
//        String[] letters_Closed = new String[word_Of_First_Player.length()];
//        String currentLetter_Closed;
//
//        for (int i = 0; i < word_Of_First_Player.length(); i++) {
//            /*chars_Closed[i] = word_Of_First_Player.charAt(i);*/
//            /*System.out.print(chars[i]);*/
//            currentLetter_Closed = "#";
//            /*currentLetters.add(currentLetter);*/
//            letters_Closed[i] = currentLetter_Closed;
//            /*System.out.print(currentLetter_Closed);*/
//            strBuilder.append(letters_Closed[i]);
//        }
//        /*System.out.print(Arrays.toString(chars));*/
//        /*System.out.println();*/
//        System.out.print(Arrays.toString(letters_Closed));
//        System.out.println();
//        guessedWord = strBuilder.toString();
//        System.out.println(guessedWord);
//
////            Создаем слово и массив с открытыми буквами для первого игрока
//        char[] chars = new char[word_Of_First_Player.length()];
//        String[] currentLetters = new String[word_Of_First_Player.length()];
//        String currentLetter;
//
//        System.out.println(Arrays.toString(currentLetters));
//
//        for (int i = 0; i < word_Of_First_Player.length(); i++) {
//            chars[i] = word_Of_First_Player.charAt(i);
//            /*System.out.print(chars[i]);*/
//            currentLetter = valueOf(chars[i]);
//            /*currentLetters.add(currentLetter);*/
//            currentLetters[i] = currentLetter;
//            System.out.print(currentLetter);
//        }
//        /*System.out.print(Arrays.toString(chars));*/
//        /*System.out.print(Arrays.toString(currentLetters));*/
//        System.out.println();
//
//        System.out.print("Второй игрок, введите букву кириллицы: ");
//        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
//        String letter_From_Second_Player = reader.readLine();
//        StringBuilder strBuilder2 = new StringBuilder();
//
//        guessedWord = guessedWord;;
//        for (int i = 0; i < guessedWord.length(); i++) {
//            do {
//                chars[i] = word_Of_First_Player.charAt(i);
//                currentLetter = valueOf(chars[i]);
////                /*currentLetters.add(currentLetter);*/
////                currentLetters[i] = currentLetter;
////                System.out.print(currentLetter);
//
//                if (letter_From_Second_Player.equals(currentLetter)) {
//                    /*chars[i] = guessedWord.replace(letter_From_Second_Player);*/  // меняем символ в строке? видео мин 29.54,  Модуль 1. Урок 2. Практика программирования: переменные, ветвления, циклы. Введение в String API. Использование готовых методов: скачиваем веб-страницу, сохраняем в файл
//                    chars[i] = word_Of_First_Player.charAt(i);
//                    letters_Closed[i] = letter_From_Second_Player;
//                    /*System.out.println(Arrays.toString(letters_Closed));*/
//                    strBuilder2.append(letters_Closed[i]);
//                    /*guessedWord = strBuilder2.toString();*/
//                }
//                /*System.out.println(guessedWord);*/
//
//            }
//
//
//            while (!guessedWord.contains("#"));
//        }
//        /*guessedWord = strBuilder2.toString();*/
//        System.out.println(Arrays.toString(letters_Closed));
//        /*System.out.println(guessedWord);*/
//
//    }
////        Конец Примера 5 КККККККККККККККК







//    //        Пример 4 ППППППППППППППППППППППППППППППППППП Текущая редакция
////        System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
////        System.out.println("Решение: ");
//    public static void main(String[] args) throws IOException {
//        System.out.print("Первый игрок, введите слово с маленькой буквы, пример 'банан': ");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String word_Of_First_Player = reader.readLine();
//
////            Создаем слово и массив с закрытыми буквами (вместо букв '#') для первого игрока
//        char[] chars_Closed = new char[word_Of_First_Player.length()];
//        String[] letters_closed = new String[word_Of_First_Player.length()];
//        String currentLetter_Closed;
//
//        for (int i = 0; i < word_Of_First_Player.length(); i++) {
//            chars_Closed[i] = word_Of_First_Player.charAt(i);
//            /*System.out.print(chars[i]);*/
//            currentLetter_Closed = "#";
//            /*currentLetters.add(currentLetter);*/
//            letters_closed[i] = currentLetter_Closed;
//            System.out.print(currentLetter_Closed);
//        }
//        /*System.out.print(Arrays.toString(chars));*/
//        System.out.println();
//        System.out.print(Arrays.toString(letters_closed));
//        System.out.println();
//
////            Создаем слово и массив с открытыми буквами для первого игрока
//        char[] chars = new char[word_Of_First_Player.length()];
//        String[] currentLetters = new String[word_Of_First_Player.length()];
//        String currentLetter;
//
//        System.out.println(Arrays.toString(currentLetters));
//
//        for (int i = 0; i < word_Of_First_Player.length(); i++) {
//            chars[i] = word_Of_First_Player.charAt(i);
//            /*System.out.print(chars[i]);*/
//            currentLetter = valueOf(chars[i]);
//            /*currentLetters.add(currentLetter);*/
//            currentLetters[i] = currentLetter;
//            System.out.print(currentLetter);
//        }
//        /*System.out.print(Arrays.toString(chars));*/
//        System.out.println();
//        System.out.print(Arrays.toString(currentLetters));
//
//
//    }
////        Конец Примера 4 КККККККККККККККК







////        Пример 3 ППППППППППППППППППППППППППППППППППП Текущая редакция
////        System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
////        System.out.println("Решение: ");
//    public static void main(String[] args) throws IOException {
////        Scanner scanner = new Scanner(System.in);
//        System.out.print("Первый игрок, введите слово с маленькой буквы, пример 'банан': ");
////        String word_Of_First_Player = scanner.nextLine();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String word_Of_First_Player = reader.readLine();
//        System.out.println(word_Of_First_Player);
//        for (int i = 0; i < 10; i++) {
//
//        }
//
//
//
//
////        System.out.println("Первый игрок создает файл 'textForTask_8_First_Player.txt'. В нем две строки: " +
////                "секретное слово и подсказка: \nПариж\nФранция\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
////        System.out.println("Подсказка: \nФранция\n");
////        String secrWord_Of_First_Player = "Париж";
////        File myFile_First_Player = new File("src\\" + "textForTask_8_First_Player.txt");
////
////        try {
////            PrintWriter writer_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, false)));
////            writer_First_Player.println("Париж");
////            writer_First_Player.flush();
////            writer_First_Player.close();
////            PrintWriter writer2_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, true)));
////            writer2_First_Player.println("Франция");
//////            writer2_First_Player.flush();
////            writer2_First_Player.close();
////        } catch (IOException ex) {
////            ex.printStackTrace();
////        }
////
////        // Второй игрок создает файл и пишет подсказку
////        System.out.println("Второй игрок создает файл 'textForTask_8_Second_Player.txt'. В нем две строки: " +
////                "секретное слово и подсказка: \nМадрид\nИспания\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
////        System.out.println("Подсказка: \nИспания\n");
////        String secrWord_Of_Second_Player = "Мадрид";
////        File myFile_Second_Player = new File("src\\" + "textForTask_8_Second_Player.txt");
////
////        try {
////            PrintWriter writer_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, false)));
////            writer_Second_Player.println("Мадрид");
////            writer_Second_Player.flush();
////            writer_Second_Player.close();
////            PrintWriter writer2_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, true)));
////            writer2_Second_Player.println("Испания");
//////            writer2_Second_Player.flush();
////            writer2_Second_Player.close();
////        } catch (IOException ex) {
////            ex.printStackTrace();
////        }
////
////        // Теперь поочерёдно вводят слова
////        String str_FromFirstPl;
////        String str_FromSecondPl;
////
////        Scanner scanner_FromFirst_Player = new Scanner(System.in); // видео мин 23.05
////        Scanner scanner_FromSecond_Player = new Scanner(System.in);
////
////        while (true) {
////            System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");
////            str_FromFirstPl = scanner_FromFirst_Player.nextLine();
////            if ((secrWord_Of_Second_Player.contains(str_FromFirstPl)) && (!str_FromFirstPl.equals(secrWord_Of_Second_Player)) && (!str_FromFirstPl.equals(""))) {
////                System.out.println("Горячо.");
////            } else if
////            ((!secrWord_Of_Second_Player.contains(str_FromFirstPl)) || (!str_FromFirstPl.equals(secrWord_Of_Second_Player)) || (str_FromFirstPl.equals(""))) {
////                System.out.println("Не верно.");
////            } else {
////                System.out.println("Правильно!");
////                System.out.println("Победил первый игрок.");
////                break;
////            }
////
////            System.out.println("Второй игрок: введите строку (т.е. предполагаемое секретное слово): ");
////            str_FromSecondPl = scanner_FromSecond_Player.nextLine();
////            if ((secrWord_Of_First_Player.contains(str_FromSecondPl)) && (!str_FromSecondPl.equals(secrWord_Of_First_Player)) && (!str_FromSecondPl.equals(""))) {
////                System.out.println("Горячо.");
////            } else if
////            ((!secrWord_Of_First_Player.contains(str_FromSecondPl)) || (!str_FromSecondPl.equals(secrWord_Of_First_Player)) || (str_FromSecondPl.equals(""))) {
////                System.out.println("Не верно.");
////            } else {
////                System.out.println("Правильно!");
////                System.out.println("Победил второй игрок.");
////                break;
////            }
////        }
//    }
////        Конец Примера 3 КККККККККККККККК








//    //        Пример 2 ППППППППППППППППППППППППППППППППППП из задания Модуль 2,Урок 2, Задание 8., где вводят по очереди
//    public static void main(String[] args) {
//        System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
//        System.out.println("Решение: ");
//
//        // Первый игрок создает файл и пишет подсказку
//        System.out.println("Первый игрок создает файл 'textForTask_8_First_Player.txt'. В нем две строки: " +
//                "секретное слово и подсказка: \nПариж\nФранция\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
//        System.out.println("Подсказка: \nФранция\n");
//        String secrWord_Of_First_Player = "Париж";
//        File myFile_First_Player = new File("src\\" + "textForTask_8_First_Player.txt");
//
//        try {
//            PrintWriter writer_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, false)));
//            writer_First_Player.println("Париж");
//            writer_First_Player.flush();
//            writer_First_Player.close();
//            PrintWriter writer2_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, true)));
//            writer2_First_Player.println("Франция");
////            writer2_First_Player.flush();
//            writer2_First_Player.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // Второй игрок создает файл и пишет подсказку
//        System.out.println("Второй игрок создает файл 'textForTask_8_Second_Player.txt'. В нем две строки: " +
//                "секретное слово и подсказка: \nМадрид\nИспания\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
//        System.out.println("Подсказка: \nИспания\n");
//        String secrWord_Of_Second_Player = "Мадрид";
//        File myFile_Second_Player = new File("src\\" + "textForTask_8_Second_Player.txt");
//
//        try {
//            PrintWriter writer_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, false)));
//            writer_Second_Player.println("Мадрид");
//            writer_Second_Player.flush();
//            writer_Second_Player.close();
//            PrintWriter writer2_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, true)));
//            writer2_Second_Player.println("Испания");
////            writer2_Second_Player.flush();
//            writer2_Second_Player.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // Теперь поочерёдно вводят слова
//        String str_FromFirstPl;
//        String str_FromSecondPl;
//
//        Scanner scanner_FromFirst_Player = new Scanner(System.in); // видео мин 23.05
//        Scanner scanner_FromSecond_Player = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");
//            str_FromFirstPl = scanner_FromFirst_Player.nextLine();
//            if ((secrWord_Of_Second_Player.contains(str_FromFirstPl)) && (!str_FromFirstPl.equals(secrWord_Of_Second_Player)) && (!str_FromFirstPl.equals(""))) {
//                System.out.println("Горячо.");
//            } else if
//            ((!secrWord_Of_Second_Player.contains(str_FromFirstPl)) || (!str_FromFirstPl.equals(secrWord_Of_Second_Player)) || (str_FromFirstPl.equals(""))) {
//                System.out.println("Не верно.");
//            } else {
//                System.out.println("Правильно!");
//                System.out.println("Победил первый игрок.");
//                break;
//            }
//
//            System.out.println("Второй игрок: введите строку (т.е. предполагаемое секретное слово): ");
//            str_FromSecondPl = scanner_FromSecond_Player.nextLine();
//            if ((secrWord_Of_First_Player.contains(str_FromSecondPl)) && (!str_FromSecondPl.equals(secrWord_Of_First_Player)) && (!str_FromSecondPl.equals(""))) {
//                System.out.println("Горячо.");
//            } else if
//            ((!secrWord_Of_First_Player.contains(str_FromSecondPl)) || (!str_FromSecondPl.equals(secrWord_Of_First_Player)) || (str_FromSecondPl.equals(""))) {
//                System.out.println("Не верно.");
//            } else {
//                System.out.println("Правильно!");
//                System.out.println("Победил второй игрок.");
//                break;
//            }
//        }
//    }
////        Конец Примера 2 КККККККККККККККК








//    //        Пример 1 ППППППППППППППППППППППППППППППППППП из задания 2 этого урока _ Draft2_Task2_5_2
//    public static void main(String[] args) {
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
