import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(p);
		if(n >= 5) {
			arr.add(Math.max(p - 500, 0));
		}
		if(n >= 10) {
			arr.add((int)(p * 0.9));
		}
		if(n >= 15) {
			arr.add(Math.max(p - 2000, 0));
		}
		if(n >= 20) {
			arr.add((int)(p * 0.75));
		}
		
		Collections.sort(arr);
		
		System.out.print(arr.get(0));
	}
}
