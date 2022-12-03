package String;

import java.lang.reflect.Array;

public class String_Practice {
    public static void main(String[] args) {
        String s= new String("ABC");// Created using new keyword
        String sl= "ABC";// Created using Literal
        String s2="PQR";

        System.out.println("refernce equality = "+(s ==sl));//reference Equality
        System.out.println("Content Equality = "+ (s.equals(sl)));

        System.out.println("**********************************************************************");

        System.out.println("String Methods");
        String s3= "Pranav"; // Created in SCP
        String s4=new String("Patil");// Created in Heap
        String s6="PranavPatil";
        String s7="pranav";

        System.out.println("String s3 = "+s3);
        System.out.println("String s4 = "+s4);
        System.out.println("String s6 = "+s6);
        System.out.println("String s7 = "+s7);

        String fullname=s3.concat(s4); // s3 in scp but full name will create on Heap
        System.out.println("Concat fullname = "+fullname);

        String s5=s3+s4;

        System.out.println("s3+s4= "+s5);

        System.out.println("s5 == s6 = "+(s5 == s6));
        System.out.println("Equals s5 and s6 = "+(s5.equals(s6)));
        System.out.println("Equals Ignore case s3  and s7 = " +(s3.equalsIgnoreCase(s7)));

        char c=s4.charAt(3);
        System.out.println("Character at index 3 for Patil ="+ c);

        System.out.println("***************String Into Array**************");

        char[] charname=s6.toCharArray();

        System.out.println("charname"+charname);

        for (int i = 0; i < charname.length; i++) {
            System.out.println(charname[i]);
        }

        System.out.println("Length of String s6="+s6.length());
        System.out.println("Substing only start = "+s6.substring(6));
        System.out.println("Substing only start and end ="+s6.substring(0,6));
        boolean b=s6.contains("Pr"); //It is case sensitive
        System.out.println("Contain Function Value = "+b);

        char[] ch={'a','b','z','x','r'};

        String ch1="";

        ch1=ch1.copyValueOf(ch);

        System.out.println("CopyValueOf() array into string = "+ch1);

        int in=s6.indexOf("Patil");
        int in1=s6.indexOf('P');
        int in2=s6.indexOf('P',7);
        System.out.println(in);
        System.out.println(in1);
        System.out.println("When indexof() can't find value ="+in2);  //Value is not found then write -1

        System.out.println("*********************intern() Method ***********************");

        String s8="Pranav";//Created in SCP
        String s9=new String("Pranav");//Created in Heap
        System.out.println("s8 = "+s8);
        System.out.println("s9 = "+s9);

        System.out.println("Refernce equality s8 amd s9 before intern "+(s8==s9));

//        s9.intern(); //Create new value in heap but s9 refernce is not moved (Refernce still false)
        s9=s9.intern();
        System.out.println("Refernce equality s8 amd s9 After intern "+(s8==s9));

        System.out.println("*******************************End Of intern() **********************");

        String s10=s6.toUpperCase();
        System.out.println(s10);

        String s11=s6.toLowerCase();
        System.out.println(s11);

        String s12=s6.replace('P','A');
        System.out.println(s12);

        String s14="Pranav Patil";

        String s13=s14.trim();
        System.out.println(s13);

        String s15=s6.concat(String.valueOf('c'));
        System.out.println(s15);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>> Exceptions <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        String sg="Patil";
        int si=Integer.valueOf(sg);

        System.out.println(si); // NumberFormatException
    }
}
