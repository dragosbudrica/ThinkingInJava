package generics.exercise27;
import java.util.*;

public class NonCovariantGenerics {
    public static void main(String[] args) {
         // Compile Error: incompatible types:
         // List<Number> nlist = new ArrayList<Integer>();
    }
}