import java.util.*;
class StudentGradeCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter the number of subjects :");
        int n=sc.nextInt();
        int totalMarks=0;
        for(int i=1;i<=n;i++){
            System.out.println("Marks obtained in subject "+i+" is :");
            int marks=sc.nextInt();
            totalMarks+=marks;
        }
        double averagePercentage=(double)totalMarks/n;
        char grade;
        if(averagePercentage>=90){
            grade='S';
        }else if(averagePercentage>=80 && averagePercentage<90){
            grade='A';
        }else if(averagePercentage>=70 && averagePercentage<80){
            grade='B';
        }else if(averagePercentage>=60 && averagePercentage<70){
            grade='C';
        }else if(averagePercentage>=50 && averagePercentage<60){
            grade='D';
        }else{
            grade='F';
        }
        System.out.println("Total marks scored : "+totalMarks);
        System.out.println("The Average Percentage is : "+averagePercentage);
        System.out.println("Grade : "+grade);
    }
}