public class Main {
    public static void main(String[] args) {
        var employee = new Employee(
                30_000,
                15
        );

        System.out.println(employee.getSalaryWithExtraHours(20));
    }
}
