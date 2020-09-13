package com.alehyem.personalfinances.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Transaction implements Serializable {
    private static final long serialVersionUID = -3667696557519598945L;

    private int id;
    private int portfolioId;
    private String securitySymbol;
    private int transactionType;
    private int amount;
    private double price;
    private LocalDate date;

    public Transaction() {
    }

    public Transaction(int portfolioId, String securitySymbol, int transactionType, int amount, double price, LocalDate date) {
        this.portfolioId = portfolioId;
        this.securitySymbol = securitySymbol;
        this.transactionType = transactionType;
        this.amount = amount;
        this.price = price;
        this.date = date;
    }

    public Transaction(int id, int portfolioId, String securitySymbol, int transactionType, int amount, double price, LocalDate date) {
        this.id = id;
        this.portfolioId = portfolioId;
        this.securitySymbol = securitySymbol;
        this.transactionType = transactionType;
        this.amount = amount;
        this.price = price;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(int portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getSecuritySymbol() {
        return securitySymbol;
    }

    public void setSecuritySymbol(String securitySymbol) {
        this.securitySymbol = securitySymbol;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Transaction transaction = (Transaction) object;
        return getId() == transaction.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return getClass().getName() +
                " id='" + id + '\'' +
                ", portfolioId='" + portfolioId + '\'' +
                ", securitySymbol='" + securitySymbol + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", amount='" + amount + '\'' +
                ", price='" + price + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
