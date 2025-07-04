package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : " + pw + " Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+ pw +" FAILED: Expected INVALID but got " + result1);
        }

        // --- เขียน Test Case อื่นๆ ต่อ ---
        //Test case 2: รหัสผ่านทั้งหมดตัวเล็กจะ weak
        pw = "abcdefghij" ;
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : " + pw + " Passed  : All lowercase paswerd is WEAK");
        } else {
            System.out.println("Test Case 2 : " + pw + " FAILED  : Expected WEAK but got " + result2);
        }

        //test case 3 : รหัสผ่านตัวเล็ก + ตัวใหญ่ จะ MEDIUM
        pw = "ABCDefjhijkl" ;
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 : " + pw + " Passed  : All lowercase paswerd is MEDIUM");
        } else {
            System.out.println("Test Case 3 : " + pw + " FAILED  : Expected MEDIUM but got " + result3);
        }

        //test case 4 : รหัสผ่านตัวเล็ก + ตัวเลข จะ MEDIUM
        pw = "ABCDefjhijkl" ;
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 4 : " + pw + " Passed  : All lowercase paswerd is MEDIUM");
        } else {
            System.out.println("Test Case 4 : " + pw + " FAILED  : Expected MEDIUM but got " + result4);
        }

        //test case 5 : รหัสผ่านตัวเล็ก + ตัวใหญ่ จะ MEDIUM
        pw = "ABCDefjhijkl" ;
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 5 : " + pw + " Passed  : All lowercase paswerd is MEDIUM");
        } else {
            System.out.println("Test Case 5 : " + pw + " FAILED  : Expected MEDIUM but got " + result5);
        }

        //test case 6 : รหัสผ่านตัวพิมพ์ใหญ่ + ตัวเลข จะ MEDIUM
        pw = "ABCDefjhijkl" ;
        PasswordStrength result6 = PasswordValidator.validate(pw);
        if (result6 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 6 : " + pw + " Passed  : All lowercase paswerd is MEDIUM");
        } else {
            System.out.println("Test Case 6 : " +pw+ " FAILED  : Expected MEDIUM but got " + result6);
        }

        //test case 7 : รหัสผ่านตัวพิมพ์ใหญ่ + รหัสผ่านตัวพิมพ์เล็ก + ตัวเลข จะ Strong
        pw = "ABsd12aadas" ;
        PasswordStrength result7 = PasswordValidator.validate(pw);
        if (result7 == PasswordStrength.STRONG) {
            System.out.println("Test Case 7 : " + pw + " Passed  : All lowercase paswerd is STRONG");
        } else {
            System.out.println("Test Case 7 : " + pw + " FAILED  : Expected Stong but got " + result7);
        }

        System.out.println("--------------------------------");
    }
}
