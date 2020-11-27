public class empWageComputation {
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static final int EMP_RATE_PER_HR=20;
public static final int MAX_HRS_IN_MONTH=10;
public static final int NUM_WORKING_DAYS=20;
public static int empWageComputation(){
int empHrs;
int totalEmpHrs=0;
int totalWorkingDays=0;
while( totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS ) {
         totalWorkingDays++;
         int empCheck=(int)Math.floor(Math.random()*10)%3;
         switch (empCheck) {
          case 1:
                 empHrs=4;
                 break;
          case 2:
                 empHrs=8;
                 break;
         default:
                 empHrs=0;
                  break;
        }
   totalEmpHrs=(totalEmpHrs + empHrs); 
System.out.println("Day: "+totalWorkingDays+"  "+"employee hours: "+empHrs);
}
   int totalSalary=(totalEmpHrs*EMP_RATE_PER_HR);
   System.out.println("Total Salary: "+totalSalary);
   return totalSalary;
  }
public static void main(String args[]) {
empWageComputation();
}
}
