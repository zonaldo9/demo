package com.example.demo;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
		super(parameters);
    	add(new LoginForm("loginForm"));
    }
    
    class LoginForm extends Form{
    	private TextField usernameField;
    	private PasswordTextField passwordField;
    	private Label loginStatus;
    		
    	public LoginForm(String id) {
    		super(id);
    			
    		usernameField = new TextField("username", Model.of(""));
    		passwordField = new PasswordTextField("password", Model.of(""));			
    			
    		add(usernameField);
    		add(passwordField);
    	}

    	public final void onSubmit() {
    		String username = (String)usernameField.getDefaultModelObject();
    		String password = (String)passwordField.getDefaultModelObject();
    			
    		if(username.equals("test") && password.equals("test"))
    		     loginStatus.setDefaultModelObject("Congratulations!");
    		else
    		     loginStatus.setDefaultModelObject("Wrong username or password!");			
    	}
    }
}
