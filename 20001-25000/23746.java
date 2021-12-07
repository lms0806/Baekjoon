import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<String[]> arr = new ArrayList<>();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr.add(new String[] {st.nextToken(), st.nextToken()});
		}
		
		String answer = "";
		for(String s : br.readLine().split("")) {
			for(String[] ss : arr) {
				if(s.equals(ss[1])) {
					answer += ss[0];
					break;
				}
			}
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		System.out.print(answer.substring(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken())));
	}
}
