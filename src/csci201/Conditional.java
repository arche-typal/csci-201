package csci201;
public class Conditional {
    public static void main(String[] args) {
        int i1 = 2, i2 = 4, larger, limit;
        if (i1 > i2)
            larger = i1;
        else
            larger = i2;
        System.out.println("larger = " + larger);
        larger = i1 > i2 ? i1 : i2;
        System.out.println("larger = " + larger);

        if (i1 > i2)
            limit = i1 * 2;
        else
            limit = i2 * 2;
        System.out.println("limit = " + limit);
        limit = i1 > i2 ? i1 * 2 : i2 * 2;
        System.out.println("limit = " + limit);
    }
}
