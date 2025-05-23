package as;

public class D {
    public static void main(String[] args) {
        A c1 = new C();  // c1 is superclass(A type) object reference // c1 is a A kind of object
        C c2 = new C();
       //C a1 = new A();

        c1.m1(c2);
    }
}

class A {
    void m1(A a){
        System.out.println("A");
    }

}

class B extends A {
    void m1(B b){
        System.out.println("B");
    }
}

class C extends B {
    void m1(C c){
        System.out.println("C");
    }
}
