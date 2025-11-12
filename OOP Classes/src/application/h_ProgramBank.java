package application;

import entities.h_BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class h_ProgramBank {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        h_BankAccount account;

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0); // pega o primeiro caractere da resposta
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new h_BankAccount(holder, initialDeposit, accNumber);
        } else {
            account = new h_BankAccount(holder, accNumber);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.print(account);

        sc.close();

    }

}