import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		
		st.nextToken();
		
		System.out.print(print(Integer.parseInt(st.nextToken()) , Integer.parseInt(st.nextToken())));
	}
	
	public static String print(int m, int d) {
		if(m == 1) {
			return d >= 20 ? "Aquarius" : "Capricorn";
		}
		else if(m == 2) {
			return d >= 19 ? "Pisces" : "Aquarius";
		}
		else if(m == 3) {
			return d >= 21 ? "Aries" : "Pisces";
		}
		else if(m == 4) {
			return d >= 20 ? "Taurus" : "Aries";
		}
		else if(m == 5) {
			return d >= 21 ? "Gemini" : "Taurus";
		}
		else if(m == 6) {
			return d >= 21 ? "Cancer" : "Gemini";
		}
		else if(m == 7) {
			return d >= 23 ? "Leo" : "Cancer";
		}
		else if(m == 8) {
			return d >= 23 ? "Virgo" : "Leo";
		}
		else if(m == 9) {
			return d >= 23 ? "Libra" : "Virgo";
		}
		else if(m == 10) {
			return d >= 23 ? "Scorpio" : "Libra";
		}
		else if(m == 11) {
			return d >= 23 ? "Sagittarius" : "Scorpio";
		}
		return d >= 22 ? "Capricorn" : "Sagittarius";
	}
}
