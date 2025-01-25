import java.util.ArrayList;

public class PlayersStats extends ManagingTournaments {
    private ArrayList<PlayerStats> playerStats = new ArrayList<>();

    //constructor
    public PlayersStats() {
    }

    //setter
    public void setPlayerStats(ArrayList<PlayerStats> playerStats) {
        this.playerStats = playerStats;
    }
    public void setTName(String name) {
        super.setTournamentName(name);
    }
    //constructor
    public PlayersStats(String Tname, ArrayList<PlayerStats> playerStats) {
        super(Tname);
        this.playerStats = playerStats;
    }

    //addPlayer()
    public void addPlayer(PlayerStats player){
      playerStats.add(player);
    }

    //recordRun()
    public void recordRun(String name, int runs){
        for (PlayerStats player: playerStats) {
            if (player.getName().equals(player)){
                player.setRun(player.getRun()+runs);
                return;
            }
        }
        System.out.println("Player Not Found");
    }

    //recordWicket()
    public void recordWicket(String name, int wickets){
        for (PlayerStats player: playerStats) {
            if (player.getName().equals(name)){
                player.setWicket(player.getWicket() + wickets);
                return;
            }
        }
        System.out.println("Player Not Found");
    }

    //displayStats()
    public void displayStats(){
        for (PlayerStats player: playerStats) {

            System.out.println("Player Name is: " + player.getName());
            System.out.println("Player Run is: " + player.getRun());
            System.out.println("Player Wicket is: " + player.getWicket());
            System.out.println();
        }
    }
}
