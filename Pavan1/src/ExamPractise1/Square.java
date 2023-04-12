package ExamPractise1;

@FunctionalInterface
public interface Square {
    public int cal(int x);

    static void display() {
        System.out.println("Display method is excuted");
    }

    default void check() {
        System.out.println("check method id excuted");
    }
}
