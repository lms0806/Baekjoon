import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		
		ArrayList<String> arr = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			arr.add(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			if(arr.contains(s)) {
				arr.remove(arr.indexOf(s));
			}
		}
		
		System.out.print(arr.get(0));
	}
}
