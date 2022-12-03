package Overloading;

public class Overload {
    public static void main(String[] args) {
        Overload m=new Overload();
        m.add(10,20);
        m.add(30,"Pranav");
        m.add(20,20);



    }
//    public void add(int i, int j){
//        System.out.println("int,int Method");
//    }
    public void add(int k,String s){
        System.out.println("int,String Method");
    }
//    public void add(Integer l, Integer m){
//        System.out.println("Integer, Integer Method");
//    }
    public void add(int j,Number v){
        System.out.println("Inside int,Number");
    }

}

