package thisusage.arguement;

public class S2 {


    void m(S2 obj) {
        System.out.println("method is invoked");
    }
    void p() {
        System.out.println("p is started");
        m(this);
        System.out.println("p is completed");

    }

    public static void main(String[] args) {
        S2 s1 = new S2();
        s1.p();
    }
}
