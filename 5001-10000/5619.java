import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] str = new int[n];
		for(int i = 0; i < n; i++) {
			str[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(str);
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < Math.min(n, 4); i++) {
			for(int j = 0; j < Math.min(n, 4); j++) {
				if(i == j) {
					continue;
				}
				arr.add(Integer.parseInt(String.valueOf(str[i]) + String.valueOf(str[j])));
			}
		}
		
		Collections.sort(arr);
		
		System.out.print(arr.get(2));
	}
}
