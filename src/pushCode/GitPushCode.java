package pushCode;

public class GitPushCode {

	public static void main(String[] args) {
	
		String x="yourHomePrice";
		String rev="";
		for(int i=x.length()-1;i>=0;i--) {
			rev=rev+x.charAt(i);
		}
		

System.out.println(rev);
	
	
	String car="ToyotaCamray";
	String h= "";
	
	for(int i=car.length()-1; i>=0; i--) {
	h=h+car.charAt(i);
	}
	System.out.println(h);
	
	
	String city="Washington DC";
	String state="";
	
	for(int i=city.length()-1; i>=0; i--) {
		
	state=state+city.charAt(i);
	}
	System.out.println (state);
	
	
 String card="Credit&DebitCard";
	String house="";
	for(int i=card.length()-1; i>=0; i--) {
		house =house+card.charAt(i);
	}
		System.out.println(house);
	}
	}
	


	

