import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		String str = "";
		if(m == 0) {
			bw.write("0\n");
		}
		while(m != 0) {
			if(m%n == 10) {
				str+="A";
			}
			else if(m%n == 11) {
				str+="B";
			}
			else if(m%n == 12) {
				str+="C";
			}
			else if(m%n == 13) {
				str+="D";
			}
			else if(m%n == 14) {
				str+="E";
			}
			else if(m%n == 15) {
				str+="F";
			}
			else {
				str+= Integer.toString(m%n);
			}
			m/=n;
		}
		String[] strs = str.split("");
		str = "";
		
		for(int i = strs.length - 1; i >= 0; i--) {
			str += strs[i];
		}
		bw.write(str+"\n");
		bw.flush();

		br.close();
		bw.close();
	}
}
