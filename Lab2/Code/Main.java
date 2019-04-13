import java.util.Scanner;

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
                    "-d або debug - режим налаштування ВКЛ або ВИКЛ\n"+
                    "container - переглянути контейнер\n");

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
                        Debugger.debug(str, false, true);
                    }
                    break;
                case "c":
                case "виконання обчислень":
                    if (str.equals("yeet")) {
                        System.out.println("Немає даних!");
                    } else {
                        System.out.println("Обчислення виконуються....");
                        Debugger.debug(str, false, false);
                    }
                    break;
                case "d":
                case "відображення результату":
                    if (str.equals("yeet")) {
                        System.out.println("Немає даних!");
                    } else {
                        Debugger.debug(str, false, false);
                    }
                    break;
                case "-h":
                case "-help":
                    Helper.help();
                    break;
                case "-d":
                case "-debug":
                    if (str.equals("yeet")) {
                        System.out.println("Немає даних!");
                    } else {
                        Debugger.debug(str, true, true);
                    }
                    break;
                case "container":
                    String input2;
                    do {
                        System.out.println(
                                "Виберіть вашу дію:\n"+
                                "add - добавити елемент у контейнер\n"+
                                "toString - перетворити контейнер у стрічку\n"+
                                "clear - видалити всі елементи з контейнеру\n"+
                                "remove - вилучити елемент з контейнеру\n"+
                                "size - дізнатись розмір масиву\n"+
                                "toArray - перетворити контейнер у масив\n"+
                                "contains - перевірити чи певний елемент є в контейнері\n"+
                                "containsAll - перевірити чи всі елементи є в контейнері\n"+
                                "print - вивести на екран контейнер\n"+
                                "show - показати елемент під певним індексом\n"+ 
                                        "hasNext - перевірає, чи є елемент після вказаного\n"+ 
                                        "next - поаертає наступний елемент після вказаного\n");

                        Scanner con = new Scanner(System.in);
                        input2 = con.nextLine();
                        switch (input2){

                            case "add":
                                System.out.println("Enter a string to add:");
                                Scanner  add= new Scanner(System.in);
                                str = add.nextLine();
                                Container.add(str);
                                break;

                            case "toString":
                                if(Container.size()== 0)
                                    System.out.println("Nothing to convert!\n");
                                else {
                                    Container.toSstring();
                                }
                                break;

                            case "clear":
                                Container.clear();
                                System.out.println("Clear!");
                                break;

                            case "remove":
                                System.out.println("Enter a string to delete:");
                                Scanner delete = new Scanner(System.in);
                                str = delete.nextLine();
                                if(Container.size() == 0)
                                    System.out.println("Nothing to delete!");
                                else {
                                    if (Container.remove(str)) {
                                        System.out.println("Deletion successful:");
                                        Container.printCont();
                                    } else
                                        System.out.println("String not found!");
                                }
                                break;
                            case "size":
                                System.out.println("The number of elements in the container is:" + Container.size());
                                break;

                            case "toArray":
                                if(Container.size() != 0) {
                                    Container.toArray();
                                    System.out.println("The container is now an array!");
                                }
                                else
                                    System.out.println("There is nothing to convert!");
                                break;

                            case "contains":
                                System.out.println("Enter a string to check:");
                                Scanner contain = new Scanner(System.in);
                                str = contain.nextLine();
                                if(Container.contains(str))
                                    System.out.println("The container contains such a string!");
                                else
                                    System.out.println("The container does not contain such a string!");
                                break;

                            case "containsAll":
                                int l;
                                System.out.println("Enter the number of strings you wanna check:");
                                Scanner len = new Scanner(System.in);
                                l = len.nextInt();
                                String[] check = new String[l];
                                for(int i = 0; i < l; i++){
                                    System.out.println("Enter string number"+i+":");
                                    Scanner el = new Scanner(System.in);
                                    check[i] = el.nextLine();
                                }
                                if(Container.containsAll(check))
                                    System.out.println("The container contains all these elements!");
                                else
                                    System.out.println("The container does not contain all these elements!");
                                break;

                            case "print":
                                if(Container.size() != 0)
                                    Container.printCont();
                                else
                                    System.out.println("The container is empty!");
                                break;
                            case "show":
                                int index;
                                Scanner ind = new Scanner(System.in);
                                index = ind.nextInt();
                                if(index > Container.size())
                                    System.out.println("No element at such index!");
                                else{
                                    System.out.println("Your element is:");
                                    System.out.println(Container.showcase(index));
                                }
                                break;

                            case "hasNext":
                                int index2;
                                Scanner indx = new Scanner(System.in);
                                index2 = indx.nextInt();
                                System.out.println(Container.hasNext(index2));
                                break;
                            case "next":
                                int index3;
                                Scanner i = new Scanner(System.in);
                                index3 = i.nextInt();
                                if(index3 >= Container.size()-1)
                                {
                                    System.out.println("No element at such index!");
                                }
                                else
                                    System.out.println(Container.next(index3));
                                break;
                            default:
                                System.out.println("Неправильна команда!\n");
                        }
                    }while( !((input2.equals("e")) || (input2.equals("back"))));
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
