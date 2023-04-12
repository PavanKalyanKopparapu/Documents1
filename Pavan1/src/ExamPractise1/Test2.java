package ExamPractise1;
@FunctionalInterface
interface square{
    public int cal(int x);

}
public class Test2 {
    public static void main(String[] args) {
        square s = (int x) -> x * x;
        int squ = s.cal(2);
        int result = 0;
        System.out.println("result :"+result);
    }

    };





