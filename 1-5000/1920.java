import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		HashSet<Integer> arr = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			sb.append(arr.contains(Integer.parseInt(st.nextToken())) ? 1 : 0).append("\n");
		}
		System.out.print(sb);
	}
}
