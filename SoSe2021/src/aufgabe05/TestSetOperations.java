package aufgabe05;

public class TestSetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SetOperations s = new SetOperations();
		s.fill();
		s.fillBothUnion();
		s.print();
		
		s.fillBothIntersection();
		s.print();
		
		s.fillBothDifference();
		s.print();
		

	}

}
