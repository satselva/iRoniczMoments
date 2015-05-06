/**
 * 
 */
package com.ironicz.moments.actions;

import java.util.Date;

import com.google.appengine.api.datastore.Email;
import com.ironicz.moments.entity.IroniczUser;
import com.ironicz.moments.entity.IroniczUserBuilder;
import com.ironicz.moments.persistence.DAOFactory;
import com.ironicz.moments.persistence.UserDAO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Sathish, Arumugam Selvaraj
 */
public class UserActions extends ActionSupport {
    
    private UserDAO userDAO;
    
    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 4890582583019049568L;

    private int userId;
    
    private String username;
    
    private String email; 
    
    private String sex;
    
    private String aboutUser;
    
    private Date dob;
    
    private String country;
    
    private String phoneNumber;
    
    private Date requestTime;
    
    public UserActions() {
        this.requestTime = new Date();
        this.userDAO = DAOFactory.getUserDAO();
    }
    
    
    /**
     * Executes the user action and return the appropriate results
     * 
     * @return {@link String}
     */
    @Override
    public String execute() {
        return Action.INPUT;
    }
    
    public String save() {
        String createdUserId = userDAO.save(createUser());
        System.out.println(String.format("User %s created successfully", createdUserId));
        return Action.SUCCESS;
    }
    
    public String update() {
        addActionError("Search not implemented yet!!!");
        return Action.SUCCESS;
    }
    
    public String delete() {
        addActionError("Search not implemented yet!!!");
        return Action.SUCCESS;
    }
    
    public String search() {
        addActionError("Search not implemented yet!!!");
        return Action.NONE;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getAboutUser() {
        return aboutUser;
    }

    public void setAboutUser(String aboutUser) {
        this.aboutUser = aboutUser;
    }
    
    private IroniczUser createUser() {
        return IroniczUserBuilder.ironiczUser().withName(username).withEmail(new Email(email)).withAbout(aboutUser).withSex(sex)
            .withCountry(country).withPhoneNumber(phoneNumber).withDob(dob).withCreationDate(requestTime)
            .withLastUpdatedDate(requestTime).withDisabled(false).build();
    }
    
}
