package encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestEncapsulation {

    public static void main(String[] args) {
        Account acc1 = new Account();

        acc1.setAcc_no(1L);
        acc1.setName("Sandeep");
        acc1.setEmail("schougule27may@gmail.com");
        acc1.setAmount(1000F);

        Account acc2 = new Account();

        acc2.setAcc_no(2L);
        acc2.setName("Sherry");
        acc2.setEmail("sherry@gmail.com");
        acc2.setAmount(2000F);

        Account acc3 = new Account();

        acc3.setAcc_no(3L);
        acc3.setName("Neha");
        acc3.setEmail("neha@gmail.com");
        acc3.setAmount(5000F);

        Account acc4 = new Account();

        acc4.setAcc_no(4L);
        acc4.setName("Mobin");
        acc4.setEmail("mobin@gmail.com");
        acc4.setAmount(10f);

        List<Account> myCustomers  = new ArrayList<>();
        myCustomers.add(acc1);
        myCustomers.add(acc2);
        myCustomers.add(acc3);
        myCustomers.add(acc4);

        Account[] accounts = new Account[4];
        accounts[0] = acc1;
        accounts[1] = acc2;
        accounts[2] = acc3;
        accounts[3] = acc4;

        System.out.println("My All Account holders");

        for(Account account: accounts){
            System.out.println("Acc: "+account);
        }


        List<Account> accountsWithGreaterThan500 =
                myCustomers.stream().filter(t->t.getAmount()<500f).collect(Collectors.toList());
        for(Account account: accountsWithGreaterThan500){
            System.out.println("Acc: "+account);
        }

    }
}
