//package com.programmer.gate.SpringBootTutorial;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}

package com.programmer.gate.SpringBootTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App {

    @RequestMapping("/")
    String hello() {
        return "Hello World! JavaInterviewPoint";
    }
    @RequestMapping(path = "/user/{username}", method = RequestMethod.GET)
    String helloUser(@PathVariable String username) {
        return "Hello "+ username;
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
