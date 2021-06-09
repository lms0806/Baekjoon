import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine()), c = Integer.parseInt(br.readLine());
			String[] aa = new String[a], bb = new String[b], cc = new String[c];
			
			for(int i = 0; i < aa.length; i++) {
				aa[i] = br.readLine();
			}
			for(int i = 0; i < bb.length; i++) {
				bb[i] = br.readLine();
			}
			for(int i = 0; i < cc.length; i++) {
				cc[i] = br.readLine();
			}
			
			for(int i = 0; i < aa.length; i++) {
				for(int j = 0; j < bb.length; j++) {
					for(int k = 0; k < cc.length; k++) {
						sb.append(aa[i]).append(" ").append(bb[j]).append(" ").append(cc[k]).append(".\n");
					}
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
