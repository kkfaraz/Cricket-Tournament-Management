import java.util.ArrayList;
public class matchPointsInTournament extends MatchResult {
    private ArrayList<MatchResult> matchResults = new ArrayList<>();
    //constructor
    public matchPointsInTournament() {
    }
    public matchPointsInTournament(ArrayList<MatchResult> matchResults) {

        this.matchResults = matchResults;
    }
    //getter()
    public ArrayList<MatchResult> getMatchResults() {
        return matchResults;
    }

    //addMatch()
    public void addMatchResult(String team1, String team2, int team1Score, int team2Score, int pointsTeam1, int pointsTeam2){
        super.setNameteam1(team1);
        super.setNameteam2(team2);
        super.setScoreteam1(team1Score);
        super.setScoreteam2(team2Score);
        super.setPointteam1(pointsTeam1);
        super.setPointteam2(pointsTeam2);
    }

    //calculationPoints()
//    public int calculationPoints(){
//        int point = 0;
//        if (super.getNameteam1()==null){
//             point = Integer.parseInt(super.getNameteam2() + 2);
//        }
//        else if (super.getNameteam2()==null){
//             point = Integer.parseInt(super.getNameteam1() + 2);
//        }
//        return point;
//    }
    //addResult()
    public void addResult(MatchResult result){
        matchResults.add(result);
    }

    //displayPoint()
    public void displayPoint(){
        for (MatchResult result:matchResults) {
            System.out.println(result.getNameteam1()+"  Point is: "+result.getPointteam1());
            System.out.println(result.getNameteam2()+" Point is: "+result.getPointteam2());
        }
        
    }
}
