package javaprogrammes;

//Java program to overload constructors
public class P_25_ConstructorOverloadingExample {
    int id;
    String name;
    int age;

    //creating two arg constructor
    P_25_ConstructorOverloadingExample(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    P_25_ConstructorOverloadingExample(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        P_25_ConstructorOverloadingExample s1 = new P_25_ConstructorOverloadingExample(111, "Karan");
        P_25_ConstructorOverloadingExample s2 = new P_25_ConstructorOverloadingExample(111, "Karan");
        s1.display();
        s2.display();
    }
}
