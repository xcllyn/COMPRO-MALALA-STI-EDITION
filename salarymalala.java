import java.util.Scanner;

class salarymalala {
    public static void main(String[] args) {
        Scanner salad = new Scanner(System.in); 
        System.out.println("Enter Employee Name: "); 
        
        String employeeName = salad.nextLine();
        System.out.println("Enter hourly rate: ");
        
        double hourlyRate = salad.nextFloat();
        System.out.println("Enter Total Hours: ");
        
        double totalHours = salad.nextFloat();
        
double initialSalary = hourlyRate*totalHours;
    if (totalHours > 200){
        initialSalary = initialSalary*2;
    } else {
        initialSalary = initialSalary;
        
    }
double insurance = initialSalary*.10;
double finalSalary = initialSalary - insurance;
System.out.println("Your final salary is: "+finalSalary);
    }
}