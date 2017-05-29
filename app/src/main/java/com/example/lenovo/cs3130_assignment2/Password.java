package com.example.lenovo.cs3130_assignment2;

/**
 * Created by Yanjun Liu on 2017/5/28.
 */


public class Password {
    public int checkPassword(String passwordText){
        if(passwordText.equals("password")){
            return 1;
        }
        else if(passwordText.length()<=8) {
            return 2;
        }
        else if(passwordText.length()>25){
            return 3;
        }
        else{
            boolean flag=false;
            int count=0;
            for(int i=0;i<passwordText.length();i++){
                if(Character.isDigit(passwordText.charAt(i))){
                    flag=true;
                    count++;
                }
            }
            if(flag==false)
            {
                return 4;
            }
            if(count==passwordText.length()){
                return 5;
            }

            return 0;
        }
    }

    public String rules(int number){
        if(number==1){
            return "Password can not be \"password\".";
        }
        else if(number==2){
            return "Password must be longer than 8 characters.";
        }
        else if(number==3){
            return "Password can not be shorter than 25 characters.";
        }
        else if(number==4){
            return "Password must include one digit at least.";
        }
        else if(number==5){
            return "Password can be all digits.";
        }
        else{
            return "password is correct";
        }

    }
}
