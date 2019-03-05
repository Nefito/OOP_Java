package ua.lpnuai.oop.korzhov1;

import java.util.Scanner;

import static ua.lpnuai.oop.korzhov1.Helper.help;

public class Main {

    public static void main(String[] args) {

        String input;

        do{
            System.out.println("Виберіть вашу дію: \n");
            System.out.println("a. введення даних;\n" +
                    "b. перегляд даних;\n" +
                    "c. виконання обчислень;\n" +
                    "d. відображення результату;\n" +
                    "e. завершення програми\n");

            Scanner in = new Scanner(System.in);
            input = in.nextLine();

            if(input.equals("a") || input.equals("введення даних")){
                Scanner c = new Scanner(System.in);
                String str = c.nextLine();

                // some actual code here
            }
            else if(input.equals("b") || input.equals("перегляд даних")){
                //here i showcase all the vars
            }
            else if(input.equals("c") || input.equals("виконання обчислень")){
                //here I show all the maths in the program
            }
            else if(input.equals("d") || input.equals("відображення результату")){
                //the actual answer is shown here
            }
            else if(input.equals("-h") || input.equals("-help")){
                help();
            }

        }while( !(input.equals("e") || (input.equals("завершення програми"))));
    }
}
