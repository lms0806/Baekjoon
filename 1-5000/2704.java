import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String[] str = br.readLine().split(":");
			
			String h = change(str[0]);
			String m = change(str[1]);
			String s = change(str[2]);
			
			for(int i = 0; i < 6; i++) {
				sb.append(h.charAt(i)).append(m.charAt(i)).append(s.charAt(i));
			}
			sb.append(" ").append(h + m + s).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String change(String s) {
		return String.format("%06d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(s))));
	}
}
