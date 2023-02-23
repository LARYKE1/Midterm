package javaMidterm;


public class Runner {

	public static void main(String[] args) {
		Node n=new Node();
		Node n1=new Node();


		n.insert(1);
		n.insert(3);
		n.insert(5);

		n1.insert(1);
		n1.insert(2);
		n1.insert(3);

		n.show();
		n1.show();

		Node result=new Node();

		
		result.head=Solution.mergeTwoLists(n.head,n1.head);
		result.show();
		
		
		
		
	}

	
}
