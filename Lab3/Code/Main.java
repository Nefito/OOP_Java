import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList Bus = new LinkedList();
        String input;
        int numb, free;
        float depart_time, arr_time;
        String day, st_name;


        XMLEncoder encoder = null;

        try {
            encoder = new XMLEncoder(
                    new BufferedOutputStream(
                            new FileOutputStream("Bus.xml")));
        } catch (FileNotFoundException e) {
        }


        do{
            System.out.println("--------------------------------------АВТОСТАНЦІЯ--------------------------------------\n"+
                    "Виберіть вашу дію:\n"+
                    "1. Переглянути розклад\n"+
                    "2. Добавити рейс\n"+
                    "3. Серіалізація\n"+
                    "-h або help -- додаткова інформація\n");

            Scanner in = new Scanner(System.in);
            input = in.nextLine();

            switch (input){

                case "1":
                    if(Bus.size == 0)
                        System.out.println("Немає рейсів!");
                    else {
                        Bus.print();
                    }
                break;

                case "2":
                    System.out.println("Введіть номер рейсу:");
                    Scanner n = new Scanner(System.in);
                    numb = n.nextInt();

                    System.out.println("Введіть назву станції:");
                    Scanner st = new Scanner(System.in);
                    st_name = st.nextLine();

                    System.out.println("Введіть день прибуття:");
                    Scanner d = new Scanner(System.in);
                    day = d.nextLine();

                    System.out.println("Введіть час прибуття:");
                    Scanner ar = new Scanner(System.in);
                    arr_time = ar.nextFloat();

                    System.out.println("Введіть час відбуття:");
                    Scanner dep = new Scanner(System.in);
                    depart_time = dep.nextFloat();

                    System.out.println("Введіть кількість вільних місць:");
                    Scanner fr = new Scanner(System.in);
                    free = fr.nextInt();

                    Bus.add(numb, free, depart_time, arr_time, day, st_name);
                break;

                case "3":
                    int count = 0;
                    LinkedList.Node ptr = Bus.first;
                    encoder.writeObject(Bus.getSize());
                    while (count < Bus.getSize()){

                        encoder.writeObject(ptr.getNumb());
                        encoder.writeObject(ptr.getSt_name());
                        encoder.writeObject(ptr.getDay());
                        encoder.writeObject(ptr.getArr_time());
                        encoder.writeObject(ptr.getDepart_time());
                        encoder.writeObject(ptr.getFree());

                        ptr = ptr.next;
                        count++;
                    }
                    encoder.close();
                    System.out.println("Серіалізовно!");
                break;

                case "help":
                case "-h":
                    Helper.help();
                break;

                case "e":
                case "end":
                    System.out.println("ending....");
                break;

                default:
                    System.out.println("Неправильна команда!");
            }
        }while( !(input.equals("e") || (input.equals("end"))));
    }
}
