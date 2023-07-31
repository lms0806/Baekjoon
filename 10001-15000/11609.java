import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		Name[] str = new Name[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			str[i] = new Name(st.nextToken(), st.nextToken());
		}
		
		Arrays.sort(str);
		
		StringBuilder sb = new StringBuilder();
		for(Name s : str) {
			sb.append(s.first).append(" ").append(s.second).append("\n");
		}
		System.out.print(sb);
	}
}

class Name implements Comparable<Name>{
	String first, second;
	
	public Name(String first, String second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public int compareTo(Name o) {
		if(this.second.equals(o.second)) {
			return this.first.compareTo(o.first);
		}
		return this.second.compareTo(o.second);
	}
}
