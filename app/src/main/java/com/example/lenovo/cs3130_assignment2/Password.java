package com.example.lenovo.cs3130_assignment2;

/**
 * Created by Yanjun Liu on 2017/5/28.
 */


public class Password {
    private String password;

    public Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int checkPassword(){
        if(this.password.equals("password")){
            return 1;
        }
        else if(this.password.length()<=8){
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
