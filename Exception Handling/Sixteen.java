//Nested Try Catch Finally
public class Sixteen {
    public static void main(String[] args) {
         System.out.println("Out Of The Try");
         try {
             System.out.println("Inside Try");
             System.out.println(10/0);
         } catch (ArithmeticException e) {
            System.out.println("Inner Catch");
         }
        
         finally{
            System.out.println("Inner Finally");
         }
         System.out.println("Outside Of Inner Try Catch Finally");
        try {
            System.out.println("Nested Try");
        } catch (Exception e) {
          System.out.println("Nested Catch");
        }
        finally{
            System.out.println("Outer Finally");
        }
    }
  
}
