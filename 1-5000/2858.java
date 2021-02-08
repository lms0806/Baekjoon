import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int l = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		int temp = (l-4)/2;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < temp+1; i++){
            		if((temp-i) * i == w){
                		sb.append(temp-i+2).append(" ").append(i+2).append("\n");
                		break;
            		}
        	}
		System.out.print(sb);
	}
}
