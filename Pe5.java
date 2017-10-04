import java.util.Scanner;
import java.util.Arrays;
public class Pe5
 {
   public static void main(String[] args)
  {
   Scanner inp=new Scanner(System.in);
   String[] strarr=inp.nextLine().split(",");
   int[] intarr=new int[strarr.length];
   int i;
  for(i=0;i<strarr.length;i++)
    intarr[i]=Integer.parseInt(strarr[i]);


 
int k=0;
int d;

for(d=5;d>=0;d--)
{
 if(intarr[6]-intarr[d]!=(6-d))
{
  k=1; 
  break;
}
}
if(k==1)
System.out.println("the numbers are not consecutive");

else if(k==0)
System.out.println("the numbers are consecutive");
	}
}


