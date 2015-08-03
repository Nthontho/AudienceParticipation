/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author EDU
 */
public class Admin {
    private int AdminId;
    private String AdminName;
    private String AdminSurname;
<<<<<<< HEAD
    private String Username;
    private String Password;
    private String ConfirmPassword;

    /**
     * @return the AdminId 
=======
    private String Type;
    private String Password;

    /**
     * @return the AdminId
>>>>>>> f9cf14ce99e78fff5b6f8f8fc21a119dbfe4b681
     */
    public int getAdminId() {
        return AdminId;
    }

    /**
     * @param AdminId the AdminId to set
     */
    public void setAdminId(int AdminId) {
        this.AdminId = AdminId;
    }

    /**
     * @return the AdminName
     */
    public String getAdminName() {
        return AdminName;
    }

    /**
     * @param AdminName the AdminName to set
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * @return the AdminSurname
     */
    public String getAdminSurname() {
        return AdminSurname;
    }

    /**
     * @param AdminSurname the AdminSurname to set
     */
    public void setAdminSurname(String AdminSurname) {
        this.AdminSurname = AdminSurname;
    }

<<<<<<< HEAD
=======
    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * @return the Password
     */
>>>>>>> f9cf14ce99e78fff5b6f8f8fc21a119dbfe4b681
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
<<<<<<< HEAD
    
    
    public String getConfirmPassword() {
        return ConfirmPassword;
    }

       public void setConfirmPassword(String confirm) {
        this.ConfirmPassword = confirm;
    }
        public String getUsername() {
        return Username;
    }

       public void setUsername(String username) {
        this.Username = username;
    }
=======
>>>>>>> f9cf14ce99e78fff5b6f8f8fc21a119dbfe4b681
}
