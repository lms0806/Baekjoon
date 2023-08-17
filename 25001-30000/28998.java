import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		HashSet<Integer> set = new HashSet<>();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			set.add(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
		}
		
		System.out.print(set.size());
	}
}
