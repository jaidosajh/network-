# retirementcalulator-

This Java code defines a Retirement Calculator program that takes user inputs and calculates retirement projections based on those inputs. The program prompts the user to input various retirement-related values and then uses those inputs to compute retirement projections. Here's what the code does:

The first line of code imports the Scanner class from the java.util package, which allows the program to read input from the user.
The code defines a class called "RetirementCalculator" with a main method that is executed when the program runs.
The main method creates a new Scanner object and assigns it to the variable "scanner".
The program prompts the user to enter various retirement-related values using the Scanner object and stores them in variables: clientName, scenarioName, currentNestEgg, averageAnnualReturn, currentSalary, yearlyContribution, yearlySalaryIncrease, and yearsToRetirement.
The program then closes the Scanner object.
The program uses the inputted values to compute retirement projections. It first initializes a variable called retirementIncome to 0. Then, for each year until retirement, it performs the following calculations:
Adds the yearly contribution to the current nest egg.
Multiplies the current nest egg by the average annual rate of return plus 1 to account for investment growth.
Multiplies the current salary by the yearly salary increase plus 1 to account for salary growth.
Computes the retirement income for this year based on the desired income for active years and inactive years.
Finally, the program outputs the retirement projections to the console using System.out.println and System.out.printf statements.
