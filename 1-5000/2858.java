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
		for(int i = 0; i <= temp; i++){
            if((temp-i) * i == w){
                System.out.print(temp-i+2 + " ");
                System.out.println(i+2);
                break;
            }
        }
	}
}
