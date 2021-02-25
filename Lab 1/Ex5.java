class Exercise5
{
    int i,n=10,sum=0;
    void cal()
    {
        for(i=1;i<=n;i++)
        {
            if(i%3==0 || i%5==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum:"+sum);
    }
}
class Ex5
{
	public static void main(String[] args) {
	    Exercise5 e=new Exercise5();
	    e.cal();
	}
}