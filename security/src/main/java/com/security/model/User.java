package com.security.model;

import java.util.List;
import java.util.Set;

import javax.persistence.JoinColumn;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private Boolean enabled;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="authority_user", joinColumns = @JoinColumn(name="usuario_id"), inverseJoinColumns = @JoinColumn(name= "authority_id"))
    private List<Authority> authority;

    public User() {
    }

    public User(Long id, String username, String password, Boolean enabled, List<Authority> authority) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.authority = authority;
    }

    public User(String username2, String password2, List gantList) {
        this.username = username2;
        this.password = password2;
        this.authority = (List)gantList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Authority> getAuthority() {
        return authority;
    }

    public void setAuthority(List<Authority> authority) {
        this.authority = authority;
    }

    @Override
    public int hashCode(){
        final int prime= 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    User other = (User) obj;
    if (id == null) {
        if (other.id != null)
            return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
}

@Override
public String toString() {
    return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
}

}
