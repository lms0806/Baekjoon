import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				arr.add(st.nextToken());
			}
			
			int num = (arr.indexOf(br.readLine()) + Integer.parseInt(br.readLine())-1) % arr.size();
			
			sb.append(arr.get(num)).append("\n");
			arr.clear();
		}
		System.out.print(sb);
	}
}
