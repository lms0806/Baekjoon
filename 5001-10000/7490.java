import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	static int n;
	static TreeSet<String> set;
	static String[] op = {"+", "-", " "};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	n = Integer.parseInt(br.readLine());
        	set = new TreeSet<>();
        	
        	dfs(1, "1");
        	
        	for(String s : set) {
        		sb.append(s).append("\n");
        	}
        	sb.append("\n");
        }
        System.out.print(sb);
    }
    
    public static void dfs(int depth, String s) {
    	if(depth == n) {
    		if(calc(s.replaceAll(" ", ""))) {
    			set.add(s);
    		}
    		return;
    	}
    	
    	for(String o : op) {
    		dfs(depth + 1, s + o + String.valueOf(depth + 1));
    	}
    }
    
    public static boolean calc(String s) {
    	StringTokenizer st = new StringTokenizer(s, "+|-", true);
    	int sum = Integer.parseInt(st.nextToken());
    	while(st.hasMoreTokens()) {
    		if("+".equals(st.nextToken())){
    			sum += Integer.parseInt(st.nextToken());
    		}
    		else {
    			sum -= Integer.parseInt(st.nextToken());
    		}
    	}
    	return sum == 0;
    }
}
