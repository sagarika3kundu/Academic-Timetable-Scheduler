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

public class LogicManager {
    public void createCAT (ArrayList<Course> courses,ArrayList<Instructor> instructors){
		int[][] PAT= new int[instructors.size()][courses.size()];
		int[][] CAT= new int[instructors.size()][courses.size()];
		for(int j=1;j<instructors.size();j++){
			for (int i=0;i<courses.size();i++){
			CAT[j][i]=0;	
			PAT[j][i]=2;
		}
		}
		int[] totalSlot=new int[courses.size()];
		for (int i=1;i<courses.size();i++){
			if(courses.get(i).course_type.toString().equals("Lecture")){
				totalSlot[i]=courses.get(i).getContact_slot()*3;
			}
			else{
				totalSlot[i]=courses.get(i).getContact_slot()*6;
			}
		}
		for (int i=1;i<courses.size();i++){
			for(int j=1;j<instructors.size();j++){
				  if(instructors.get(j).expertise_1.toString().equals(courses.get(i).code.toString())){
					PAT[j][i]=10;	
				}
				else if(instructors.get(j).expertise_2.toString().equals(courses.get(i).code.toString())){
					PAT[j][i]=8;
				}
				else if(instructors.get(j).expertise_3.toString().equals(courses.get(i).code.toString())){
					PAT[j][i]=6;
				}
				else if(instructors.get(j).expertise_4.toString().equals(courses.get(i).code.toString())){
					PAT[j][i]=4;
				}
				
			}
		}
		double[] priority=new double[instructors.size()];	
		int[] HAT=new int[instructors.size()];
		int[] tId= new int[instructors.size()];
		int n=instructors.size();
		int t1;
		double t2;
		for(int i=1;i<instructors.size();i++){
			HAT[i]=15;
			tId[i]=i;
		}
		for (int i=1;i<courses.size();i++){
		
			while(totalSlot[i]>0){
				for(int j=1;j<instructors.size();j++){
					priority[j]= ((PAT[j][i])/5.0)*((HAT[j])/15.0);
		
				}
				for(int k=1;k<instructors.size();k++){					
					tId[k]=k;
				}		
				 for (int k = 1; k <n; k++) 
			        {
			            for (int j = k + 1; j < n; j++) 
			            {
			                if (priority[k] < priority[j]) 
			                {
			                    t2 = priority[k];
			                    priority[k] = priority[j];
			                    priority[j] = t2;
			                    t1 = tId[k];
			                    tId[k] = tId[j];
			                    tId[j] = t1;
			                }
			                
			            }
			        }
				int x=0;
				for(int j=1;j<n;j++){					
					if(courses.get(i).course_type.toString().equals("Lecture")){
						for(int k=totalSlot[i];k>0;k--){
							if(HAT[tId[j]]-k>0){
								
								x=k;
								break;
							}
						}
					}
					else if(courses.get(i).course_type.toString().equals("Lab")){
						for(int k=totalSlot[i];k>0;k-=3){
						if(HAT[tId[j]]-k>0){
							x=k;
							
							break;
						}
						}
					}
					if(x>0){
						CAT[tId[j]][i]=CAT[tId[j]][i]+x;
						HAT[tId[j]]=HAT[tId[j]]-x;
						totalSlot[i]=totalSlot[i]-x;
						x=0;
					}
				}
				
			}
		}
                System.out.print("\t");
                for(int i=1;i<courses.size();i++)
                {
                	if(i==1|| i==7)
                     System.out.print(courses.get(i).code+"  ");
                	else
                		System.out.print(courses.get(i).code+"\t");
                }
                System.out.println();
                for(int i =1; i <instructors.size() ; i++){
                System.out.print(instructors.get(i).instructor_name+"\t");
		for(int j = 1; j<courses.size() ; j++)
		{
			if((int)CAT[i][j]!=0)
			System.out.print("  "+(int)CAT[i][j] + "\t");
			else
				System.out.print("  -\t");
		}
			System.out.println();}
                
                
    }
   
}
