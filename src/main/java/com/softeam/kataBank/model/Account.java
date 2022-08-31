package com.softeam.kataBank.model;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Account {

    @Id
    private Long Id;
    private Double balance;
    private Date creationDate;
    @ManyToOne
    private Person owner;
    @OneToMany
    private List<Transaction> transactions;

    public Account() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Account(Double balance, Date creationDate) {
        this.balance = balance;
        this.creationDate = creationDate;

    }
}
