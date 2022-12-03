package Constructor;

public class Simple {
    int id;
    String name;
    int scid;

    public static void main(String[] args) {
//        Simple s=new Simple();
//        s.id=10;
//        s.name="Pranav";
//        System.out.println(s.id);
//        System.out.println(s.name);
        Simple s2=new Simple(20,"Anuj");
        Simple s3=new Simple(30,"Aditya");
        Simple s4=new Simple(30,12345,"Aditya"); //Constructor Overloading

    }

    Simple(int i,String n){
        //Parameterized Constructor
        id=i;
        name=n;
        System.out.println("ID"+" "+id);
        System.out.println("Nmae"+" "+name);

    }
    Simple(int i,int j,String n){
        id=i;
        name=n;
        scid=j;
        System.out.println("ID"+" "+id);
        System.out.println("Nmae"+" "+name);
        System.out.println("SchoolID"+" "+j);
    }
}
