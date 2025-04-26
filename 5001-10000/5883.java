import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] arr = new int[size];
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			set.add(arr[i]);
		}
		
		int answer = 0;
		for(int num : set) {
			int count = 1, number = arr[0];
			for(int i = 1; i < arr.length; i++) {
				if(arr[i] != num) {
					if(arr[i] == number) {
						count++;
					}
					else {
						number = arr[i];
						count = 1;
					}
					answer = Math.max(answer, count);
				}
			}
		}
		System.out.print(answer);
	}
}
