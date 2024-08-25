package app;

public class Main {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();


        System.out.println("Hashcode of x is "
                + logger1.hashCode());
        System.out.println("Hashcode of y is "
                + logger2.hashCode());
        System.out.println("Hashcode of z is "
                + logger3.hashCode());

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        } else {
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }

        logger1.log("Here is log1");
        logger2.log("Here is log2");
        logger3.log("Here is log3");

    }

}
