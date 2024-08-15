package Projects.daily.entities;

import java.util.Scanner;

public class Labor {
    int StressLevel;
    boolean HapinessLevel;
    double Salary;



private void AreYouOkay(){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Hou is your stress level, buddy? (1-10)\n");
        this.StressLevel = sc.nextInt();
        sc.nextLine();
        }
    }


private void SadessHill(){
    try (Scanner sc = new Scanner(System.in)) {
        String answer;
        System.out.println("Are you consider yourself a happy person with this job, sweet?\n(Y - YEAP\n N - NAH HELP ME\n)");
        answer = sc.nextLine();
        if(answer.contains("Y")){
            HapinessLevel = true;
        }else{
            HapinessLevel = false;
        }
    }
}
private void Verdict(){

    
   
    return message;
}