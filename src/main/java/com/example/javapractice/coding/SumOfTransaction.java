package com.example.javapractice.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumOfTransaction {
    public static void main(String[] args) {
      //Given a list of transactions, find the sum of transaction amounts for each day using Java streams:

        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );

        Map<String, Long> collect = transactions.stream().
                collect(Collectors.groupingBy(Transaction::getDate,
                        Collectors.summingLong(Transaction::getAmount)));
        System.out.println(collect);
    }
}

class Transaction {
    private String date;
    private int amount;

    public Transaction(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
            return amount + " " + date;
    }
}
