package String;

public class RotateString {
public static boolean rotateString(String A,String B)
{
	return (A.length()==B.length() && (A+A).contains(B));
}
public static void main(String[] args)
{
	System.out.println(rotateString("abcde","bcdea"));
}
}
