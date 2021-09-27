import java.util.*;

public class Interview {

    public static void main(String[] args) {
        lovelyNumber(11, 113);

    }

    public static void lovelyNumber(int a, int b) {
        boolean isLovely = true;
        int count = 0;
        List<String> list = new ArrayList<>();
        for (int i = a; i <= b; i++) {
           list = new ArrayList<>(Arrays.asList((i+"").split("")));
            for (String s : list) { //211002
                if (Collections.frequency(list,s) >= 3) {
                    isLovely = false;
                    count++;
                    break;
                }
            }

count = b - a +1- count;
}
        System.out.println(count);
}}
















