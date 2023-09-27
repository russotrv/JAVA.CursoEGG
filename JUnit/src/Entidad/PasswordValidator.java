/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Juan
 */
public class PasswordValidator {

    public PasswordValidator() {
    }
    
    public boolean longMinima(String contra){
        int longitudMinima = 8;
        return contra.length() >= longitudMinima; 
    }
    
    public boolean contieneCarEsp(String contra){
        String carEsp = "!@#$%&/()=?¡¿.,|";
        for (String letra : contra.split("")) {
            if(carEsp.contains(letra)){
                return true;
            }
        }
        return false;
    }
    
    public boolean contieneMayus(String contra){
        String letra;
        for (int i = 0; i < contra.length(); i++) {
            letra = contra.substring(i, i+1);
            if(letra.equals(letra.toUpperCase())){
                return true;
            }
        }
        return false;
    }
    
    public boolean validadorEstructura(String contra){
        
        String mailString = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern mailPattern= Pattern.compile( mailString , Pattern.CASE_INSENSITIVE);
 
        final Matcher mailMatcher = mailPattern.matcher(contra);
        return mailMatcher.matches();
    }
    
}
