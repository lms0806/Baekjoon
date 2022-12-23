import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double weight = Double.parseDouble(br.readLine()), height = Double.parseDouble(br.readLine());
		
		double bmi = weight / (height * height);
		
		System.out.print(bmi > 25 ? "Over" : bmi < 18.5 ? "Under" : "Normal ");
		System.out.print("weight");
	}
}
