public class CarInsurancePolicy
{
// Instance variables (data fields) for this class
    private int policyNumber;
    private int numPayments;
    private String residentCity;
// Various overloaded constructor methods for this class
    public CarInsurancePolicy(int num, int payments, String city)
    {
// Assign CarInsurancePolicy() parameters to the perviously defined variables.
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }
    public CarInsurancePolicy(int num, int payments)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = "[City Name]";
    }
    public CarInsurancePolicy(int num)
    {
        policyNumber = num;
        numPayments = 12;
        residentCity = "[City Name]";
    }
// Accessor method to show all the policy details.
    public void display()
    {
        System.out.println("Policy #" + policyNumber + "." + "\n" + numPayments + " payments annualy." + "\n" + "Driver resides in " + residentCity + ".");
    }
}