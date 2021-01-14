package polymorphism.overriding;

class Bank {
    int getRateOfInterest() {
        return 10;
    };
}

class  SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    };
    int getRateOfInterest(int a) {
        return 7;
    };
}

class  ICICI extends Bank {
    int getRateOfInterest() {
        return 6;
    };
}

class  AXIS extends Bank {
    int getRateOfInterest() {
        return 5;
    };
}
public class Test2 {

    public static void main(String[] args) {
       Bank bank = new Bank();
        System.out.println(bank.getRateOfInterest());

        SBI sbi = new SBI();
        System.out.println("sbi :-" + sbi.getRateOfInterest());
        System.out.println("sbi :-" + sbi.getRateOfInterest(1));

        ICICI  icici = new ICICI();
        System.out.println(icici.getRateOfInterest());

        AXIS
                axis = new AXIS();
        System.out.println(axis.getRateOfInterest());

    }
}
