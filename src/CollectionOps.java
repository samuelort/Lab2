import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class CollectionOps {

    public static <T> void print(Collection<T> collection){
        System.out.print("[");
        for (T t: collection){
            System.out.print(t + " ");
        }
        System.out.print("]");
    }

    public static <T> List<T> reverse(List<T> list){
       int i = 0;
        int j = list.size()-1;
        while(i<(list.size()-1)/2 && j>(list.size()-1)/2){
            swap(list,i,j);
            i++;
            j--;
        }
        return list;
    }

    public static <T> void swap(List<T> list, int i, int j){
        T temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }

    public static <T> boolean less(Collection<Integer> collection1, Collection<Integer> collection2, IntComparator comparator) {
        return comparator.compare( Collections.max(collection1,comparator), Collections.min(collection2,comparator) ) < 0;
    }

    
    // Example
    public static <T,R> Collection<R>
    map(Function<T,R> f,Collection<T> c) 
    {
        // Determine the dynamic type of the collection
        Class<? extends Collection> cls = c.getClass();
        try {
            // Create an object of the same dynamic type as c
            Collection<R> result = (Collection<R>)cls.newInstance();
            // type.cast(type.newInstance());
            // Copy the elements and apply op to them
            for ( T x : c )
                result.add(f.apply(x));
            return result;   
        }   
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Put your code for filter here ...

}
