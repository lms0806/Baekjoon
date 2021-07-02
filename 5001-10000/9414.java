import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			ArrayList<Integer> arr = new ArrayList<>();
			
			while(true) {
				int a = Integer.parseInt(br.readLine());
				
				if(a == 0) {
					break;
				}
				
				arr.add(a);
			}
				
			Collections.sort(arr);
			
			boolean istrue = true;
			int answer = 0;
			for(int i = arr.size() - 1; i >= 0; i--) {
				answer += 2 * Math.pow(arr.get(i), arr.size() - i);
				if(answer > 5000000) {
					istrue = false;
					break;
				}
			}
			
			sb.append(istrue ? answer : "Too expensive").append("\n");
		}
		System.out.print(sb);
	}
}
