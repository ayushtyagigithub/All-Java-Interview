package lamdaschecking;

public class Pallendome {
    public static void main(String [] args)
    {
        CheckPallendome b=(str)->{
            StringBuffer sb=new StringBuffer(str);
            String rev=sb.reverse().toString();
            if(rev.equals(str))
            {
                return true;
            }
            return  false;
        };
        boolean res=b.isPallendome("racecar");
        System.out.println(res);
    }
}

interface CheckPallendome
{
    public  boolean isPallendome(String str);
}
