
import java.util.*;


public class BaseUtils {

	public static void main(String[] args) {
		BaseUtils bu= new BaseUtils();
		System.out.println(bu.base2Converter(6));
		System.out.println(bu.base26Converter(56));		
	}
	// keep divinding the input by 26 
	// keep stock of remainders
	public String base26Converter(int inp) {
	    StringBuilder sb= new StringBuilder();
		while(inp>0) {
	    		inp =inp-1;
			int rem=inp%26;
			char c= (char) ('A'+rem);
	     	        sb.insert(0,c);
			inp=inp/26;
		}	  
		return sb.toString();
	}
	
	
	
	public String base2Converter(int inp) {
	    StringBuilder sb= new StringBuilder();
		while(inp>0) {
			int rem=inp%2;
			String remainderAsString= (String) (""+rem);
		     	sb.insert(0,remainderAsString);
				inp=inp/2;
			}	  
	   return sb.toString();
	}
}

