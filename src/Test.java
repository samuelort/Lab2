import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by samuelort on 15-03-31.
 * Project name: Labb2
 */
public class Test {
    public static void main(String[] args) {
        SingelBuffer<Integer> b = new SingelBuffer<Integer>();
        CollectionOps co = new CollectionOps();

        int x,y;
        boolean res1,res2,res3;
        res1 = b.put(123);
        res2 = b.put(345);
        x = b.get();
        res3 = b.put(456);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(x);
        System.out.println(res3);

        List<Integer> ints = new ArrayList<Integer>();

        for (int i = 0; i <20 ; i++) {
            ints.add(i);
        }
        co.print(ints);

        co.reverse(ints);
        System.out.println();

        co.print(ints);

    }
}
