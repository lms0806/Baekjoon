import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		System.out.print(solve(Integer.parseInt(br.readLine()), br.readLine()));
	}
	
	public static String solve(int size, String s) {
		StringTokenizer st = new StringTokenizer(s);
		
		int num = 0;
		for(int i = 0; i < size; i++) {
			num++;
			String str = st.nextToken();
			if(!str.equals("mumble") && Integer.parseInt(str) != num) {
				return "something is fishy";
			}
		}
		
		return num == size ? "makes sense" : "something is fishy";
	}
}
