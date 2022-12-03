package Simple;

public class ImpExpPromotion {
    public static void main(String[] args) {
        int i=20000;
        System.out.println(i);
        byte j= (byte) i;
        long k= 32;
        i= (int) k;
        long m=i;
        float l= 32.5F;
        double d =34.5;
        double d1=l;
        float l1= (float) d;
        System.out.println(l1+","+d1);
        //Wrapper Classes
        Integer i1=i;
        System.out.println(i1);
        Long l2= Long.valueOf(i1);
        System.out.println(l2);
        Long l3= Long.valueOf(i);
        //Integer i2=l;
        Long l4= Long.valueOf(i1);
        Integer i4= l2.intValue();
        Float f4= l2.floatValue();
        Double d4=d;
        int i5= f4.intValue();
        System.out.println(i5);
    }
}
