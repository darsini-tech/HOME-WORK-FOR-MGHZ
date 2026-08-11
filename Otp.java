
package string;


public class Otp {
    
    public static void main(String[] args) 
    {
        Otp system = new Otp();
        system.checkOtp();
    }

    public void checkOtp() 
    {
        String originalOtp = "1234";
        String enteredOtp = "1234";
        
        if (originalOtp.equals(enteredOtp))
        {
            System.out.println("OTP Verified Successfully");
        } 
        else
        {
            System.out.println("Invalid OTP");
        }
        
        // FIXED LINE: Saving to a temporary string fixes the compiler error
        String tempOtp = originalOtp.concat("5678"); 
        
        // Printing originalOtp proves it remained unchanged ("1234")
        System.out.println("String after concat: " + originalOtp); 
       
        // Proving StringBuilder mutability
        StringBuilder mutableOtp = new StringBuilder("1234");
        mutableOtp.append("5678");
        System.out.println("StringBuilder after append: " + mutableOtp); 
    }
}
