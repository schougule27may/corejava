package throwsExamples;

import java.io.IOException;

public class TestThrows3 {

    void m() throws IOException {
        //logic of device / file handling
        throw new IOException("File not found Error"); //checked exception

    }

    void n() throws IOException {
        m(); // terminate
        //lines
    }
    void p1() throws IOException {
        try {
            n();
        }catch (NullPointerException | IOException e) {
            System.out.println("Exception handled");
            throw new IOException("Device Error"); //checked exception
        }
    }
    void p() throws IOException {
            n();
    }


    public static void main(String[] args) throws IOException {
        TestThrows3 obj = new TestThrows3();
        obj.p1();
        System.out.println("Normal flow");
    }
}
