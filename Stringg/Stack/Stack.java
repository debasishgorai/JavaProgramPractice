package Stack;

public class Stack {
private Node head=null;
private int count=0;
public void push(Object e) {
	if(head==null) {
		head=new Node(e,null) ;
		count++;
		return;
}
	head=new Node(e, head);
	count++;
}
public Object pop() {
	if(isemp()) return null;
	Object e=head.ele;
	head=head.next;
	count--;

	return e;
	
}
@Override
public String toString() {
    if (isemp()) return "Stack is empty";

    StringBuilder sb = new StringBuilder();
    Node current = head;
    while (current != null) {
        sb.append(current.ele).append(" ");
        current = current.next;
    }
    return "Stack: " + sb.toString().trim();
}

// Return the current size of the stack
public int size() {
    return count;
}

public Object peek() {
	if(isemp()) return null;
	return head.ele;
	
}
private boolean isemp() {
	// TODO Auto-generated method stub
	return count==0;
}
}
