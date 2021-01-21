package abstractexample.abstractkeyword.interfacekeyword;


interface Bank {
    float rateOfInterest();
    void printPassbook();
}

class SBI implements Bank {

    @Override
    public float rateOfInterest() {
        return 10.5f;
    }

    @Override
    public void printPassbook() {

    }
}

class ICICI implements Bank {

    @Override
    public float rateOfInterest() {
        return 9.5f;
    }
    @Override
    public void printPassbook() {

    }
}
public class TestInterfaceBank {

    public static void main(String[] args) {
        Bank b = new ICICI();
        System.out.println("ROI: ==>"+ b.rateOfInterest());
    }
}
