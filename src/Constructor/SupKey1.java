package Constructor;

public class SupKey1 {
    int id;
    String name;

    SupKey1(){
        System.out.println("Inside SupKey1 Blank constuctor");
    }
    SupKey1(int i,String n){
        System.out.println("Inside Supkey1 Parameterized constructor");
        this.id=i;
        this.name=n;
        System.out.println("ID"+"="+id);
        System.out.println("Name"+"="+name);
    }

    public static void main(String[] args) {
        SupKey1 s1=new SupKey1();
        SupKey1 s2=new SupKey1(30,"Anuj");
    }

}
