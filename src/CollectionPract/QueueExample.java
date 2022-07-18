package CollectionPract;
import java.util.*;
public class QueueExample {
	public static void main(String[] args) {
	PriorityQueue<String> bank=new PriorityQueue<String>();{
	bank.add("BOI");
	bank.add("Stae Bank of India");
	bank.add("Icici");
	bank.add("Hdfc");
	bank.add("Axis");
	System.out.println("First element:" +bank.element());
	System.out.println("The queue is :" +bank);
	System.out.println("The removed element is:" +bank.remove("Hdfc"));
	System.out.println("The queue is :" +bank);
	System.out.println("The poll element is:" +bank.poll());
	System.out.println("The queue is :" +bank);
	
}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*int rollno;
	String name;
	long mb_no;
		public QueueExample(int rno,String name,long mb_no) {
			this.rollno=rno;
			this.name=name;
			this.mb_no=mb_no;
		}
public static void main(String[] args) {
	PriorityQueue<QueueExample>queue=new PriorityQueue<QueueExample>();
	QueueExample qe1 = new QueueExample(1,"Purva",46556877);
	QueueExample qe2 = new QueueExample(2,"Ashay",94655345);
	QueueExample qe3 = new QueueExample(3,"Rucha",88856877);
	queue.offer(qe1);
	queue.offer(qe2);
	queue.offer(qe3);
	System.out.println("First Element" +queue.element());


	
}*/

