import org.junit.Test;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.*;

public class Test1 {
    public String name;
}

class Tests{
    public static String solution(String s) throws UnknownHostException {

        InetAddress address = InetAddress.getByName("www.baidu.com");
        System.out.println(address.getHostAddress());
      String str = s.toLowerCase();
      return str;
    }
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(solution("Hello World"));
    }
}

        //ip地址校验
      /*String ipAddress = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."
              + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
              + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
              + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
      Pattern ip = Pattern.compile(ipAddress);

      Scanner scanner = new Scanner(System.in);

      String ipadd = scanner.next();

      System.out.println(ip.matcher(ipadd).matches());*/

       /*String str = "Hello   World  Hey";
       String[] str1=str.split(" ");

       System.out.println(str1.length);
       for(int i=0;i<str1.length;i++) {
           if (str1[i] !=" ")
           {System.out.println(str1[i]);}

       }*/
