package Labd2.pack;

import java.util.Comparator;

/**
 * Created by samuelort on 15-03-31.
 * Project name: Labb2
 */
public class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
