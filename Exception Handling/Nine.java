//Methods To Print Exception Information
public class Nine {
    public static void main(String[] args) {
        System.out.println("Hii");
        try {
            System.out.println(10/0);
        } catch (Exception e) {
           System.out.println(e.toString());
        }
    }
}
