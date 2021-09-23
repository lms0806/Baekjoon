import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] n = new int[size];
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = 0; i < size; i++) {
			n[i] = Integer.parseInt(br.readLine());
			set.add(n[i]);
		}
		
		int max = 0;
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			int num = iter.next();
			
			int[] arr = n.clone();
			
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
					max = Math.max(max, count);
				}
			}
		}
		System.out.print(max);
	}
}
