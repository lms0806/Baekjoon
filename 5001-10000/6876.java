import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String[] str = {"ABC", "DEF", "GHI", "JKL", "MNO", "PROS", "TUV", "WXYZ"};
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine().replaceAll("-", "");
			
			for(int i = 0; i < 10; i++) {
				char c = s.charAt(i);
				
				if(i == 3 || i == 6) {
					sb.append("-");
				}
				
				if(c >= '0' && c <= '9') {
					sb.append(c);
				}
				else {
					for(int j = 0; j < str.length; j++) {
						if(str[j].contains(c + "")) {
							sb.append(j + 2);
							break;
						}
					}
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
