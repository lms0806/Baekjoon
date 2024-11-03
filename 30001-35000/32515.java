import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String qa = br.readLine(), a = br.readLine();
		String qb = br.readLine(), b = br.readLine();
		
		boolean flag = true;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a.length(); i++) {
			if(qa.charAt(i) == qb.charAt(i)) {
				if(a.charAt(i) == b.charAt(i)) {
					sb.append(a.charAt(i));
				}
				else {
					flag = false;
					break;
				}
			}
		}
		System.out.print(flag ? sb : "htg!");
	}
}
