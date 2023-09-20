import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = {"Algorithm", "DataAnalysis", "ArtificialIntelligence", "CyberSecurity", "Network", "Startup", "TestStrategy"};
        String[] c = {"204", "207", "302", "B101", "303", "501", "105"};
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	String str = br.readLine();
        	
        	for(int i = 0; i < s.length; i++) {
        		if(s[i].equals(str)) {
        			sb.append(c[i]).append("\n");
        			break;
        		}
        	}
        }
        System.out.print(sb);
    }
}
