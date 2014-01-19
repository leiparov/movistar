package com.movistar.springjsfjpa.web;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.stereotype.Component;

import com.movistar.springjsfjpa.services.LoginService;

@ManagedBean
@SessionScoped
@Component
public class LoginController {

	private String user = null;
	private String password = null;
	private String rememberMe = "0";

	@Autowired
	private LoginService loginService;
	private Log log = LogFactory.getLog(LoginController.class);
	public String login() {		
		String res = "error";
		try {		
				res = loginService.login(user, password, rememberMe);		
		} catch (DisabledException e) {
			e.printStackTrace();
			FacesContext context = FacesContext.getCurrentInstance();  
            context.addMessage("alertas", new FacesMessage("WebCampaing", "Usuario deshabilitado"));
		}catch(BadCredentialsException e){
			e.printStackTrace();
			FacesContext context = FacesContext.getCurrentInstance();  
            context.addMessage("alertas", new FacesMessage("WebCampaing", "Usuario o password incorrecto"));		
		} catch (Exception e) {
			e.printStackTrace();
			FacesContext context = FacesContext.getCurrentInstance();  
            context.addMessage("alertas", new FacesMessage("WebCampaing", "Error en inicio de sesión"));
		}
		return res;
	}

	public String logout() {
		String res = "error";
		try {
			res = loginService.logout();
			resetAll();
		} catch (Exception e) {
			log.info("loginService = " + res);
		}
		return res;
	}
	public void resetAll(){
		user = null;password = null;rememberMe = null;
		
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(String rememberMe) {
		this.rememberMe = rememberMe;
	}

	
}
