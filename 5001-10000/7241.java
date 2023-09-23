import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j) {
					continue;
				}
				
				for(int k = 0; k < 3; k++) {
					if(i == k || j == k) {
						continue;
					}
					
					arr.add(num[i] * 100 + num[j] * 10 + num[k]);
				}
			}
		}
		
		Collections.sort(arr);
		
		int answer = 0;
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) == n) {
				answer = i + 1;
				break;
			}
		}
		System.out.print(answer);
		
	}
}
