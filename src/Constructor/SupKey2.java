package Constructor;

public class SupKey2 extends SupKey1 {
    SupKey2(int m){
        super();
        System.out.println("Inside SupKey2 Parameterized Constructor");

    }
    SupKey2(){
        super(20,"Pranav");
        System.out.println("Inside SupKey2 Blank Constructor");
    }

    public static void main(String[] args) {
        SupKey2 k1=new SupKey2();
        SupKey2 k2=new SupKey2(10);

    }

}
