package activities.test;

public class arithmetic {
    public static void main(String[] args) {
        System.out.println();
    }
}

class Demo {


    Demo() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance block");
    }
    public static void main(String[] args) {
        new Demo();
    }
}

class Counter {
    {
        int a = 3;
        System.out.println("1st non-static block");
    }
    { System.out.println("Instance block"); }
    Counter() { System.out.println("Constructor"); }
    static {
        System.out.println("1st Static block");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        new Counter(){
            {
                System.out.println("subclass non-static Instance block");
            }

            static {
                System.out.println("subclass static Instance block");
            }
        };
        new Counter();
    }
}