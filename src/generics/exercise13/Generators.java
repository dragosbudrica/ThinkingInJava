package generics.exercise13;
import generics.Fibonacci;
import generics.coffee.*;
import java.util.*;
import net.mindview.util.*;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
    public static <T> Collection<T>
    fill(Collection<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }
    public static <T> List<T>
    fill(List<T> list, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            list.add(gen.next());
        return list;
    }
    public static <T> Queue<T>
    fill(Queue<T> queue, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            queue.add(gen.next());
        return queue;
    }
    public static <T> Set<T>
    fill(Set<T> set, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            set.add(gen.next());
        return set;
    }

    // Yes, you can overload to distinguish between List and LinkedList
    public static <T> LinkedList<T>
    fill(LinkedList<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }
    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(
                new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        List<Coffee> coffee2 = fill(
                new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        Queue<Coffee> coffee3 = fill(
                new ArrayDeque<>(), new CoffeeGenerator(), 4);
        Set<Coffee> coffee4 = fill(
                new LinkedHashSet<>(), new CoffeeGenerator(), 4);
        LinkedList<Coffee> coffee5 = fill(
                new LinkedList<>(), new CoffeeGenerator(), 4);
        for(Coffee c : coffee)
            System.out.println(c);
        System.out.println("=============================================");
        for(Coffee c : coffee2)
            System.out.println(c);
        System.out.println("=============================================");
        for(Coffee c : coffee3)
            System.out.println(c);
        System.out.println("=============================================");
        for(Coffee c : coffee4)
            System.out.println(c);
        System.out.println("=============================================");
        for(Coffee c : coffee5)
            System.out.println(c);
        System.out.println("=============================================");
        Collection<Integer> fnumbers = fill(
                new ArrayList<Integer>(), new Fibonacci(), 12);
        List<Integer> fnumbers2 = fill(
                new ArrayList<Integer>(), new Fibonacci(), 12);
        Queue<Integer> fnumbers3 = fill(
                new ArrayDeque<Integer>(), new Fibonacci(), 12);
        Set<Integer> fnumbers4 = fill(
                new LinkedHashSet<Integer>(), new Fibonacci(), 12);
        LinkedList<Integer> fnumbers5 = fill(
                new LinkedList<Integer>(), new Fibonacci(), 12);
        for(int i : fnumbers)
            System.out.print(i + ", ");
        System.out.println("\n=============================================");
        for(int i : fnumbers2)
            System.out.print(i + ", ");
        System.out.println("\n=============================================");
        for(int i : fnumbers3)
            System.out.print(i + ", ");
        System.out.println("\n=============================================");
        for(int i : fnumbers4)
            System.out.print(i + ", ");
        System.out.println("\n=============================================");
        for(int i : fnumbers5)
            System.out.print(i + ", ");
    }
}