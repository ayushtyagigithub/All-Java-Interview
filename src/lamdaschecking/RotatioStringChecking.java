package lamdaschecking;

public class RotatioStringChecking {
    public static void main(String [] args)
    {
        CheckRotation cr=(str1,str2)->{
            if(str1.length()!=str2.length())
            {
                return false;
            }

            String com=str1+str1;

            if(com.contains(str2))
            {
                return true;
            }
            else {
                return false;
            }
        };

        boolean res=cr.isRotation("abcd","bcda");
        System.out.println(res);
    }
}
interface CheckRotation
{
    public boolean isRotation(String str1,String str2);
}
