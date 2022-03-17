package Violation_solid;

//--------------------------SINGLE RESPONSIBILITY------------------------------------------
public class BankServices {
    public long deposit(long amount, String accountNo) {
        return 0;
    }

    public long withDraw(long amount, String accountNo) {
        return 0;
    }

    public void getLoanServiceInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            //do some job
            System.out.println("home Loan Approved");
        }
        if (loanType.equals("personalLoan")) {
            //do some job
            System.out.println("personal Loan approved");
        }
        if (loanType.equals("carLoan")) {
            //do some job
            System.out.println("car Loan approved");
        }

    }

    public void sendOtp(String Medium) {
        if (Medium.equals("email")) {
            //write email related logic
            System.out.println("OTP sent through mail  ");

        }
        if (Medium.equals("mobile")) {
            //write message related logic
            System.out.println("OTP sent through mobile");
        }
    }
    // this class has more than one reason to change
    //hence it violates the single responsibility function.
}
