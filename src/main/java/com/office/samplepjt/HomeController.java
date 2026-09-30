package com.office.samplepjt;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping({"", "/"})
    public String home() {
        System.out.println("home()");
        String nextPage = "home";
        return nextPage;
    }

}
