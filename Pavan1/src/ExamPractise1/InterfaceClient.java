package ExamPractise1;

import java.util.Scanner;
@FunctionalInterface
interface pavan {
  public  void m1();




    class InterfaceClient implements pavan {
        @Override
        public void m1() {
            System.out.println("subtract class");
        }


        Scanner sc = new Scanner(System.in);


        public static void main(String[] args) {

            pavan obj1 = new InterfaceClient();
            System.out.println("hellooo");

        }
    };

}