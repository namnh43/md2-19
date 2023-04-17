package regex;

public class EmailExampleTest {
    private static EmailValidate emailValidate;
    public static final String[] validEmail = {"a@gmail.com", "abc@email.xyz", "aaa@yahoo.com.vn"};
    public static final String[] invalidEmail = {"@gmail.com","!@#@gmail.com.vn",",..@gmai.com"};

    public static void main(String[] args) {
        emailValidate = new EmailValidate();
        for (String str: validEmail) {
            boolean isValid = emailValidate.validate(str);
            System.out.println("Email "+str+" is valid:"+isValid);
        }
        for (String invalidStr: invalidEmail) {
            boolean invalid = emailValidate.validate(invalidStr);
            System.out.println("Email "+invalidStr+ " is valid: "+invalid);
        }
    }
}
