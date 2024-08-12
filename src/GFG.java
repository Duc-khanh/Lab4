import java.io.*;

//class GFG
//{
//    public static void main (String[] args)
//    {
//        // String s set an empty string  and calling getLength()
//        String s = "";
//        try
//        {
//            System.out.println(getLength(s));
//        }
//        catch(IllegalArgumentException e)
//        {
//            System.out.println("IllegalArgumentException caught");
//        }
//
//        // String s set to a value and calling getLength()
//        s = "GeeksforGeeks";
//        try
//        {
//            System.out.println(getLength(s));
//        }
//        catch(IllegalArgumentException e)
//        {
//            System.out.println("IllegalArgumentException caught");
//        }
//
//        // Setting s as null and calling getLength()
//        s = null;
//        try
//        {
//            System.out.println(getLength(s));
//        }
//        catch(IllegalArgumentException e)
//        {
//            System.out.println("IllegalArgumentException caught");
//        }
//    }
//
//    // Function to return length of string s. It throws
//    // IllegalArgumentException if s is null.
//    public static int getLength(String s)
//    {
//        if (s == null)
//            throw new IllegalArgumentException("The argument cannot be null");
//        return s.length();
//    }
//}
//class GFG
//{
//    public static void main (String[] args)
//    {
//        String ptr = null;
//
//        if (ptr != null && ptr.equals("gfg"))
//            System.out.print("Same");
//        else
//            System.out.print("Not Same");
//    }
//}

class GFG
{
    public static void main (String[] args)
    {
        // Initializing String variable with null value
        String ptr = null;

        // Checking if ptr.equals null or works fine.
        try
        {
            // This line of code throws NullPointerException
            // because ptr is null
            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
}
