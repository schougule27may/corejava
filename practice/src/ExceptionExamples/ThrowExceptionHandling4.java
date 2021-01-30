package ExceptionExamples;

public class ThrowExceptionHandling4 {

    public static void main(String[] args) {
        int i=50;
        int j=0;
        int data;
        try {
            i = 10/2;
            //stat1
            //stat2
            if(j >0) {
                System.out.println("We need o value greater than zero");
                return;
            }
            data=i/j ;//may throw exception
        }catch (Exception e){
            //resolving the exception in catch block
            System.out.println(i/(j+2));
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
