package ExamPractise1;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class first_day_last_day {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the date DD/MM/YYYY formate:");
        String date = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        System.out.println("First date of the week"+ (formatter));
        System.out.println("Last date of the week"+ (formatter));

    }
}
