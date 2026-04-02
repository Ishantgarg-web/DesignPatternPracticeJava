package adaptorDsignPattern;

/**
 * Adaptor Design Pattern: It just behaves like a adaptor converting AC into DC current or vice-versa.
 * Example: You already have some code in your running application that is using code from Vendor A, But somehow contract with Vendor A is
 * closed, and Vendor B opens the new contract. and their defined classes are little bit different. How will you incorporate VendorB
 * in your application?
 * 1. Change your code to compatible with Vendor B, but it will not a good solution.
 * 2. Create a Adaptor between your code and Vendor B, So that it will fits the both requirements.
 *
 * Nomenclature:
 * 1. target interface: Adaptor
 * 2. Those we want to change into target: Adaptee
 *
 * Disadvantage of Adaptor Design Pattern:
 * 1. As we see in JavaPracticle Example - it will throw exception, if client is not aware of that - can create chaos.
 */
public class Main {
}
