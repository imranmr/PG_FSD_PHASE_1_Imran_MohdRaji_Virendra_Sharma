package assignments;

class Operation{  
	 int square(int n){  
	  return n*n;  
	 }  
	}  

class Aggregation{
	rectangle op;
	
	int area(int length) {
		op = new rectangle();
		int areasquare = op.area(length,length);
		return areasquare;
	}
}
class rectangle{
	Operation op;
	
	int area(int l,int b) {
		op = new Operation();
		return op.square(l);
		
	}
}
public class AggregationAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation ag = new Aggregation();
		
		System.out.println("Area of rectangle with length = width = "+ag.area(5));
	}

}
