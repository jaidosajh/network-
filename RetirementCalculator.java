import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get retirement data from user
        System.out.print("Enter client's name: ");
        String clientName = scanner.nextLine();

        System.out.print("Enter scenario name: ");
        String scenarioName = scanner.nextLine();

        System.out.print("Enter current retirement nest egg ($): ");
        double currentNestEgg = scanner.nextDouble();

        System.out.print("Enter average annual rate of return (%): ");
        double averageAnnualReturn = scanner.nextDouble() / 100;

        System.out.print("Enter current salary ($): ");
        double currentSalary = scanner.nextDouble();

        System.out.print("Enter yearly amount being contributed towards retirement ($): ");
        double yearlyContribution = scanner.nextDouble();

        System.out.print("Enter estimated yearly salary increase (%): ");
        double yearlySalaryIncrease = scanner.nextDouble() / 100;

        System.out.print("Enter number of years to retirement: ");
        int yearsToRetirement = scanner.nextInt();

        System.out.print("Enter desired income at retirement for active years ($/year): ");
        double desiredActiveIncome = scanner.nextDouble();

        System.out.print("Enter desired income at retirement after active years ($/year): ");
        double desiredInactiveIncome = scanner.nextDouble();

        scanner.close();

        // Compute retirement projections
        double retirementIncome = 0;
        for (int year = 1; year <= yearsToRetirement; year++) {
            // Add yearly contribution to nest egg
            currentNestEgg += yearlyContribution;

            // Compute investment growth
            currentNestEgg *= (1 + averageAnnualReturn);

            // Compute salary increase
            currentSalary *= (1 + yearlySalaryIncrease);

            // Compute retirement income for this year
            if (year >= 25 && year <= 40) { // active years (age 65-80)
                retirementIncome += desiredActiveIncome;
            } else if (year > 40) { // inactive years (age 81+)
                retirementIncome += desiredInactiveIncome;
            }
        }

        // Print retirement projections
        System.out.println();
        System.out.println("Retirement projections for " + clientName + " (" + scenarioName + "):");
        System.out.printf("Nest egg at retirement: $%.2f\n", currentNestEgg);
        System.out.printf("Retirement income: $%.2f/year\n", retirementIncome);
    }
}
