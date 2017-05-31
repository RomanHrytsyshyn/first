import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by rhryts on 01.06.2017.
 */
public class comparer {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int tmp;
        if (a < b)
        {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (a < c)
        {
            tmp = a;
            a = c;
            c = tmp;
        }
        if (b < c)
        {
            tmp = b;
            b = c;
            c = tmp;
        }
        System.out.println(a +"\n" +b+"\n"+c+"\n" );
    }
}