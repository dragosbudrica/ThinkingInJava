package generics.exercise17;
import java.util.*;

public class Sets {
    // Yes, it can be done!
    @SuppressWarnings("unchecked")
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result;
       if(a instanceof EnumSet) {
            result = ((EnumSet)a).clone();
       } else {
            result = new HashSet<T>(a);
       }
       result.addAll(b);
       return result;
    }
    @SuppressWarnings("unchecked")
    public static <T>
    Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result;
        if(a instanceof EnumSet) {
            result = ((EnumSet)a).clone();
        } else {
            result = new HashSet<T>(a);
        }
        result.retainAll(b);
        return result;
    }
    @SuppressWarnings("unchecked")
    public static <T> Set<T>
    difference(Set<T> superset, Set<T> subset) {
        Set<T> result;
        if(superset instanceof EnumSet) {
            result = ((EnumSet)superset).clone();
        } else {
            result = new HashSet<T>(superset);
        }
        result.removeAll(subset);
        return result;
    }
    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }
}
