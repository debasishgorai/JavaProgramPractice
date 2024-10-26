package Queue;

public class Queue {
private Node head=null;
private int count=0;
public void add(Object e) {
	if(head==null) {
		head= new Node(e,null);
		count++;
		return;
	}
	Node curr=head;
	while(curr.next!=null){
		curr=curr.next
;	}
	curr.next=new Node(e,null);
	count++;




}
public Object poll() {
	if(isempty()) return null;
	Object e=head.ele;
	head=head.next;
	count--;
	
	return e;
	
}
public Object front() {
	if(isempty())return null;
	return head.ele;
	
}
@Override
public String toString() {
    if (isempty()) return "Queue is empty";
    StringBuilder sb = new StringBuilder();
    Node current = head;
    while (current != null) {
        sb.append(current.ele).append(" ");
        current = current.next;
    }
    return "Queue: " + sb.toString().trim();
}

private boolean isempty() {
	// TODO Auto-generated method stub
	return count==0;
}
}
