import java.util.ArrayList;
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
        System.out.println();
        CollectionOps.print(ints);

        CollectionOps.reverse(ints);
        System.out.println();

        CollectionOps.print(ints);
        System.out.println();
        IntComparator intcomp = new IntComparator();
        StringComparator stringcomp = new StringComparator();

        ArrayList<Integer> li1 = new ArrayList<Integer>();
        li1.add(4);
        li1.add(2);
        li1.add(5);
        li1.add(1);
        li1.add(3);

        ArrayList<Integer> li2 = new ArrayList<Integer>();
        li2.add(8);
        li2.add(6);
        li2.add(7);
        li2.add(9);

        ArrayList<Integer> li3 = new ArrayList<Integer>();
        li3.add(97);
        li3.add(5);
        li3.add(123);
        li3.add(18);

        ArrayList<String> johanneberg = new ArrayList<String>();
        johanneberg.add("HC2");
        johanneberg.add("ED");
        johanneberg.add("HC3");

        List<String> lindholmen = new ArrayList<String>();
        lindholmen.add("Saga");
        lindholmen.add("Svea");
        lindholmen.add("Jupiter");
        System.out.println();

        System.out.println(CollectionOps.less(li1, li2, intcomp));
        System.out.println(CollectionOps.less(li1, li3, intcomp));
        System.out.println(CollectionOps.less(johanneberg, lindholmen, stringcomp));
    }
}
