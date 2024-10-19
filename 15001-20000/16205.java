import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken()) - 1;
    	String s = st.nextToken();
    	
    	StringBuilder[] arr = new StringBuilder[3];
    	
    	arr[n] = new StringBuilder(s);
    	
    	if(n == 0) {
    		arr[2] = new StringBuilder(arr[n]);
    		arr[2].setCharAt(0, (char) (arr[2].toString().charAt(0) - 'a' + 'A'));
    		
    		arr[1] = new StringBuilder();
    		char[] ch = arr[n].toString().toCharArray();
    		for(char c : ch) {
    			if('A' <= c && c <= 'Z') {
    				arr[1].append("_");
    				arr[1].append((char)(c - 'A' + 'a'));
    			}
    			else {
    				arr[1].append(c);
    			}
    		}
    	}
    	else if(n == 1) {
    		char[] ch = arr[n].toString().toCharArray();
    		
    		arr[0] = new StringBuilder();
    		boolean flag = false;
    		for(char c : ch) {
    			if(c == '_') {
    				flag = true;
    				continue;
    			}
    			arr[0].append(flag ? (char)(c - 'a' + 'A') : c);
    			flag = false;
    		}
    		
    		arr[2] = new StringBuilder(arr[0]);
    		arr[2].setCharAt(0, (char) (arr[0].toString().charAt(0) - 'a' + 'A'));
    	}
    	else {
    		char[] ch = arr[n].toString().toCharArray();
    		arr[0] = new StringBuilder(arr[n]);
    		arr[0].setCharAt(0, (char) (arr[0].toString().charAt(0) - 'A' + 'a'));
    		
    		arr[1] = new StringBuilder();
    		for(int i = 0; i < ch.length; i++) {
    			if('A' <= ch[i] && ch[i] <= 'Z') {
    				if(i != 0) {
    					arr[1].append("_");
    				}
    				arr[1].append((char)(ch[i] - 'A' + 'a'));
    			}
    			else {
        			arr[1].append(ch[i]);	
    			}
    		}
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < arr.length; i++) {
    		sb.append(arr[i]).append("\n");
    	}
    	System.out.print(sb);
    }
}
