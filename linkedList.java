import java.io.PrintWriter;

public class linkedList {
	private listNode listHead;
	linkedList(){
		listHead = new listNode();
	}
	public boolean isEmpty() {
		return (listHead.next==null);
	}
	public void listInsert(String x) {
		//step 1
		listNode walker = listHead;
		//step 2
		while ((walker.next!=null)&&(x.compareTo(walker.next.data)>0)) 
			walker = walker.next;
		//step 3
		//step 4
		listNode NN = new listNode(x);
		//step 5
		NN.next = walker.next;
		walker.next = NN;		
	}
			
	public void printList(PrintWriter os) {
		listNode walker = listHead;
		os.print("listHead --> (dummy, ");
		while (walker.next != null) {
			walker=walker.next;
			os.print(walker.data+") --> ("+walker.data+", " );
		}
		os.println("null)");
	}

}
