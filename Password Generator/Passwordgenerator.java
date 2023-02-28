/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Amro
 */
public class Passwordgenerator {

  
     private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String PUNCTUATION = "!@#$%&*()_+-=[]|,./?><";
    private boolean useLower;
    private boolean useUpper;
    private boolean useDigits;
    private boolean usePunctuation;
    
      public String generate(int length) {
        // Argument Validation.
        if (length <= 0) {
            return "";
        }

        // Variables.
        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());

        // Collect the categories to use.
        List<String> charCategories = new ArrayList<>(4);
        if (useLower) {
            charCategories.add(LOWER);
        }
        if (useUpper) {
            charCategories.add(UPPER);
        }
        if (useDigits) {
            charCategories.add(DIGITS);
        }
        if (usePunctuation) {
            charCategories.add(PUNCTUATION);
        }

        // Build the password.
        for (int i = 0; i < length; i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }
        return new String(password);
}
      
//public static String getRandomPassword(int count) {
 //   StringBuilder password = new StringBuilder();
 //   for (int i = 0; i < count; i++) {
  //      switch (getRandomInteger(0, 4)) {
      //      case 0:
     //           password.append((char) getRandomInteger(65, 90));
      //          break;
       //     case 1:
      //          password.append((char) getRandomInteger(97, 122));
       //         break;
       //     default:
    //            password.append(getRandomInteger(0, 9));
   //             break;
    //    }
   //}
  //  return password.toString();
//}
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Password generation is easy!");
        
        Passwordgenerator mygenerator=new Passwordgenerator();
        
        //String myPassword=mygenerator.generate(10);
        
       // System.out.println("Password generation is easy!");
        //System.out.println(myPassword);
        
        PassGen myGen=new PassGen();
        
        String pass=myGen.generatePassword();
       
         System.out.println("Password generation is easy!");
        System.out.println(pass);
       
        
        
        
    }
    
}
