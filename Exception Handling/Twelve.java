//Finally Block
public class Twelve {
    public static void main(String[] args) {
        System.out.println("Hii");
        try {
            System.out.println("Try");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Catch");
        }
        finally{
            System.out.println("Finally");
        }
    }
}
