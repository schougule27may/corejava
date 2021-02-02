package throwsExamples;

import java.io.IOException;
// Case 1 : You handle the exception.
class M {
    void abc() throws IOException {
        throw new IOException("Device Error");
    }
}
public class TestThrow2 {

    public static void main(String[] args) {
        try {
            M m = new M();
            m.abc();
        }catch (Exception e) {
            System.out.println("Exception handled");
        }
        System.out.println("Normal flow ....");

    }
}
