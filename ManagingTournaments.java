import java.util.ArrayList;
public class ManagingTournaments extends ManagingMatches{
    private String tournamentName;
    private String startDate;
    private String endDate;
    private ArrayList<ManagingMatches> managingMatches = new ArrayList<>();
    private ArrayList<String> teams = new ArrayList<>();

    //constructor

    public ManagingTournaments() {
    }

    public ManagingTournaments(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    //setters()
    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setManagingMatches(ArrayList<ManagingMatches> managingMatches) {
        this.managingMatches = managingMatches;
    }

    public void setTeams(ArrayList<String> teams) {
        this.teams = teams;
    }

    //getters()
    public String getTournamentName() {
        return tournamentName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public ArrayList<ManagingMatches> getManagingMatches() {
        return managingMatches;
    }

    public ArrayList<String> getTeams() {
        return teams;
    }

    //addMatch()
    public void addMatch(ManagingMatches Matches){
       managingMatches.add(Matches);
    }

    //displayTournamentInfo()
    public void displayTournamentInfo(){
        System.out.println("Tournament Name is: " + getTournamentName());
        System.out.println("Tournament Start Date is: " + getStartDate());
        System.out.println("Tournament End Date is: " + getEndDate());

        System.out.println("Matches Detail");
        System.out.println();
        for (ManagingMatches i: managingMatches) {
            System.out.println("Match ID is: " + i.getMatchID());
            System.out.println("Match Date is: " + i.getMatchDate());
            System.out.println("Match Location is: " + i.getLocation());
            System.out.println("Match Team A is: " + i.getTeamA());
            System.out.println("Match Team B is: " + i.getTeamB());
            System.out.println(this.getTeamA() + " Team A Score is: " + i.getTeamAScore());
            System.out.println(this.getTeamB() + " Team B Score is: " + i.getTeamBScore());
            System.out.println("Match Winner Team is: " + i.getWinner());
            System.out.println();
        }//for

        System.out.println("Teams Detail");
        System.out.println();
        for (String i: teams) {
            System.out.println("Team name is: " + i);
        }
    }
}
