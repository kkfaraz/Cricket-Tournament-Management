import java.util.ArrayList;

public class MatchResult extends ManagingMatches{
    private String Nameteam1;
    private String Nameteam2;
    private int Scoreteam1;
    private int Scoreteam2;
    private int Pointteam1;
    private int Pointteam2;

    //constructor
    public MatchResult() {
    }

    public MatchResult(String nameteam1, String nameteam2, int scoreteam1, int scoreteam2) {
        Nameteam1 = nameteam1;
        Nameteam2 = nameteam2;
        Scoreteam1 = scoreteam1;
        Scoreteam2 = scoreteam2;
    }

    public MatchResult(String nameteam1, String nameteam2, int scoreteam1, int scoreteam2, int pointteam1, int pointteam2) {
        Nameteam1 = nameteam1;
        Nameteam2 = nameteam2;
        Scoreteam1 = scoreteam1;
        Scoreteam2 = scoreteam2;
        Pointteam1 = pointteam1;
        Pointteam2 = pointteam2;
    }
    public MatchResult(int matchID,String nameteam1, String nameteam2, int scoreteam1, int scoreteam2,int pointteam1, int pointteam2) {
        super(matchID);
        Nameteam1 = nameteam1;
        Nameteam2 = nameteam2;
        Scoreteam1 = scoreteam1;
        Scoreteam2 = scoreteam2;
        Pointteam1 = pointteam1;
        Pointteam2 = pointteam2;
    }
    public MatchResult(String tournamentName, String startDate, String endDate, ArrayList<ManagingMatches> managingMatches, ArrayList<String> teams, String nameteam1, String nameteam2, int scoreteam1, int scoreteam2, int pointteam1, int pointteam2) {

        Nameteam1 = nameteam1;
        Nameteam2 = nameteam2;
        Scoreteam1 = scoreteam1;
        Scoreteam2 = scoreteam2;
        Pointteam1 = pointteam1;
        Pointteam2 = pointteam2;
    }

    //setter
    public void setNameteam1(String nameteam1) {
        Nameteam1 = nameteam1;
    }
    public void setNameteam2(String nameteam2) {
        Nameteam2 = nameteam2;
    }
    public void setScoreteam1(int scoreteam1) {
        Scoreteam1 = scoreteam1;
    }
    public void setScoreteam2(int scoreteam2) {
        Scoreteam2 = scoreteam2;
    }
    public void setPointteam1(int pointteam1) {Pointteam1 = pointteam1;}
    public void setPointteam2(int pointteam2) {
        Pointteam2 = pointteam2;
    }

    //getter
    public String getNameteam1() {
        return Nameteam1;
    }
    public String getNameteam2() {
        return Nameteam2;
    }
    public int getScoreteam1() {
        return Scoreteam1;
    }
    public int getScoreteam2() {
        return Scoreteam2;
    }
    public int getPointteam1() {
        return Pointteam1;
    }
    public int getPointteam2() {
        return Pointteam2;
    }

    //increamentTeamPoints()
    public int increamentTeamPoints(ManagingMatches managingMatches){
        int points = 0;
        if (this.getScoreteam1() > this.getScoreteam2()) {
            points = this.getPointteam1() + 2;
        } else if (this.getScoreteam2() < this.getScoreteam2()){
            points = this.getPointteam2() + 2;
        }
        return points;
    }

    //displayMatchResult()
    public void displayMatchResultPoints(){
        ManagingMatches managingMatches = new ManagingMatches();
        int point = increamentTeamPoints(managingMatches);
        System.out.println("Match ID is: " + super.getMatchID());
        System.out.println("Match Team A is: " + this.getNameteam1());
        System.out.println("Match Team B is: " + this.getNameteam2());
        System.out.println(this.getNameteam1() + " Score is: " + this.getScoreteam1());
        System.out.println(this.getNameteam2() + " Score is: " + this.getScoreteam2());
        System.out.println(this.getNameteam1() + " Points is: " + this.getPointteam1());
        System.out.println(this.getNameteam2() + " Points is: " + this.getPointteam2());
        System.out.println(this.getNameteam1() + " Points is: " + point);

    }
}
