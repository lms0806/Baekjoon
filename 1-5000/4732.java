import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[][] s = {{"A"}, {"A#", "Bb"}, {"B", "Cb"}, {"B#", "C"}, {"C#", "Db"}, {"D"}, {"D#", "Eb"}, {"E", "Fb"}, {"F", "E#"}, {"F#", "Gb"}, {"G"}, {"G#", "Ab"}};
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String strs = br.readLine();
			
			if(strs.equals("***")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(strs);
			
			int n = Integer.parseInt(br.readLine());
			while(st.hasMoreTokens()) {
				String str = st.nextToken();
				
				int idx = 0;
				boolean flag = false;
				for(int i = 0; i < s.length; i++) {
					for(int j = 0; j < s[i].length; j++) {
						if(s[i][j].equals(str)) {
							flag = true;
							idx = i + n;
							break;
						}
					}
					if(flag) {
						break;
					}
				}
				
				if(idx >= s.length) {
					idx -= s.length;
				}
				if(idx < 0) {
					idx += s.length;
				}
				
				sb.append(s[idx][0]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
