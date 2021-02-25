class Ex7 {
 boolean checkNumber(int n)
 {
  int digit=n%10;
  n=n/10;
  while(n>0)
  {
   if(digit<=n%10)
   {
    return false;
   }
   digit=n%10;
   n=n/10;
  }
  return true;
}

public static void main(String[] args)
{
 Ex7 e=new Ex7();
 System.out.println(e.checkNumber(15745));
}
}
