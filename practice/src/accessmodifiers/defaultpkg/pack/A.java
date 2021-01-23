package accessmodifiers.defaultpkg.pack;

class A {
       void msg(){
         System.out.println("Hello A");
     }

     public static void main(String[] args) {
         A a = new A();
         a.msg();
     }
}
