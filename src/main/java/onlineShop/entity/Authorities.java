package onlineShop.entity;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "authorities")
public class Authorities implements Serializable {
    private static final long serialVersionUID = 8734140534986494039L;

    @Id
    private String emailId;

    private String authorities;

    public String getEmailId() {
        return emailId;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

}
