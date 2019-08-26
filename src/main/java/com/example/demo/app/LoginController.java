package com.example.demo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import  com.example.demo.app.LoginService;;
@Controller
@SessionAttributes("name")
public class LoginController {
    @Autowired //return the object of loginService
    LoginService service;
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "login";
    }
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
        boolean isValidUser = service.validateUser(name, password);
        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
        model.put("name", name);
        model.put("password", password);
        return "welcome";
    }
    @RequestMapping(value = "Data",method = RequestMethod.GET)
    @ResponseBody
    public String showData()
    {
    return "Loginpage";
    }
  
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String shoResitratio(ModelMap model) {
        return "ResitrationPage";
    }
}