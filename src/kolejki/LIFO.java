package kolejki;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class LIFO {
    private final List<Integer> values = new ArrayList<>();

    public void push(int x) {
        values.add(x);
    }

    public Integer pop() {
        if(this.values.size() == 0) {
            throw new EmptyStackException();
        }
        Integer result = values.get(values.size()-1);
        values.remove(values.size()-1);
        return result;
    }
}
