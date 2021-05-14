import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String answer = "";
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			if(!str.equals("tapioka") && !str.equals("bubble")) {
				answer += str + " ";
			}
		}
		System.out.print(answer.equals("") ? "nothing" : answer);
	}
}
