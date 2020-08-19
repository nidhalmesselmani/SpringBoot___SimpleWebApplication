package com.messelmani.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String index(HttpServletRequest req, HttpServletResponse res){

        HttpSession session = req.getSession();
      String name = req.getParameter("name");
      System.out.println("hi "+ name);
      session.setAttribute("name", name);
      return "home";
    }
}
