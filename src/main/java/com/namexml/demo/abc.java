package com.namexml.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class abc {
    @RequestMapping("/home")
    @ResponseBody
    public String helloworld(){
        return "<html>" +
                "<body>" +
                "HELLOWORLD!" +
                "</body>" +
                "</html>";
    }

    @RequestMapping("/helloworld")
    public String abcde(){

return "h.jsp";
    }
    @RequestMapping("/")
    @ResponseBody
    public String abcdef(){
        return "slsad";
    }
}
