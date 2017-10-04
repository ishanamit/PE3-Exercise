import java.util.Scanner;

public class Pe3
{
  public static void main(String[] args)
  {


   Scanner inp=new Scanner(System.in);
   String[] str=inp.nextLine().split(" ");
   String strnew;
   int i,j;
   int l=str.length;
  for(i=0;i<l;i++)
  { 
	 
   strnew=str[i].replaceAll("[aeiouAEIOU]","");
   System.out.println(strnew);
  }
}
}
