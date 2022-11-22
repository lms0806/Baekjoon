import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			arr.add(num, i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = arr.size() - 1; i >= 0; i--) {
			sb.append(arr.get(i)).append(" ");
		}
		System.out.println(sb);
	}
}
