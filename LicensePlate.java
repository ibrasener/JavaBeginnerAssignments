
public class LicensePlate {

    public static void main(String[] args) {
    		int count = 0;	
    		
    		while (count< 5) {
    		
    		double FourLetterOrNumber = Math.round(Math.random());
 
    		if (FourLetterOrNumber==0) {
    			// Gives four random uppercase letters
    			// Upper characters code value between 65 and 90
    			//range formula: low + (int)(Math.random()*(high- low+1)
        int letter1 = 65+(int)(Math.random() * (90-65 + 1));
        int letter2 = 65+(int)(Math.random() * (90-65 + 1));
        int letter3 = 65+(int)(Math.random() * (90-65 + 1));
        int letter4 = 65+(int)(Math.random() * (90-65 + 1));
        // char letter4 = (char)(Math.random() * 26 + 'A');

        //there are 10 numbers 0,1,2,3,4,5,6,7,8,9 
	    //multiply with 10 gives 10 option randomly and
	    //adding char characters which starts with 0
        char number1 = (char)(Math.random() * 10 + '0');
        char number2 = (char)(Math.random() * 10 + '0');
        char number3 = (char)(Math.random() * 10 + '0');
        
        System.out.println("A randomly generated license plate: " + (char)letter1+(char)letter2+
        		(char)letter3+(char)letter4+" "+ number1 + number2+ number3);
        
    		}
    		
    		else {
    			// Gives three random uppercase letters
    			// Upper characters code value between 65 and 90
    			//range formula: low + (int)(Math.random()*(high- low+1)
    			int letter1 = 65+(int)(Math.random() * (90-65 + 1));
    		    int letter2 = 65+(int)(Math.random() * (90-65 + 1));
    		    int letter3 = 65+(int)(Math.random() * (90-65 + 1));
          
    		    //there are 10 numbers 0,1,2,3,4,5,6,7,8,9 
    		    //multiply with 10 gives 10 option randomly and
    		    //adding char characters which starts with 0
            char number1 = (char)(Math.random() * 10 + '0');
            char number2 = (char)(Math.random() * 10 + '0');
            char number3 = (char)(Math.random() * 10 + '0');
            char number4 = (char)(Math.random() * 10 + '0');
            System.out.println("A randomly generated license plate: " + (char)letter1+(char)letter2+
            		(char)letter3+" "+ number1 + number2+ number3+number4);
    			}
           
    		count ++;
    		} 		
    }	

}    
