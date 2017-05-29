package com.example.lenovo.cs3130_assignment2;

/**
 * Created by Yanjun Liu on 2017/5/28.
 */


public class Password {
    public int checkPassword(String passwordText){
        if(passwordText.equals("password")){
            return 1;
        }
        else if(passwordText.length()<=8){
            return 2;
        }
        else{
            return 0;
        }
    }

    public String rules(int number){
        if(number==1){
            return "password can not be \"password\"";
        }
        else if(number==2){
            return "password must be longer than 8 characters";
        }
        else{
            return "password is correct";
        }

    }
}
