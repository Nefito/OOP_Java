package ua.lpnuai.oop.korzhov1;

public class Debugger {

    public static void debug(String string, boolean debug, boolean var_show){

        StringBuffer sb = new StringBuffer();
        int i, j, n, counter = 0, wordLen = 0, count = 0, index = 0;

        for(i = 0; i < string.length(); i++) {

            if (debug || var_show) {
                System.out.println("i = " + i);
            }
            if (string.charAt(i) != ' ') {
                wordLen++;
            }
            else if(string.charAt(i) == ' '){

                    if (debug){
                        System.out.println("word1Len = "+ wordLen);
                    }
                for (j = i + 1; j < string.length(); j++){
                            if(var_show){
                                System.out.println("word1Len = "+ wordLen);
                                System.out.println("j = "+j);
                            }
                    if(string.charAt(j) != ' ') {

                        for (n = j; n < string.length(); n++) {
                                    if(var_show){
                                        System.out.println("n = "+ n);
                                    }
                            if (string.charAt(n) == ' ') {
                                break;
                            }
                            counter++;
                        }
                            if (debug){
                                System.out.println("word2Len = "+counter);
                            }
                            if(var_show){
                                System.out.println("counter = "+counter);
                            }
                        if (counter == wordLen && counter != 0) {
                            n--;
                            for (int k = i - wordLen; k < i && n >= 0; k++, n--) {
                                        if(var_show){
                                            System.out.println("k = " +k+"\nn = "+n);
                                        }
                                if (string.charAt(k) == string.charAt(n)) {
                                    count++;
                                        if (debug){
                                            System.out.println("Amount of same letters:\n"+count);
                                        }
                                        else if(var_show){
                                            System.out.println("count = "+count);
                                        }
                                } else {
                                    j += count;
                                        if (debug){
                                            System.out.println("Wrong letter!");
                                        }
                                    break;
                                }
                            }
                            if (count == wordLen) {
                                if (debug){
                                    System.out.println("Success!");
                                }
                                for (int l = i - wordLen; l < i; l++) {
                                    index = 1;
                                    sb.insert(index-1, string.charAt(l));
                                    index++;
                                }
                                String res = new String(sb);
                                for(int m = 0; m < 4*index - 1; m++) {
                                    System.out.print("-");
                                }
                                System.out.print("\n|" +res + "|" + sb.reverse()+"|\n");
                                sb.setLength(0);
                            }
                            wordLen = 0;
                        }
                        else if(counter != wordLen){
                            if(debug){
                                System.out.println("Wrong words!");
                            }
                        }
                        j+=counter-1;
                        counter = 0;
                        count = 0;
                    }
                }
                wordLen = 0;
            }
        }

        for(int m = 0; m < 4*index - 1; m++) {
            System.out.print("-");
        }
        System.out.println("\n");
    }
}
