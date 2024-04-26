package io.security.springsecuritymaster;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @GetMapping("/")
    public String index() {

        SpringServletContainerInitializer

        HttpServletRequest
        DefaultSecurityFilterChain
        return "index";
    }
}
