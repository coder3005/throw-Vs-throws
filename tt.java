/* throw Vs thorws */
class test
{
    void div(int a,int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        else
        {
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        test t=new test();
        try
        {
            t.div(20,0);
        }
        catch(Exception e)
        {
            System.out.println("The value of b is zero");
        }
    }
}
