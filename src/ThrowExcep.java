class ThrowExcep
{
    static void fun()
    {
        try
        {
            throw new NullPointerException("demo");//throw trong Java được sử dụng để ném một ngoại lệ một cách chủ động
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }

    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main.");
        }
    }
}


