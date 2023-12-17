package com.example.SolidBank;
import java.util.Scanner;
public class MyCLI implements CLIUI {
    private Scanner scanner;

    public MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    public double requestClientAmount(){
        System.out.println("not finished yet");
        return 0;
    }

    public String requestClientAccountNumber() {
        System.out.println("not finished yet");
        return "";
    }
    public String requestAccountType() {
        System.out.println("Choose account type \n[CHECKING, SAVING, FIXED]");
        while (true) {
            String accountTypeName = this.scanner.nextLine();
            if (!accountTypeName.equals("CHECKING") && !accountTypeName.equals("SAVING") && !accountTypeName.equals("FIXED")) {
                System.out.println("Please enter valid account type");
            } else {
                return accountTypeName;
            }
        }
    }
}
