package Labd2.pack;

import java.util.ArrayList;
import java.util.Arrays;
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

        //Testar om pos eller negativ
        List<Double> l1 = new ArrayList<Double>(Arrays.asList(23.4, -19.0, 377.62, 0.0, 18.9, -32.12));
        //Testar alla siffror om de är jämna
        List<Integer> l3 = new ArrayList<Integer>(Arrays.asList(3, -42, 88, 19, -37, 0, 18));
        //Testar om de är primtal
        List<Integer> l5 = new ArrayList<Integer>(Arrays.asList(3, 11, 21, 18, 22, 44, 21, 23, 23, 31, 45, 60012, 2549, 4500, 3450, 3529));
        //Gör om alla talen till binära tal.
        List<Integer> l7 = new ArrayList<Integer>(Arrays.asList(3, 11, 21, 18, 22, 44, 21, 23, 23, 31, 45, 60012, 2549, 4500, 3450, 3529));


        //Skapar och skriver ut.

        Collection<Integer> l2 = CollectionOps.map(new Sign(), l1);
        CollectionOps.print(l2);
        System.out.println();
        Collection<Integer> l4 = CollectionOps.filter(new IsEven(), l3);
        CollectionOps.print(l4);
        System.out.println();
        Collection<Integer> l6 = CollectionOps.filter(new IsPrime(), l5);
        CollectionOps.print(l6);
        System.out.println();
        Collection<String> l8 = CollectionOps.map(new ToBinary(), l7);
        CollectionOps.print(l8);


    }
}
