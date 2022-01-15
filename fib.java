public class fib
{

    public static int fib(int f)
    {
        if ( f == 1)
        {
            return 1;
        }

        if (f == 0)
        {
            return 0;
        }

         return fib(f -1) + fib (f-2);
         
    }


     public static void main(String[] args)
     {
        System.out.println(fib(9));
     }
}
