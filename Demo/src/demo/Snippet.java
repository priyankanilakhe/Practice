package demo;

public class Snippet
{
	public static void main(String s[]) throws Exception
	{
	 try{
	            assert false;
	            System.out.println("t");
	        } 
	        catch(Error e)
	         {System.out.println("c");
	            throw new Exception();
	        }
	        finally{
	            System.out.println("f");
	        }
	}
}

