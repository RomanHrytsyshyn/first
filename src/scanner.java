import java.awt.*;
import java.util.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rhryts on 31.05.2017.
 */
public class scanner {
    public static void main(String[] args) {
        //Scanner digits = new Scanner(System.in);
        Integer[] numbers = {2,3,};
        List<Integer> list = Arrays.asList(numbers);

        Collections.sort(list);
        System.out.printf("%s\n", list);

        //System.out.println(input.nextLine());
    }
}
