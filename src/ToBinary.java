/**
 * Created by samuelort on 15-04-01.
 * Project name: Labb2
 */
public class ToBinary implements Function<Integer, String> {
    @Override
    public String apply(Integer x) {
        return Integer.toBinaryString(x);
    }
}
