package inheritance;

class A {
    int x = 42;

    void foo() {
        System.out.println("A::foo()"); bar();
    }

    void foo(double d) {
        System.out.println("A::foo(" + d + ")");
    }

    void bar() {
        System.out.println("A::bar(): x = " + x);
    }
}

class B extends A {
    int x = 6;

    void foo(int i) {
        System.out.println("B::foo(" + i + ");");
    }

    void bar() {
        System.out.println("B::bar(): x = " + x);
    }

    void bar(String s) {
        System.out.println("B::bar(" + s + ")");
    }


    public static void main(String args[]){

        A aa = new A();
        B bb = new B();
        A ab = new B();


        aa.foo();           // A::foo() A::bar() x = 42
        bb.bar("hi");    // B::bar(hi)
        bb.foo();           // A::foo() B::bar() x = 6
        ab.foo();           // A::foo() B::bar() x = 6
        ab.foo(3.0);    // A::foo(3.0)
        ab.bar();           // B::bar() x = 6
        int i = 1;
        ab.foo(i);      // A::foo(1.0)  -> foo(int) is not supported by static type A. Convert to double & take supermethod!
        //ab.bar("hi");     //todo-> Error because static type A does not support a method bar() which takes a String
    }
}
