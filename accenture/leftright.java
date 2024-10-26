package accenture;

public class leftright {
public static void main(String[] args) {
	int[]a= {1,0,0,0,1,0,1,0};
	sort(a);
	for(int n:a) {
		System.out.println(n);
	}
}

static void sort(int[] a) {
	// TODO Auto-generated method stub}

	
    int left = 0;
    int right = a.length - 1;

    while (left < right) {
        // Move the left pointer to the right until we find a 1
        while (a[left] == 0 && left < right) {
            left++;
        }
        // Move the right pointer to the left until we find a 0
        while (a[right] == 1 && left < right) {
            right--;
        }
        // Swap the elements at left and right pointers if left < right
        if (left < right) {
            // Swap 1 and 0
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            
            // Move the pointers inward
            left++;
            right--;
        }
    }
	
	
	
	
	
	
}
}