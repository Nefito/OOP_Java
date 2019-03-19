package ua.lpnuai.oop.korzhov1;

import java.util.Scanner;

import static ua.lpnuai.oop.korzhov1.Debugger.debug;
import static ua.lpnuai.oop.korzhov1.Helper.help;

public class Main {

    public static void main(String[] args) {

         String input;
         String str = "yeet";

        do{
            System.out.println("Виберіть вашу дію: \n");
            System.out.println("a. введення даних;\n" +
                    "b. перегляд даних;\n" +
                    "c. виконання обчислень;\n" +
                    "d. відображення результату;\n" +
                    "e. завершення програми\n" +
                    "-h або help для додатковї інформації\n" +
                    "-d або debug - режим налаштування ВКЛ або ВИКЛ\n");

            Scanner in = new Scanner(System.in);
            input = in.nextLine();

            switch (input) {
                case "a":
                case "введення даних":
                    Scanner c = new Scanner(System.in);
                    str = c.nextLine();
                    break;
                case "b":
                case "перегляд даних":
                    if (str.equals("yeet")) {
                        System.out.println("Немає даних!");
                    } else {
                        debug(str, false, true);
                    }
                    break;
                case "c":
                case "виконання обчислень":
                    if (str.equals("yeet")) {
                        System.out.println("Немає даних!");
                    } else {
                        System.out.println("Обчислення виконуються....");
                        debug(str, false, false);
                    }
                    break;
                case "d":
                case "відображення результату":
                    if (str.equals("yeet")) {
                        System.out.println("Немає даних!");
                    } else {
                        debug(str, false, false);
                    }
                    break;
                case "-h":
                case "-help":
                    help();
                    break;
                case "-d":
                case "-debug":
                    if (str.equals("yeet")) {
                        System.out.println("Немає даних!");
                    } else {
                        debug(str, true, true);
                    }
                    break;
                case "e":
                case "завершення програми":
                    System.out.println("ending....");
                    break;
                 default:
                     System.out.println("Неправильна команда!");
            }
        }while( !(input.equals("e") || (input.equals("завершення програми"))));
    }
}
