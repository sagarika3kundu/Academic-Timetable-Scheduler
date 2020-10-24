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
import java.util.*;
import java.io.*;

public class DataManager {
    
    ATSManager mgr;
    
    public DataManager() {
        
    }
    
    public DataManager(ATSManager mgr) {
        this.mgr = mgr;
    }
        
        public ArrayList<Course> readCourse(String filepath_courses) {
            ArrayList<Course> myCourseList = new ArrayList<Course>();
            String delimiter = ",";
            BufferedReader br = null;
            try {
                StringTokenizer st = null;
                br = new BufferedReader(new FileReader(filepath_courses));
                String line = null;
              
                    
                while((line = br.readLine())!= null) {
                    st = new StringTokenizer(line, delimiter);
                    while(st.hasMoreTokens()) {
                                String code = st.nextToken();
	                        String name = st.nextToken();
	                        String contact_slot = st.nextToken();
	                        String course_type = st.nextToken();
	                        String resource = st.nextToken();
	                        String association="";
	                        try{
	                        association = st.nextToken();
	                        }catch(Exception e){}
	                        
	                      
	                        Course course_add = new Course(code,name,contact_slot,course_type,resource,association);
	                        myCourseList.add(course_add);
                    }
                }
                
            }
            catch (FileNotFoundException e) {
                System.out.println("The file was not found!\nEXITING...." + e.getMessage());
            }
            catch (IOException e) {
                System.out.println("The file could not be read!\nEXITING...." + e.getMessage());
            }
            catch(NullPointerException e)
            {
                System.out.println("FILE NOT PROVIDED\nEXITING....");
            }
            finally {
                try {
                    if(br != null) 
                        br.close();
                    } catch (IOException ex) { 
                        ex.printStackTrace();
                        }
            }
            return myCourseList;
        }
        
        public ArrayList<Instructor> readInstructor(String filepath_instructor) {
            ArrayList<Instructor> myInstructorList = new ArrayList<Instructor>();
            String delimiter = ",";
            BufferedReader br = null;
            try {
                StringTokenizer st = null;
                
                br = new BufferedReader(new FileReader(filepath_instructor));
                String line = null;
               
              
                    
                while((line = br.readLine())!= null) {
                    st = new StringTokenizer(line, delimiter);
                    while(st.hasMoreTokens()) {
                    	  String name = st.nextToken();
                          String expertise_one = st.nextToken();
                          String expertise_two = "0";
                          try{
                              expertise_two = st.nextToken();
                              }catch(Exception e){}
                          String expertise_three = "0";
                          try{
                                 expertise_three = st.nextToken();
                              }catch(Exception e){}
                          
                          String expertise_four="0";
                          try{
                          expertise_four = st.nextToken();
                          }catch(Exception e){}
                          
                      
                          int daySlot = 0,weekSlot=0;
                          Instructor Instructor_add = new Instructor(name , expertise_one , expertise_two,expertise_three,expertise_four,daySlot,weekSlot);
                          myInstructorList.add(Instructor_add);
                    }
                }
            }
            catch (FileNotFoundException e) {
                System.out.println("The file was not found!\nEXTING...." + e.getMessage());
            }
            catch (IOException e) {
                System.out.println("The file could not be read!\n EXTING...." + e.getMessage());
            }
            catch(NullPointerException e)
            {
                System.out.println("FILE NOT PROVIDED\n EXTING....");
            }
            finally {
                try {
                    if(br != null) 
                        br.close();
                    } catch (IOException ex) { 
                        ex.printStackTrace();
                        }
            }
            return myInstructorList;
        }
        
        
        /*public ArrayList<Room> readRoom(String filepath_room) {
            ArrayList<Room> myRoomList = new ArrayList<Room>();
            String delimiter = ",";
            BufferedReader br = null;
            try {
            	StringTokenizer st = null;
		        br = new BufferedReader(new FileReader(filepath_room));
                String line = null;
               
                    
                while((line = br.readLine())!= null) {
                    st = new StringTokenizer(line, delimiter);
                    while(st.hasMoreTokens()) {
                        String resource= st.nextToken();
                        String type= st.nextToken();
                        String capacity= st.nextToken();
                        
                        Room Room_add = new Room(resource,type,capacity);
                        myRoomList.add(Room_add);
                   
                    }
                }
            }
            catch (FileNotFoundException e) {
                System.out.println("The file was not found!\nEXTING...." + e.getMessage());
            }
            catch (IOException e) {
                System.out.println("The file could not be read!\n EXTING...." + e.getMessage());
            }
            catch(NullPointerException e)
            {
                System.out.println("FILE NOT PROVIDED\n EXTING....");
            }
            finally {
                try {
                    if(br != null) 
                        br.close();
                    } catch (IOException ex) { 
                        ex.printStackTrace();
                        }
            }
            return myRoomList;
        }
        
        
        public ArrayList<Section> readSection(String filepath_section) {
            ArrayList<Section> mySectionList = new ArrayList<Section>();
            String delimiter = ",";
            BufferedReader br = null;
            try {
            	StringTokenizer st = null;
		        br = new BufferedReader(new FileReader(filepath_section));
                String line = null;
               
                    
                while((line = br.readLine())!= null) {
                    st = new StringTokenizer(line, delimiter);
                    while(st.hasMoreTokens()) {
                        String year = st.nextToken();
                        String sec = st.nextToken();
                        String lab_section = st.nextToken();
                        String enrolment = st.nextToken();
                       
                        Section Section_add = new Section(year , sec , lab_section , enrolment);
                        mySectionList.add(Section_add);
                   
                    }
                }
            }
            catch (FileNotFoundException e) {
                System.out.println("The file was not found!\nEXTING...." + e.getMessage());
            }
            catch (IOException e) {
                System.out.println("The file could not be read!\n EXTING...." + e.getMessage());
            }
            catch(NullPointerException e)
            {
                System.out.println("FILE NOT PROVIDED\n EXTING....");
            }
            finally {
                try {
                    if(br != null) 
                        br.close();
                    } catch (IOException ex) { 
                        ex.printStackTrace();
                        }
            }
            return mySectionList;
        }
        
        
        public ArrayList<TimeSlot> readTimeSlots(String filepath_timeSlots) {
            ArrayList<TimeSlot> mytimeSlotList = new ArrayList<TimeSlot>();
            String delimiter = ",";
            BufferedReader br = null;
            try {
            	StringTokenizer st = null;
		        br = new BufferedReader(new FileReader(filepath_timeSlots));
                String line = null;
               
                    
                while((line = br.readLine())!= null) {
                    st = new StringTokenizer(line, delimiter);
                    while(st.hasMoreTokens()) {
                        String day = st.nextToken();
                        String slot = st.nextToken();
                        String startTime = st.nextToken();
                        String endTime = st.nextToken();
                       
                        TimeSlot timeSlot_add = new TimeSlot(day,slot,startTime,endTime);
                        mytimeSlotList.add(timeSlot_add);
                        
                   
                    }
                }
            }
            catch (FileNotFoundException e) {
                System.out.println("The file was not found!\nEXTING...." + e.getMessage());
            }
            catch (IOException e) {
                System.out.println("The file could not be read!\n EXTING...." + e.getMessage());
            }
            catch(NullPointerException e)
            {
                System.out.println("FILE NOT PROVIDED\n EXTING....");
            }
            finally {
                try {
                    if(br != null) 
                        br.close();
                    } catch (IOException ex) { 
                        ex.printStackTrace();
                        }
            }
            return mytimeSlotList;
        }     */
}  
