public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computaion Program");

        int IS_PRESENT=1;
        int EMP_PER_HOUR=20;
        int FULL_DAY_HOUR=8;

        int attendance = (int)(Math.floor(Math.random() * 2.0));
        int wages=0;

        if(attendance==1)
        {
            wages=EMP_PER_HOUR*FULL_DAY_HOUR;
            System.out.println("Employee is present and his wage is " + wages);
        }

        else 
        {
            System.out.println("Employee is absent today");
        }

    }
}
