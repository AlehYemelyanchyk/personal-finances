package com.alehyem.personalfinances.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "portfolios")
public class Portfolio extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -186095461441034514L;

//    @ManyToOne
//    @JoinColumn(name = "id")
    @Column(name = "user")
    private User user;

    @Column(name = "name")
    private String name;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Portfolio newPortfolio = (Portfolio) object;
        return this.getUser() == newPortfolio.getUser() &&
                Objects.equals(this.getName(), newPortfolio.getName());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getUser(), name);
    }

    @Override
    public String toString() {
        return getClass().getName() +
                " user='" + getUser() + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
