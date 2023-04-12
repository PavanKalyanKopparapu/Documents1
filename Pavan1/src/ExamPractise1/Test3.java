package ExamPractise1;
@FunctionalInterface
interface I{
    public abstract void m1();
}
class A implements I{
    @Override
    public void m1(){
        System.out.println("By using a Seperate class");
    }
}

public class Test3{
    public static void main(String[] args){
                    I obj = ()-> {
                        System.out.println("Providing implemantation by using Annonomous inner class");
                    };
                    obj.m1();
                    }
    }

