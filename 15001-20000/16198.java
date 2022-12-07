import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int n, answer = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		dfs(arr, 0);
		
		System.out.print(answer);
	}
	
	public static void dfs(ArrayList<Integer> arr, int sum) {
		if(arr.size() == 2) {
			answer = Math.max(answer, sum);
			return;
		}
		
		for(int i = 1; i < arr.size() - 1; i++) {
			int number = arr.get(i - 1) * arr.get(i + 1);
			int num = arr.remove(i);
			dfs(arr, sum + number);
			arr.add(i, num);
		}
	}
}
