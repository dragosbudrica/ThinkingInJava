package generics.exercise17;
import generics.watercolors.*;
import java.util.*;
import static generics.exercise17.Sets.*;
import static net.mindview.util.Print.*;
import static generics.watercolors.Watercolors.*;

public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 =
                EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<Watercolors> set2 =
                EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
        print("set1: " + set1);
        print("set2: " + set2);
        print("union(set1, set2): " + union(set1, set2));
        Set<Watercolors> subset = intersection(set1, set2);
        print("intersection(set1, set2): " + subset);
        print("difference(set1, subset): " +
                difference(set1, subset));
        print("difference(set2, subset): " +
                difference(set2, subset));
        print("complement(set1, set2): " +
                complement(set1, set2));
    }
}
