import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			arr.add(i + 1);
		}
		
		int index = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for(int i = n; i > 0; i--) {
			index = (index + m - 1) % i;
			sb.append(arr.remove(index));
			if(i > 1) {
				sb.append(", ");
			}
		}
		sb.append(">");
		
		System.out.print(sb);
	}
}
