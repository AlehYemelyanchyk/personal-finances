package com.alehyem.personalfinances.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "account_roles")
public class Role extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 893137926844424282L;

    @Column(name = "role")
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
