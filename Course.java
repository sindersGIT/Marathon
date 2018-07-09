package lesson1.Marathon;

public class Course {
    Obstacle[] course;

    public Course (Obstacle[] Course) {course = Course;}
    public void doit(Team teams) {


        for (Competitor c : teams.players ) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
