package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 
public class BooksController   
{  

   @GetMapping("/")  
   private String getAllBooks()   
   {  
    return "Hello world is working in Elastic Bean stalk";  
   }  
}