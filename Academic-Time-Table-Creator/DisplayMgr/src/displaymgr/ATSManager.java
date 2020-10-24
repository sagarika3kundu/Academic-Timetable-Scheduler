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

import java.util.ArrayList;


public class ATSManager{
    DataManager dataMgr;
    LogicManager logicMgr;
    DisplayManager dispMgr;
    
    ArrayList<Course> course;
    ArrayList<Instructor> instructor;
    //ArrayList<Room> room;
    //ArrayList<Section> section;
    //ArrayList<TimeSlot> timeSlots;
    
    public static void main(String[] args){
    	String filepath_courses="courses.csv";
    	String filepath_instructor="instructors.csv";
    	//String filepath_section="C:\\Users\\Sahil\\Desktop\\SP\\sections.csv";
    	//String filepath_room="C:\\Users\\Sahil\\Desktop\\SP\\rooms.csv";
    	//String filepath_timeSlot="C:\\Users\\Sahil\\Desktop\\SP\\timeslots.csv";
      
       
        ATSManager myMgr = new ATSManager();
        myMgr.dataMgr = new DataManager();
        myMgr.logicMgr=new LogicManager();
               try{
        
		myMgr.course = myMgr.dataMgr.readCourse(filepath_courses);
		myMgr.instructor = myMgr.dataMgr.readInstructor(filepath_instructor);
		//myMgr.section = myMgr.dataMgr.readSection(filepath_section);
		//myMgr.timeSlots = myMgr.dataMgr.readTimeSlots(filepath_timeSlot);
		//myMgr.room = myMgr.dataMgr.readRoom(filepath_room);
                
               }
               catch(Exception e){
               System.out.println("ERROR");}
               
                myMgr.logicMgr.createCAT(myMgr.course,myMgr.instructor);
                //myMgr.dispMgr.startUI();
                
   }  
}