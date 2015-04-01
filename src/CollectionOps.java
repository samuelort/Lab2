import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionOps {

    public static <T> void print(Collection<T> collection) {
        System.out.print("[");
        for (T t : collection) {
            System.out.print(t + " ");
        }
        System.out.print("]");
    }

    public static <T> List<T> reverse(List<T> list) {
        int i = 0;
        int j = list.size() - 1;
        while (i < (list.size() - 1) / 2 && j > (list.size() - 1) / 2) {
            swap(list, i, j);
            i++;
            j--;
        }
        return list;
    }

    public static <T> void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static <T> boolean less(Collection<T> collection1, Collection<T> collection2, Comparator<T> comparator) {
        return comparator.compare(Collections.max(collection1, comparator), Collections.min(collection2, comparator)) < 0;
    }


    public static <T> Collection<T> filter(Predicate<T> pred, Collection<T> collection) {

        Class<? extends Collection> cls = collection.getClass();

        try {
            Collection<T> result = cls.newInstance();

            for (T x : collection) {
                if (pred.test(x)) {
                    result.add(x);
                }
            }

            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T, R> Collection<R> map(Function<T, R> function, Collection<T> collection) {


        Class<? extends Collection> cls = collection.getClass();

        try {
            Collection<R> result = cls.newInstance();


            for (T x : collection) {
                result.add(function.apply(x));
            }
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }



}
