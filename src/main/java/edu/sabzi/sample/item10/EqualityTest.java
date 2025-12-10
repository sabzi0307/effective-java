package edu.sabzi.sample.item10;

public class EqualityTest {

    public static void main(String[] args) {
        Point p = new Point(1, 2);
        ColorPoint_Broken cp = new ColorPoint_Broken(1, 2, "RED");

        System.out.println("p.equals(cp): " + p.equals(cp)); // false
        System.out.println("cp.equals(p): " + cp.equals(p)); // true (symmetry broken)
    }
}
