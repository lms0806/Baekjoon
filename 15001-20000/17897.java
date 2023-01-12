import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			String name = br.readLine();
			
			boolean pea = false, pan = false;
			while(n --> 0) {
				String s = br.readLine();
				
				if(s.equals("pea soup")) {
					pea = true;
				}
				else if(s.equals("pancakes")) {
					pan = true;
				}
			}
			
			if(pea && pan) {
				sb.append(name);
				break;
			}
		}
		System.out.print(sb.length() == 0 ? "Anywhere is fine I guess" : sb);
	}
}
