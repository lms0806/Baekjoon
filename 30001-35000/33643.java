import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String[] str = {"keys", "phone", "wallet"};
		boolean[] check = new boolean[3];
		
		while(t --> 0) {
			String s = br.readLine();
			
			for(int i = 0; i < 3; i++) {
				if(str[i].equals(s)) {
					check[i] = true;
					break;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			if(!check[i]) {
				sb.append(str[i]).append("\n");
			}
		}
		System.out.print(sb.length() == 0 ? "ready" : sb);
	}
}
