public class Employee {
    private final int baseSalary;
    private final int hourlySalary;

    Employee(int baseSalary, int hourlySalary) {
        this.baseSalary = baseSalary;
        this.hourlySalary = hourlySalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public int getHourlySalary(){
        return hourlySalary;
    }

    public int getSalaryWithExtraHours(int extraHours){
        return baseSalary +(hourlySalary * extraHours);
    }
}
