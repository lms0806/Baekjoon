import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] year = {1967, 1969, 1970, 1971, 1972, 1973, 1973, 1974, 1975, 1976, 1977, 1977, 1979, 1980, 1983, 1984, 1987, 1993, 1995, 1997, 1999, 2002, 2003, 2013, 2016};
		String[] name = {"DavidBowie", "SpaceOddity", "TheManWhoSoldTheWorld", "HunkyDory", "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars", "AladdinSane", "PinUps", "DiamondDogs", "YoungAmericans", "StationToStation", "Low", "Heroes", "Lodger", "ScaryMonstersAndSuperCreeps", "LetsDance", "Tonight", "NeverLetMeDown", "BlackTieWhiteNoise", "1.Outside", "Earthling", "Hours", "Heathen", "Reality", "TheNextDay", "BlackStar"};
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			int answer = 0;
			StringBuilder sbs = new StringBuilder();
			for(int i = 0; i < 25; i++) {
				if(a <= year[i] && year[i] <= b) {
					sbs.append(year[i]).append(" ").append(name[i]).append("\n");
					answer++;
				}
			}
			sb.append(answer).append("\n").append(sbs);
		}
		System.out.print(sb);
	}
}
