package codingQuestion;


	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class MiddleElementUsingLinkedList {
	    Node head;

	    public Node findMiddle() {
	        if (head == null) {
	            return null; 
	        }

	        Node slow = head;
	        Node fast = head;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;       // Move slow pointer one step
	            fast = fast.next.next; // Move fast pointer two steps
	        }

	        return slow; // Slow pointer is now at the middle
	    }

	    // Method to add a new node at the end
	    public void add(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	   
	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	MiddleElementUsingLinkedList list = new MiddleElementUsingLinkedList();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);

	        list.printList();

	        Node middle = list.findMiddle();
	        if (middle != null) {
	            System.out.println("Middle element: " + middle.data);
	        } else {
	            System.out.println("The list is empty.");
	        }
	    
	}

}
