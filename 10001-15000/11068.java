import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {			
			sb.append(solve(Integer.parseInt(br.readLine())) ? 1 : 0).append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean solve(int n) {
		for(int i = 2; i <= 64; i++) {
			ArrayList<Integer> arr = new ArrayList<>();
			int num = n;
			
			while(num != 0) {
				arr.add(num % i);
				num /= i;
			}
			
			boolean flag = true;
			for(int j = 0; j < arr.size() / 2; j++) {
				if(arr.get(j) != arr.get(arr.size() - 1 - j)) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				return true;
			}
		}
		return false;
	}
}
