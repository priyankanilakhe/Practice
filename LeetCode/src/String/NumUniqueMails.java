package String;
class NumUniqueMails {
    public static int numUniqueEmails(String[] emails) {
    	 int count=0;
         for(int i=0;i<emails.length;i++)
         {
            boolean a= emails[i].matches("[a-zA-Z0-9.+]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+");
            if(a) count++;
         }
         return count;
    }
    
    public static void main(String[] args) {
    	int a=numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"});
    	System.out.println(a);
	}
}