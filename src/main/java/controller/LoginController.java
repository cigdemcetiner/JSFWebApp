/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author ÇİĞDEM ÇETİNER
 */
@ManagedBean
@RequestScoped
public class LoginController {

    /**
     * Creates a new instance of LoginController
     */
    
    private String username;
    private String password;
    
    
    
    
    public LoginController() {
        
    }
    public String loginPrecess(){
        if(this.username.equals("admin") && this.password.equals("1234")){
            
        
            return "success?faces-redirect=true";
        }else{
            return "error?faces-redirect=true";
        }
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
    
}
