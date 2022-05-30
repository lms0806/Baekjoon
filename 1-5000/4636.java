import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        while(true) {
        	int t = Integer.parseInt(br.readLine());
        	
        	if(t == -1) {
        		break;
        	}
        	
        	String a = "", b = "";
        	int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        	while(t --> 0) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		
        		int num = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        		String s = st.nextToken();
        		
        		if(min > num) {
        			min = num;
        			b = s; 
        		}
        		
        		if(max < num) {
        			max = num;
        			a = s;
        		}
        	}
        	
        	sb.append(a).append(" took clay from ").append(b).append(".\n");
        }
        System.out.print(sb);
    }
}
