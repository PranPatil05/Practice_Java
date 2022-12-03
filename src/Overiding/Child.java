package Overiding;

public class Child extends Parent {
//    protected void method1(){
//        System.out.println("method1 Child");
//        //Child access modifier scope should be greater
//        //Parent Public -> Child Public
//        //Default (Parent) -> Default,Protected,Public (Child)
//    }
    public void method1(){
        System.out.println("Inside Child Method1");
    }
    private void method2(){
        System.out.println("Inside Child Method2");
        //Private method can not be override
    }
    public void method3(){
        System.out.println("Public child method3");
    }

    //Return Type cases -
    // 1. Primitve Data Type - Data type must be same

    public int method4(){
        System.out.println("Inside int child method4");
        return 0;
        // Primitve Data type should be same for both parent and child
    }

    //2. Object Data Types - Child class data types must be same or child are allowed.
    public Character method5(){
        System.out.println("Inside Child Character method5");
        return 0;
    }

//    public Object method6(){
//
//        return 0;
//    } // Incompatible error

//   ***********************************************************************************************
    // Static Method Overriding

//    public void method7(){
//        System.out.println("Inside Child Character method7");
//    }

    public static void sameStatic(){
        System.out.println("Inside Child sameStatic");
    } //Method Hiding



    public static void main(String[] args) {
        //Case 1 -
        Parent par=new Child();//Child constructor so child method called.
        par.method1();
        par.method3();
//        par.method2();//Cast Qualifier as method2 present in Parent with Private A.M

        //Case 2-
//        Child ch=new Parent();//incompatible Type exception. We can not call parent with cihlid reference

        // Case 3-

        Parent par1=new Parent();
        par1.method1();
        par1.method3();
//        par1.method2();//Private access so another class it is not accessable.

        // Case 4 -

        Child child=new Child();
        child.method1();
        child.method2();
        child.method3();


    }



}
