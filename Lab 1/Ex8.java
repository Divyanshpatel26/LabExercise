class Exercise8
{
    int i,n=7;
    boolean cal()
    {
        for(i=0;i<n;i++)
        {
            if((2*i)==n)
            {
                return true;
            }
        }return false;
    }
}
class Ex8
{
	public static void main(String[] args) {
	    Exercise8 e=new Exercise8();
	    System.out.println(e.cal());
	}
}