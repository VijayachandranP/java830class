
public class reversingANumberUsingRecursion {
	int q=1;
	int p=1;
	public static void main(String[] args) {
		
     reversingANumberUsingRecursion y= new reversingANumberUsingRecursion();
     y.reverse(321);
    		  
	}
    public void reverse (int x){
    if (x<10){
    	System.out.print(x);
    }
	
    else{
    	System.out.print(x%10);
    	x=x-x%10;
    	x=x/10;
    	reverse(x);
    	
    }	

    }



}