
public class Container {
    private static int size = 0;
    private static String[] cont = new String[100];

    public static boolean hasNext(int index){
        if(cont[index] != null)
            return true;
        return false;
    }

    public static String next(int index){
        return cont[index+1];
    }

    public static String showcase(int index){
        return cont[index];
    }

    public static void printCont(){
        for(int i = 0; i < size; i++)
            System.out.println(cont[i]);
    }
    public static void printString(){
        String s = toSstring();
        System.out.println(s);
    }

    public static void printArr(){
        for(int i = 0; i < toArray().length;i++)
            System.out.println(toArray()[i]);
    }

    public static String toSstring(){
        String string = cont.toString();
        return string;
    }

    public static void add(String string){
        cont[size] = string;
        size++;
    }

    public static void clear(){
        for(int i = 0; i < size; i++)
            cont[i] = null;
        size = 0;
    }

    public static boolean remove(String string){
        for(int i = 0; i < size; i++){
            if(cont[i].equals(string)){
                for(int j = i; j < size; j++) {
                    if (j != size-1) {
                        cont[j] = cont[j + 1];
                    }
                    else {
                        cont[j] = null;
                    }
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public static int size(){
        return size;
    }

    public static char[] toArray(){
        String string = cont.toString();
        char[] cont_arr = string.toCharArray();
        return cont_arr;
    }

    public static boolean contains(String string){
        for(int i = 0; i < size; i++){
            if(cont[i].equals(string)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsAll(String[] container){
        for(int i = 0; i < container.length; i++){
            if(!(container[i].equals(cont[i])))
                return false;
        }
        return true;
    }


}
