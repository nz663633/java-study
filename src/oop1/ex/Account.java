package oop1.ex;

public class Account {
    int balance; // 잔

    int desposit(int amount) {
        return balance += amount;
    }

    int withdraw(int amount) {
        if(amount > balance) {
            System.out.println("잔액 부족");
            return balance;
        }
        return balance -= amount;
    }
}
