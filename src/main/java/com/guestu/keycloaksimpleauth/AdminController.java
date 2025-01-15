package com.guestu.keycloaksimpleauth;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

@RestController
public class AdminController {


    @GetMapping("/helloAdmin")
    public String helloAdmin(){
        return "Hello Admin";
    }
    @GetMapping("/helloUser")
    public String helloUser(){
        return "Hello user";
    }


    @GetMapping("/getSingleUser")
    public String getSingleUser(){
        return "on user returned";
    }

    @GetMapping("/getSingleUser/{id}")
    public String getSingleUser(@PathVariable String id){
        return "on user returned";
    }

    @GetMapping("/redirect")
    public ResponseEntity<Object> redirect() throws URISyntaxException {
        URI google = new URI("http://www.google.com");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(google);
        return new ResponseEntity<>(httpHeaders, HttpStatus.SEE_OTHER);
    }
}
