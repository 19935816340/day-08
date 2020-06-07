package homework;

public class UniverseTest {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();


        Universe sun= new Sun();
        sun.doAnything();

        Sun sun1 = (Sun) new Star();
        sun.shine();

    }
}
