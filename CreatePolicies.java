public class CreatePolicies
{
    public static void main(String[] args)
    {
// Variables and Constants.
        CarInsurancePolicy first = new CarInsurancePolicy(99476);
        CarInsurancePolicy second = new CarInsurancePolicy(10104, 52);
        CarInsurancePolicy third = new CarInsurancePolicy(54671, 12, "Rivendell");
// Output Phase.
    first.display();
    second.display();
    third.display();
    }
}