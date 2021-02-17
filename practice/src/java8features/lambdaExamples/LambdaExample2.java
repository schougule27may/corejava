package java8features.lambdaExamples;

interface Sayble2 {
    public String say(String name);
}
/*class SayableImpl implements Sayble2 {
    @Override
    public String say(String name) {
        return name;
    }
}*/

public class LambdaExample2 {

    public static void main(String[] args) {
        Sayble2 s1 =(name) -> {
            return "Hello  "+ name;
        };
        System.out.println(s1.say("Sandeep"));
        Sayble2 s2 = name -> {
            return "Hello " + name;
        };
        System.out.println(s2.say("Sherry"));
    }
}
