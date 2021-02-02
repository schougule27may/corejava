package throwsExamples;

import java.io.IOException;

// Case 2 : You declare the exception
class Z{
    void xyz() throws IOException{
        throw new IOException("Device Error"); //checked exception
    }
}
public class TestThrows2 {
    public static void main(String[] args) throws IOException {
        Z z = new Z();
        z.xyz();
    }
}
