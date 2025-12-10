package edu.sabzi.sample.item11;

import java.util.*;

public class HashCodeTest {

    public static void main(String[] args) {
        Set<Point_BadHash> set = new HashSet<>();

        Point_BadHash p1 = new Point_BadHash(1, 2);
        Point_BadHash p2 = new Point_BadHash(1, 2);

        set.add(p1);
        set.add(p2);

        System.out.println("Set size: " + set.size());
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("---------------------------- ");

        Map<MutablePoint,String> map = new HashMap<>();
        MutablePoint point = new MutablePoint(1, 2);
        map.put(point, "value");

// now mutate fields
        point.setX(100);
        System.out.println(" map.get(point) " +  map.get(point));
    }
}
