package lambda;

public class Main {

    public static void main(String[] args) {
        SayHello sayHello = new SayHelloImpl();
        sayHello.sayHello();
    }
}
