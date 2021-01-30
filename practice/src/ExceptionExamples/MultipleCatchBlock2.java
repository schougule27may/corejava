package ExceptionExamples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MultipleCatchBlock2 {

    public static void main(String[] args) throws IOException {
        FileWriter file = null;
        try {

            file = new FileWriter("/tmp/text.txt");

            file.write("my start of program");
            String s = null;
            System.out.println(s.length());
            int a[] = new int[5];
            a[5] = 30/s.length();
            file.write("after completion");
            file.close();
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException occurs");
            //apply rule1
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurs");
            //apply rule2
        }catch (NullPointerException e){
            System.out.println("NullPointerException occurs");
            //apply rule2
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            file.close();
            System.out.println("always executed");
        }
    }
}
