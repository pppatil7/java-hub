package lambda;

public class Main {

    public static void main(String[] args) {
//        SayHello sayHello = new SayHelloImpl();
//        sayHello.sayHello();

//        SayHello i = new SayHello() {
//            @Override
//            public void sayHello() {
//                System.out.println("Hello..This is anonymous class");
//            }
//        };
//        i.sayHello();
//
//        SayHello i2 = new SayHello() {
//            @Override
//            public void sayHello() {
//                System.out.println("Hello..This is anonymous class second implementation");
//            }
//        };
//        i2.sayHello();


        //using interface using lambda

        SayHello s = () -> System.out.println("Hello..This is using lambda");

        s.sayHello();

        SayHello s2 = () -> System.out.println("Hello..This is using lambda second implementation");

        s2.sayHello();
    }
}
