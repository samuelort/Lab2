import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.lang.Object.*;

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
        System.out.println();
        IntComparator intComparator = new IntComparator();
        List<Integer> li1 = new ArrayList<Integer>();
        List<Integer> li2 = new ArrayList<Integer>();
        li1.add(4);
        li1.add(2);
        li1.add(5);
        li1.add(1);
        li2.add(8);
        li2.add(6);
        li2.add(7);
        li2.add(9);

       boolean res4 = co.less(li1,li2,intComparator);
        System.out.println(res4);

    }
}
