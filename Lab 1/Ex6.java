class Exercise6
{
    int i,n=3,sum1=0,sum2=0,diff=0;
    void cal()
    {
        for(i=1;i<=n;i++)
        {
            sum1=sum1+(i*i);
            sum2=sum2+i;
        }
        diff=sum1-(sum2*sum2);
        System.out.println("Difference:"+diff);
    }
}
class Ex6
{
	public static void main(String[] args) {
	    Exercise6 e=new Exercise6();
	    e.cal();
	}
}