package Constructor;

public class ThisKey {
    int id;
    String name;
    ThisKey(String n){
        this(10);
        System.out.println("I am in only String Method !!");
        this.name=n;
        System.out.println("Name"+"="+name);
    }

    ThisKey(int i){
        this(20,"Pranav");
        System.out.println("I am Inside the Int Method !!");
        this.id=i;
        System.out.println("Name2"+"="+name);
        System.out.println("id2"+"="+id);
    }
    ThisKey(int j,String k){
        System.out.println("I am Inside String and Int and String Method !!");
        this.id=j;
        this.name=k;
        System.out.println("id3"+"="+id);
        System.out.println("Name3"+"="+name);
    }

    public static void main(String[] args) {
        ThisKey key=new ThisKey("Anuj");

    }
}
