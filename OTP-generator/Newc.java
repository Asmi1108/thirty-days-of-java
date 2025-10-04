// Java code togenerate OTP
import java.util.*;

public class Newc
{
    static char[] OTP(int len)
    {
        System.out.println(&quot;Generating OTP using random() : &quot;);
        System.out.print(&quot;You OTP is : &quot;);

        String numbers = "0123456789";

        Random rndm_method = new Random();

        char[] otp = new char[len];

        for (int i = 0; i &lt; len; i++)
        {
            otp[i] =
             numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return otp;
    }
    public static void main(String[] args)
    {
        int length = 4;
        System.out.println(OTP(length));
    }
}
