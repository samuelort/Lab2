/**
 * Created by samuelort on 15-04-01.
 * Project name: Labb2
 */
public class IsPrime implements Predicate<Integer> {
    @Override
    public boolean test(Integer x) {
        int i = 2;
        while (i < x) {
            if (x % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
