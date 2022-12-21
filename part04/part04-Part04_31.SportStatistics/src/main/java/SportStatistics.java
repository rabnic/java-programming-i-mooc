
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Match> matches = new ArrayList();
        // Get file name
        System.out.println("File: ");
        String file = scan.nextLine();
        // Create file reader
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            //Read entire file
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                String[] parts = line.split(",");
                String home = parts[0];
                String away = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);
                
                matches.add(new Match(home, away, homeScore, awayScore));
                        
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        for (Match match: matches) {
            if (match.getHomeTeam().equals(team) || match.getAwayTeam().equals(team)) {
                if (match.winner().equals(team)) {
                    wins++;
                } else {
                    losses++;
                }
                games++;
            }
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        

    }

}
