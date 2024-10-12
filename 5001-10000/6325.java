import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = 1;
        StringBuilder answer = new StringBuilder();
        while(true) {
        	int n = Integer.parseInt(br.readLine());
        	
        	if(n == 0) {
        		break;
        	}
        	
        	TreeSet<Character> set = new TreeSet<>();
        	set.add('a');
        	while(n --> 0) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		char a = st.nextToken().charAt(0);
        		st.nextToken();
        		char b = st.nextToken().charAt(0);
        		
        		if(set.contains(b)) {
        			set.add(a);
        		}
        		else {
        			set.remove(a);
        		}
        	}
        	
        	StringBuilder sb = new StringBuilder();
        	for(char c : set) {
        		sb.append(c).append(" ");
        	}
        	
        	answer.append("Program #").append(t++).append("\n").append(sb.length() == 0 ? "none" : sb).append("\n\n");
        }
        System.out.print(answer);
    }
}
