package lesson1.Marathon;

public interface Competitor {
    void run(int dist);
    void swim(int dist);
    void jump(int height);
    boolean isOnDistance();
    void info();
    void infoT(String TeamName);
}
