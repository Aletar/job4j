package ru.job4j.bank;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {

        users.putIfAbsent(user, new ArrayList<Account>());

    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user == null) {
            return;
        }

        List<Account> userAccounts = users.get(user);
        if (!userAccounts.contains(account)) {
            userAccounts.add(account);
        }
    }

    public User findByPassport(String passport) {
        List<User> usersList = new ArrayList(users.keySet());

        int idx = usersList.indexOf(new User(passport, ""));
        if (idx == -1) {
            return null;
        }
        return usersList.get(idx);
    }

    public Account findByRequisite(String passport, String requisite) {

        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }

        List<Account> userAccounts = users.get(user);
        int idx = userAccounts.indexOf(new Account(requisite, 0));
        if (idx == -1) {
            return null;
        }

        return userAccounts.get(idx);

    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount == null || srcAccount.getBalance() < amount) {
            return false;
        }

        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (destAccount == null) {
            return false;
        }

        srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);

        return true;
    }
}
