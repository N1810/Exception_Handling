public class Ten {
    public static void main(String[] args) {
        System.out.println("Hii");
        try {
            System.out.println(10/0);
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
}
