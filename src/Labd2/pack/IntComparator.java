package Labd2.pack;

import java.util.Comparator;

/**
 * Created by samuelort on 15-03-31.
 * Project name: Labb2
 */
public class IntComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer v1, Integer v2) {
            return v1.compareTo(v2);
        }


}

