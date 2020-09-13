package com.alehyem.personalfinances.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -299089265220451433L;

    @ManyToOne
    @JoinColumn(name = "id")
    @Column(name = "role")
    private Role role;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "country")
    private String country;

    @Column(name = "banned")
    private String banned;

    @Column(name = "transactionBanned")
    private String transactionBanned;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Portfolio portfolio;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBanned() {
        return banned;
    }

    public void setBanned(String banned) {
        this.banned = banned;
    }

    public String getTransactionBanned() {
        return transactionBanned;
    }

    public void setTransactionBanned(String transactionBanned) {
        this.transactionBanned = transactionBanned;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        User newUser = (User) object;
        return getLogin().equals(newUser.getLogin()) &&
                getEmail().equals(newUser.getEmail());
    }

    @Override
    public int hashCode() {
        return getLogin().hashCode() + getEmail().hashCode();
    }

    @Override
    public String toString() {
        return getClass().getName() +
                " role='" + role + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", banned='" + banned + '\'' +
                ", transactionBanned='" + transactionBanned + '\'' +
                '}';
    }
}
