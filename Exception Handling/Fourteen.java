//Finally Block Dominates Return Statement 

 class Fourteen {
    public static void main(String[] args) {
        System.out.println(m1());
    }  
    public static int m1() {
        try {
            return 777;
        } catch (Exception e) {
            //TODO: handle exception
            return 888;
        }
        finally{
            return 999;
        }
      }
    }

