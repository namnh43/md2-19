package regex;

public class AccountExampleTest {
    static private AccountExample accountExample;
    static private String[] validAccount = {"123abc_q","abcxyz"};
    static private String[] invalidAccount = {"123!@#","aaa bbb", "ABCAAA"};
    public static void main(String[] args) {
        accountExample = new AccountExample();
        for(String valid: validAccount) {
            boolean isValid = accountExample.validate(valid);
            System.out.println("Account "+valid+" is valid:"+isValid);
        }
        for(String invalid: invalidAccount) {
            boolean isValid = accountExample.validate(invalid);
            System.out.println("Account "+invalid+" is valid:"+isValid);
        }
    }
}
