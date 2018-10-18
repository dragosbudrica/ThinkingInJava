package generics.exercise27;
import java.util.*;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Number> nlist = new ArrayList<Integer>();
        // nlist.add(1);
        // nlist.add(2F);
        // nlist.add(new Object());
        nlist.add(null);
        Number n = nlist.get(0);
    }
}
