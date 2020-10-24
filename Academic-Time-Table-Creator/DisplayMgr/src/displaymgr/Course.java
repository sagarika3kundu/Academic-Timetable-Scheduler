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
public class Course {
    String code, name, course_type, resource_type, association;
    String contact_slots;
    
    Course(){
        
    }
    
    Course(String c,String n,String cs,String ct,String rt,String a)
    {
        code=c;
        name=n;
        course_type=ct;
        resource_type=rt;
        association=a;
        contact_slots=cs;
    }
    public int getContact_slot() {
		return Integer.parseInt(contact_slots);
	}
}
