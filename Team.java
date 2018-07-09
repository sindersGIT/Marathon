package lesson1.Marathon;

public class Team {
    Obstacle[] course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120),new Water(1)};

    String TeamName;
    Competitor[] players;


    public Team(String Teamname) {
        TeamName = Teamname;
        players = new Competitor[]{new Cat("Барсик"), new Dog("Барбос"), new Cat("Персик"), new Dog("Бобик")};

    }
    public void completers() {
        for (Competitor c : players) {
            if (c.isOnDistance()){
                c.infoT(TeamName);

            }

        }
    }
    public void AllInfo(){
        for (Competitor c : players) {
            c.infoT(TeamName);
        }
    }

}







