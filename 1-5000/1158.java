import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			arr.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		int num = 0;
		while(arr.size() > 1) {
			num = (num + k - 1) % arr.size();
			sb.append(arr.remove(num)).append(", ");
		}
		sb.append(arr.remove(0)).append(">");
		
		System.out.println(sb);
	}
}
