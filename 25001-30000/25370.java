import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine()) - 1;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = 1; i <= 9; i++) {
			set.add(i);
		}
		
		while(n --> 0) {
			ArrayList<Integer> arr = new ArrayList<>();
			
			for(Integer a : set) {
				arr.add(a);
			}
			
			for(int i = 0; i < arr.size(); i++) {
				for(int j = 1; j <= 9; j++) {
					set.add(arr.get(i) * j);
				}
			}
		}
		System.out.print(set.size());
	}
}

// 9 36 
