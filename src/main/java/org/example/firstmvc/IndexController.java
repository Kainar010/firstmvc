package org.example.firstmvc;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView index(HttpServletResponse resp) throws IOException {
        //fake data, simulate get from database
        String data = "Kainar";

        resp.getWriter().write("<h1>Hello, this is my first MVC app</h1>"+data);
        return null;
    }
}
