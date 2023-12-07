package consultation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String polindrom = "arozaupalanalapuazora";
        System.out.println(isPolindrom(polindrom));

    }

   public static boolean isPolindrom (String polindrom)
    {
        boolean b = false;
        String temp1 = polindrom.substring(0,polindrom.length()/2);
        String temp2 = polindrom.substring(polindrom.length()/2+1);
        char [] array2 = temp2.toCharArray();
        int i = 0;
        int j = array2.length - 1;

        while (i < j) {
            char temp = array2[i];
            array2[i] = array2[j];
            array2[j] = temp;
            i++;
            j--;
        }
        temp2 = new String(array2);

        b = temp1.equals(temp2);

    return b;
    }}
