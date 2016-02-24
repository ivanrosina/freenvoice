package org.freenvoice.controllers;

import org.freenvoice.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AngularController {
	private Logger log = LoggerFactory.getLogger(AngularController.class);
	
    @Autowired
    protected AuthenticationManager authenticationManager;

    @RequestMapping("/test")
    public String login(User user) {
        return "angular/index";
    }


}
