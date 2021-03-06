package java8features.methodReference;

interface Messageable {
    Message getMessage(String msg);
}
class Message  {
    Message(String msg) {
        System.out.println(msg);
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello world");
    }
}
