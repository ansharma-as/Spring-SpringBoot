
class A {
    public A(){
        super();
        System.out.println("in A");
    }

    public A(int n){
        super();
        System.out.println("in A parameterized constructor: " +n);
    }
}

class B extends A {    //inheritance
    public B(){
        super();
        System.out.println("in B");
    }

    public B(int n){
        super(n);
        System.out.println("in B parameterized constructor: " + n);
    }
}

// super is already there by default but if we want to use some specific constructor
// we need to specify that in super keyword like super(n)
class Hello {
    public static void main(String args[]) {
        B obj = new B(5);
    }
}