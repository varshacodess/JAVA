public class WideNArrow {
public static void main(String[] args) {
    byte b=5;
    short s=120;
    int i=10;
    long l=10;
    float f=10.5f;
    double d=10;
    char c=10;
    boolean bl=true;
//explicit type conversion-Narrowing-we loose the data while narrowing
    b=(byte)s;
    System.out.println(b);
    i=(int)f;
    System.out.println(i);

    
    
    
//Widening can be performed implicitly for the following datatypes

//float can be only stored in double
    //d=f;

//int can be stored in following datatypes  
//   f=i;
//   d=i;

//short can be stored in following datatypes
//    i=s;
//    l=s;
//    f=s;
//    d=s;

//byte can be stored in following datatypes
//    s=b;
//    i=b;
//    l=b;
//    f=b;
//    d=b;

//long can be stored only in float and double
//    f=l;
//    d=l;
    
//char can be stored in following datatypes
//char cant be stored in short and byte cause char ranges from 0 to 65536 and byte and short cant store that range values 
    // i=c;
    // l=c;
    // f=c;
    // d=c;
    // float f1='A';
    // System.out.println(f1);

}
    
}
