/**
 * Created by samuelort on 15-03-31.
 * Project name: Labb2
 */
public class IsEven implements Predicate<Integer> {

    @Override
    public boolean test(Integer x) {
        return x % 2 == 0;
    }
}
