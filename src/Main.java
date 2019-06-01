import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static int max_count = 10000;
    public static List<String> list = new ArrayList<>();

    public static void main(String[] args)
    {

        int N = 7;
        generateNumbersUtil();

        // multiple of n
        for (int i = 0; i < list.size(); i++)

            // stoi() is used for string to int conversion
            if ( Integer.parseInt(list.get(i))%7 == 0 ){
                System.out.println(list.get(i));
                break;

            }

        }

    public static void generateNumbersUtil () {

        Queue<String> q = new LinkedList<>();
        q.add("9");

        for (int count = max_count; count > 0; count--) {

            String s1 = q.poll();

            // storing the front of queue in the vector
            list.add(s1);

            String s2 = s1 + "9";
            s1 += "0";

            // Append "0" to s1 and enqueue it
            q.add(s1);

            // Append "9" to s2 and enqueue it. Note that
            // s2 contains the previous front
            q.add(s2);

        }

    }

}
