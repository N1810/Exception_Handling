//Customized Exception Handling Using Try-Catch

public class Fourth {
    public static void main(String[] args) {
        System.out.println("Hii");
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println(10/2);
        }
        System.out.println("Done");
    }
}
