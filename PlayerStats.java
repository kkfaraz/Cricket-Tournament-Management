public class PlayerStats extends ManagingMatches{
    private String name;
    private int run;
    private int wicket;

    //constructor
    public PlayerStats() {
    }
    public PlayerStats(String name, int run, int wicket) {
        this.name = name;
        this.run = run;
        this.wicket = wicket;
    }
    public PlayerStats(int matchId, String matchDate, String location, String name, int run, int wicket) {
        super(matchId,matchDate,location);
        this.name = name;
        this.run = run;
        this.wicket = wicket;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setRun(int run) {
        this.run = run;
    }
    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getRun() {
        return run;
    }
    public int getWicket() {
        return wicket;
    }

    //addRun()
    public int addRun(int runs){
        if (runs == 1){
            runs = this.getRun() + 1;
        }
        else if (runs == 2){
            runs = this.getRun() + 2;
        }
        else if (runs == 3){
            runs = this.getRun() + 3;
        }
        else if (runs == 4){
            runs = this.getRun() + 4;
        }
        else if (runs == 5){
            runs= this.getRun() + 5;
        }
        else if (runs == 6){
            runs = this.getRun() + 6;
        }
        return runs;
    }

    //addWicket()
    public int addWicket(int wicket){
        if (wicket == 1){
            wicket = this.getWicket() + 1;
        }
        else if (wicket == 2){
            wicket = this.getWicket() + 2;
        }
        else if (wicket == 3){
            wicket = this.getWicket() + 3;
        }
        else if (wicket == 4){
            wicket = this.getWicket() + 4;
        }
        else if (wicket == 5){
            wicket = this.getWicket() + 5;
        }
        else if (wicket == 6){
            wicket = this.getWicket() + 6;
        }
        else if (wicket == 7){
            wicket = this.getWicket() + 7;
        }
        else if (wicket == 8){
            wicket = this.getWicket() + 8;
        }
        else if (wicket == 9){
            wicket = this.getWicket() + 9;
        }
        else if (wicket == 10){
            wicket = this.getWicket() + 10;
        }
        return wicket;
    }

    //displayStat()
    public void displayStat(){
        System.out.println("Match ID is: " + super.getMatchID());
        System.out.println("Match Date is: " + super.getMatchDate());
        System.out.println("Match Location is: " + super.getLocation());
        System.out.println("Player Name is: " + this.getName());
        System.out.println("Player Run is: " + this.getRun());
        System.out.println("Player Wicket is: " + this.getWicket());
    }
}
