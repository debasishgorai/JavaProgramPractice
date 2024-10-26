package ListIterator;
import java.util.ArrayList;
import java.util.List;


public class ListIterator1 {
public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");

	        ListIterator <String> iterator = list.listIterator();

	        System.out.println("Traversing forward:");
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println(element);

	            if (element.equals("Banana")) {
	                iterator.set("Blueberry");  // Replace "Banana" with "Blueberry"
	            }
	        }

	        System.out.println("\nModified List: " + list);

	        System.out.println("\nTraversing backward:");
	        while (iterator.hasPrevious()) {
	            System.out.println(iterator.previous());
	        }
	    

}
}
