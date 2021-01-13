package thisusage.constt.call;

public class B {

    A obj;

    B(A obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println("obj.data: =>" +  obj.data);
    }
}
