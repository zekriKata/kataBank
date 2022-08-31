package com.softeam.kataBank.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
@Entity
public class Transaction {

    @Id
    private Long id;
    private Date date;
    private TransactionType transactionType;
    private Float balanceBefore;
    private Float balanceAfter;
    @ManyToOne
    private Account account;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Float getBalanceBefore() {
        return balanceBefore;
    }

    public void setBalanceBefore(Float balanceBefore) {
        this.balanceBefore = balanceBefore;
    }

    public Float getBalanceAfter() {
        return balanceAfter;
    }

    public void setBalanceAfter(Float balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}