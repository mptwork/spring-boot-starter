package com.mptwork.springbootstarter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * StaticController is a Spring MVC controller that handles HTTP GET requests for static content.
 * 
 * @author Issac Lee
 * @version 1.0
 * @since 1.0
 */
@Controller
public class StaticController {

    /**
     * Handles HTTP GET requests for the root ("/") URL path.
     * 
     * @return a String that will be interpreted by the configured ViewResolver 
     *         and used for rendering the "index" view (e.g., index.html)
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
