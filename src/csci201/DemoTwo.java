package csci201;
public class DemoTwo {
    public static void main(String[] args) {
        int i = 1;
        while(i > 3) {
            System.out.println("i = " + i);
            i++;
        }
        do {
            System.out.println("i = " + i);
//            i++;
        } while (i > 3);
    }
}
