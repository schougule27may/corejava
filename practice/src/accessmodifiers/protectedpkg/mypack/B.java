package accessmodifiers.protectedpkg.mypack;

import accessmodifiers.protectedpkg.pack.A;

public class B extends A {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
            b.msg();

    }
}
