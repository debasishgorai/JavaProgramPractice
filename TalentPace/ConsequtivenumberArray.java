package TalentPace;

public class ConsequtivenumberArray {
	public static void main(String[] args) {
		
	
    int[] arr = {2, 3, 4, 7, 8, 10, 11, 12, 15};

   
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] == arr[i - 1] + 1) {  
            System.out.println(arr[i - 1] + " " + arr[i]);
        }
    }}

}
