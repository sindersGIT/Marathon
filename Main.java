package lesson1.Marathon;

public class Main {
    public static void main(String[] args) {
        Obstacle[] course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120),new Water(1)};
        Team team = new Team("Champions");
        Course c = new Course(course);
        c.doit(team);
        team.AllInfo();




    }
}
