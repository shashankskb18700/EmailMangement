package emailapp;
import com.sun.source.tree.BreakTree;

import java.lang.StringBuilder;
import java.util.Random;
public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String emailAdd;
    private StringBuilder password= new StringBuilder();
    private String altEmail = "";

    public Email(String firstName,String lastName,String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        emailGenerator(this.firstName,this.lastName,this.department);
        passwordGenerator();
    }

    public void emailGenerator(String a, String b, String c){
        emailAdd = this.firstName + "." + this.lastName + "@" + this.department + ".company.com";

    }
    public String getEmailAdd(){
        return  this.emailAdd;
    }

    public void passwordGenerator(){
        String  alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder str = new StringBuilder(26);
        str.append(alpha);
        Random rand = new Random();

        for( int i=0;i<7;i++){
            int a = rand.nextInt(26);
            this.password.append(str.charAt(a));
        }

    }
    public StringBuilder getPassword(){
        return  this.password;
    }

    public void setPassword(String password){
        this.password.append(password);
    }
    public void setAltEmailAdd(String email){
        this.altEmail = this.altEmail+ email;
    }

    public  String toString(){
        return  this.emailAdd + "\n" +this.altEmail + "\n" +this.password + "\n" + this.department + "\n";
    }
}
