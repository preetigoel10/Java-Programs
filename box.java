//BOXING AND UNBOXING
import java.util.*;
class box
{
public static void main(String l[])
{
//BOXING
int a =20;
Integer j=a;//AUTO BOXING
Integer k = Integer.valueOf(a); // BOXING 
System.out.println(a+" "+j+" "+k);
Integer m = new Integer(5);
int n =m; //AUTO UNBOXING
int o = m.intValue(); //UNBOXING
System.out.println(m+" "+n+" "+o);

float d= 3.5f; 
Float e = d;
Float f = Float.valueOf(d);
System.out.println(d+" "+e+" "+f);
Float x = new Float(2.3);
float y = x;
float z = x.floatValue();
System.out.println(x+" "+y+" "+z);

char g = 'a';
Character h = g;
Character i = Character.valueOf(g);
System.out.println(g+" "+h+" "+i);

Character p = new Character('p'); 
char r = p;
char s = p.charValue();
System.out.println(p+" "+r+" "+s);
}
}