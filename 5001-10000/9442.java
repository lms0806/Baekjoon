import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = 1;
        StringBuilder sb = new StringBuilder();
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	int n = Integer.parseInt(st.nextToken());
        	
        	if(n == 0) {
        		break;
        	}
        	
        	char[] c = st.nextToken().toCharArray();
        	
        	String[] arr = new String[n];
        	for(int i = 0; i < n; i++) {
        		arr[i] = br.readLine();
        	}

        	Arrays.sort(arr, new Comparator<String>() {
        		@Override
        		public int compare(String a, String b) {
        			int size = Math.min(a.length(), b.length());
        			for(int i = 0; i < size; i++) {
        				int na = 0, nb = 0;
        				for(int j = 0; j < c.length; j++) {
        					if(c[j] == a.charAt(i)) {
        						na = j;
        						break;
        					}
        				}
        				for(int j = 0; j < c.length; j++) {
        					if(c[j] == b.charAt(i)) {
        						nb = j;
        						break;
        					}
        				}
        				
        				if(na == nb) {
        					continue;
        				}
        				return na - nb;
        			}
        			return a.length() - b.length();
        		}
			});
        	
        	sb.append(String.format("year %d\n", t++));
        	for(String s : arr) {
        		sb.append(s).append("\n");
        	}
        }
        System.out.print(sb);
    }
}
