class Employee_wage {

    public static final int is_part_time = 1;
    public static final int is_full_time = 2;

    private final String company;
    private final int empRateHour;
    private final int numOfWorkingDays;
    private final int maxHoursePerMonth;

    public Employee_wage(String company, int empRateHour, int numOfWorkingDays, int maxHoursePerMonth) {
        this.company = company;
        this.empRateHour = empRateHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursePerMonth = maxHoursePerMonth;
    }

    public int get_compute() {
        int empHrs = 0, totalEmpHrs = 0, totaWorkingDays = 0;
        while (totalEmpHrs <= maxHoursePerMonth && totaWorkingDays <= numOfWorkingDays) {
            int empCheck = (int) Math.floor((Math.random()) * 3);

            switch (empCheck) {
                case is_part_time:
                    empHrs = 4;
                    break;
                case is_full_time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }

            totalEmpHrs = Math.min(totalEmpHrs + empHrs, maxHoursePerMonth);
            totaWorkingDays++;
            System.out.println("Day # : " + totaWorkingDays + " " + totaWorkingDays + " " + totalEmpHrs);
        }
        return totalEmpHrs * empRateHour;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Employee_wage ged = new Employee_wage("ge", 100, 20, 160);
        System.out.println(ged.get_compute());
    }
}
