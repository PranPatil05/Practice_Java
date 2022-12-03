package Array;

public class ArrayPra {
    int[] ar={1,2,3,4};

    public static void main(String[] args) {
        System.out.println("...................Define Array class level.........................");
        ArrayPra ob=new ArrayPra();
        int length= ob.ar.length;
//        int length2=ar.length;  # If we make Array static then it is valid
        System.out.println("Class level defined array length = "+length);
        for (int i=0; i<length; i++){
            System.out.println(ob.ar[i]);
        }

        String[] sar=new String[3];
        sar[0]="Pranav";
        sar[1]="Pranav";
        sar[2]="Pranav";

        for (int i=0; i< sar.length; i++){
            System.out.println(sar[i]);
        }


        System.out.println(">>>>>>>>>>> Different Data Types stored <<<<<<<<<<<<<<<");

        Object[] obar={1,2,"Pranav",10.5};

        for (int i=0; i< obar.length; i++){
            System.out.println(obar[i]);
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>> Exceptions <<<<<<<<<<<<<<<<<<<<<<<");

//        int[] inar={1,2,"Patil"}; #Incompatible type comple type Exception
//        int[] inar={1,2,1.5}; //Incompatible type comple type Exception

        int[] inar1= new int[2];

        inar1[0]=1;
        inar1[1]=1;
        inar1[2]=1; //java.lang.ArrayIndexOutOfBoundsException
    }
}
