package ru.job4j.bank;

import java.util.*;

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

        return usersList.stream()
                .filter(user -> user.equals(new User(passport, "")))
                .findAny()
                .orElse(null);

    }

    public Account findByRequisite(String passport, String requisite) {

        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }

        List<Account> userAccounts = users.get(user);

        return userAccounts.stream()
                .filter(account -> account.equals(new Account(requisite, 0)))
                .findAny()
                .orElse(null);

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
