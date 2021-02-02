package throwsExamples;

import java.io.IOException;

public class TestThrows1 {

    void m() throws IOException {
        //logic of device / file handling
        throw new IOException("Device Error"); //checked exception
    }

    void n() throws IOException {
        m(); // terminate
        //lines
    }
    void p1() {
        try {
            n();
        }catch (NullPointerException | IOException e) {
            System.out.println("Exception handled");
        }
    }
    void p() throws IOException {
            n();
    }


    public static void main(String[] args) throws IOException {
        TestThrows1 obj = new TestThrows1();
        obj.p1();
        System.out.println("Normal flow");
    }
}
