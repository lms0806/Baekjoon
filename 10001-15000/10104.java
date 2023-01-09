import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			arr.add(i);
		}
		
		int t = Integer.parseInt(br.readLine());
		
		boolean[] check = new boolean[n + 1];
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 1; i * num <= arr.size(); i++) {
				check[arr.get(i * num - 1)] = true;
			}
			
			ArrayList<Integer> arr2 = new ArrayList<>();
			for(int i = 1; i <= n; i++) {
				if(!check[i]) {
					arr2.add(i);
				}
			}
			
			arr = arr2;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : arr) {
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
}
