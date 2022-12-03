package Abstraction;

public class ExecteClass extends Child1 {
    @Override
    void child2() {
        System.out.println("Inside Child 2");
    }

    public static void main(String[] args) {
        ExecteClass s=new ExecteClass();
        s.parent();
        s.child1();
        s.child2();

        abstractparent p =new ExecteClass();
        p.parent();
        p.child1();
    }
}
