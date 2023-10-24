package com.mycompany.aggregationapp;

/**
 *
 * @author Joat
 */
public class Undergraduate extends Student {
    
    public Undergraduate(String idIn, String nameIn, String courseIn, Double markIn) {
        super(idIn, nameIn, courseIn, markIn);
    }
    
    public String getGrade() {
        if(this.mark <= 39) {
            return "Fail";
        }
        else if(this.mark >= 40 && this.mark < 50) {
            return "Third";
        }
        else if(this.mark >= 50 && this.mark < 60) {
            return "2/2";
        }
        else if(this.mark >= 60 && this.mark < 70) {
            return "2/1";
        }
        else {
            return "First";
        }
    }
}
