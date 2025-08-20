package lambda;

public class Main {

    public static void main(String[] args) {
//        SayHello sayHello = new SayHelloImpl();
//        sayHello.sayHello();

        SayHello i = new SayHello() {
            @Override
            public void sayHello() {
                System.out.println("Hello..This is anonymous class");
            }
        };
        i.sayHello();
    }
}
