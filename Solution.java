package javaMidterm;

public class Solution {
	public static Node mergeTwoLists(Node list1, Node list2) {
		Node result=new Node();
		Node temp=result;
		
		while (list1!=null && list2!=null) {
			

			if(list1.data<list2.data) {
				
				temp.next=list1;
				list1=list1.next;
				
			}else {
				
				temp.next=list2;
				list2=list2.next;
				
			}
			
			temp=temp.next;
		}
		
		if(list1==null) {
			temp.next=list2;
		}
		if(list2==null) {
			temp.next=list1;
		}
		
		return result.next;
	}
}
