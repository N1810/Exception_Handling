
public class Eleven {
    public static void main(String[] args) {
        System.out.println("Hii");
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
