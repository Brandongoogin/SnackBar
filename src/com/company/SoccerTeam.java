package com.company;

public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    private static int games = 0;
    private static int goals = 0;

    public SoccerTeam(){
        wins = 0;
        losses = 0;
        ties = 0;
    }
    public void played(SoccerTeam other, int myScore, int otherScore) {
        if (myScore == otherScore) {
            ties++;
            other.ties++;
        }
        if (myScore > otherScore) {
            wins++;
            other.losses++;
        }
        if (myScore < otherScore) {
            losses++;
            other.wins++;
        }
        games++;
        goals = myScore + otherScore;
    }
    public int currPoints(){
        int points = (3 * wins) + (ties);
        return points;
    }
    public void reset(){
        wins = 0;
        losses = 0;
        ties = 0;
    }
    public static void startTournament() {
        games = 0;
        goals = 0;
    }
    public static int getGoals() {
        return goals;
    }
    public static int getGames() {
        return games;
    }
    public static void main(String[] args){
        SoccerTeam t1 = new SoccerTeam();
        SoccerTeam t2 = new SoccerTeam();
        SoccerTeam t3 = new SoccerTeam();
        SoccerTeam t4 = new SoccerTeam();

        t1.played(t2, 5, 7);
        t2.played(t3, 8, 4);
        t3.played(t4, 4 , 4);
        t4.played(t1, 3, 0);

        System.out.println("First Tournament");
        System.out.println("Total games played : " + getGames() + " & Total goals scored : " + getGoals());
        System.out.println("Team 1 scored " + t1.currPoints() + " points");
        System.out.println("Team 2 scored " + t2.currPoints() + " points");
        System.out.println("Team 3 scored " + t3.currPoints() + " points");
        System.out.println("Team 4 socred " + t4.currPoints() + " points");

        startTournament();		//new tournament
        t1.reset();
        t2.reset();
        t3.reset();
        t4.reset();
        System.out.println();

        t1.played(t3, 10, 2);
        t2.played(t4, 3, 5);
        t3.played(t2, 6 , 1);
        t4.played(t1, 3, 7);
        t1.played(t4, 6, 9 );
        t2.played(t3, 8, 0);

        System.out.println("Second Tournament");
        System.out.println("Total games played : " + getGames() + " & Total goals scored : " + getGoals());
        System.out.println("Team 1 scored " + t1.currPoints() + " points");
        System.out.println("Team 2 scored " + t2.currPoints() + " points");
        System.out.println("Team 3 scored " + t3.currPoints() + " points");
        System.out.println("Team 4 scored " + t4.currPoints() + " points");
    }
}



