package week2.tuesday.assignment;

public class ReverseOddPosition 
{
     
	public static void main(String[] args) 
	{
		
		String test="I am a software tester";
	     String[] splitWords=test.split("");
	     String result="";
	     
	     for(int i=0;i<splitWords.length;i++)
	    
	      {
	    	 String word=splitWords[i];
	    	 if(i%2==1)
	    	 {
	    		 String reversed="";
	    			
	    			for(int j=word.length()-1;j>=0;j--) 
	    			{
	    				reversed +=word.charAt(j);
	    				
	    			}
	    			result +=reversed+"";
	    			
	    	 }
	    	 else
	    	 {
	    		 result +=word +"";
	    	 }
	      }
	     
	    
	     System.out.println("output : "+result.trim());
		
	}

}
