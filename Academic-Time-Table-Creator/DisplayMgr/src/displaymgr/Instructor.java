/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displaymgr;

/**
 *
 * @author Sahil
 */
public class Instructor 
    {
    String  instructor_name, expertise_1,expertise_2,expertise_3,expertise_4;
    int day_slot,week_slot;
    
    Instructor(){
        
    }
    
    Instructor(String in,String e1,String e2,String e3,String e4,int d,int w)
    {
        instructor_name=in;
        expertise_1=e1;
        expertise_2=e2;
        expertise_3=e3;
        expertise_4=e4;
        day_slot=d;
        week_slot=w;
    }
    
}