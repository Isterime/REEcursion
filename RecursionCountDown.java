public class RecursionCountDown
{
    public static void countDown(int l)
    {
        System.out.print(l);

        if (l > 0)
        {
            countDown(l -1);
        }
       // else
       // {
         //   System.out.print("0");
        //}
    }

    public static void main(String[] args)
    {
        countDown(5);
    }













}
