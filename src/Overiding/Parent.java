package Overiding;

import java.security.PublicKey;

public class Parent {
    public void method1(){
        System.out.println("Parent Method 1");
    }
    private void method2(){
        System.out.println("Private Method2 Parent");
    }

    protected void method3(){
        System.out.println("Protected parent Method3");
    }

    public int method4(){
        System.out.println("Inside int method of Parent");
        return 0;
    }

    public Object method5(){
        System.out.println("Inside Parent Object method5");
        return 0;
    }
    public Integer method6(){
        System.out.println("Inside Parent Integer method6");
        return 0;
    }

    public static void method7(){
        System.out.println("Inside Parent Integer method7");
    }

    public static void sameStatic(){
        System.out.println("Inside Parent Integer sameStatic");
    }
}
