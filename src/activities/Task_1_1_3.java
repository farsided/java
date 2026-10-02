package activities;

abstract class Base {
    int instVar = 5;
    Base(String a) {
        System.out.println("Base class called, " + a);
    }

}

class Derived extends Base {
    Derived(String a) {
        super(a);
        System.out.println("Derived class called");
    }

    public static void main(String[] args) {
        Base b = new Base("upcast"){ int a = 3; void func() {
            System.out.println("instance variable: " + a + instVar);
        }


        };
        Derived d = new Derived("param"){ {
            System.out.println("derived");
        } };
        int c = 4;

        System.out.println(c + c);

        System.out.println("d instanceof Base is " + (d instanceof Base));
    }
}

public class Task_1_1_3 {
    public static void main(String[] args) {
        int check_number = 10;
        String message;
        for(int i = 1; i <= check_number; i++){
            message = (i%2==0) ? i + " is even number" : i + " is odd number";
            System.out.println(message);
        }
    }
}

