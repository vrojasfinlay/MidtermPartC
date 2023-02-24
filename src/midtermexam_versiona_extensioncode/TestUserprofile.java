/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class TestUserprofile {
    public static void main (String[]args){
        
        String userId;
        String genre;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        userId = input.next();
        System.out.println("Now pick your favourite genre from the list: \n" +
                        "Comedy, Drama, Action, Mystery");
        genre = input.next();
        
        System.out.println("Your user profile has been created!");
        
        
        
       
    }
    
}
