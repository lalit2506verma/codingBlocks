package Lec28;

public class Client {
    public static void main(String[] args) {
        //case - 1
//        P obj = new P();
//        System.out.println(obj.d1);
//        System.out.println(obj.d2);
//        obj.fun();
//        obj.fun1();

        // Case - 2
        P obj = new C();
        System.out.println(obj.d);  // d1 from P
        System.out.println(obj.d1);  // d2 from P
        //System.out.println(obj.d2);  -> give error as at compile time d2 is not accessble for P type object
        System.out.println(((C)obj).d2);  // by typecasting we can make compiler to accessible for P type object
        System.out.println(((C)obj).d);

        // obj.fun(); -> (run time polimorphism) at compile timme fun look like for P but at runtime JVM check function name in the child class
        // obj.fun1(); -> run successfully fun1 run for parent class
        // obj.fun2(); -> as at runtime fun2 is accessiale but at compile time fun2 is not visible for compiler
        ((C)obj).fun2(); // run successfully

        // Case - 3
        // C obj1 = new P(); this will throw error as this type is not allowed
//        System.out.println(obj1.d);
//        System.out.println(obj1.d1);

    }
}
