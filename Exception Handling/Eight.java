//Cotrol Flow Inside Try-catch
//Case-4:- Statement 4 or 5  Exception
public class Eight {
    public static void main(String[] args) {
        try {
            System.out.println("Hii");
            System.out.println("Hello");
            System.out.println("No Problem");
        } catch (NullPointerException e) {
             System.out.println(10/0);
          
        }
        System.out.println(10 /0);
    }
}
