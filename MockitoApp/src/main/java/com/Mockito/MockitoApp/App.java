package com.Mockito.MockitoApp;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mysql.connection.MySqlConnection.App;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
 	   public static void main(String[] args){
 		  SpringApplication.run(App.class, args);
 	   }
 	   
}