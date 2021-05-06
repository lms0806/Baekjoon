import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		
		String a = br.readLine();
		String b = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		if(num%2 == 0) {
			if(a.equals(b)) {
				sb.append("Deletion succeeded");
			}
			else {
				sb.append("Deletion failed");
			}
		}
		else {
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == b.charAt(i)) {
					sb.append("Deletion failed");
					break;
				}
				if(i == a.length()-1) {
					sb.append("Deletion succeeded");
				}
			}
		}
		System.out.print(sb);
	}
}
