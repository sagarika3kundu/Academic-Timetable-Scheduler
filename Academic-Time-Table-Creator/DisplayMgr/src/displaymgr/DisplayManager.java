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
public class DisplayManager {
       
    private Welcome w;
    private FILTER f;
    private TimeTable t;
    private Close c;
    private Export e;
    /*public static void main(String[] args) {
        
        DisplayMgr myMgr = new DisplayMgr();
      //System.out.println("working");
        myMgr.w = new Welcome(myMgr);
        //System.out.println("working1");
        myMgr.f = new FILTER(myMgr);
         //System.out.println("working2");

        myMgr.t= new TimeTable(myMgr);
       //System.out.println("working3");
       myMgr.e= new Export(myMgr);
               myMgr.c= new Close(myMgr);
        //System.out.println("working4");
        myMgr.showScreen1();
                
    }*/
    public static void startUI(){
    DisplayManager myMgr = new DisplayManager();
      //System.out.println("working");
        myMgr.w = new Welcome(myMgr);
        //System.out.println("working1");
        myMgr.f = new FILTER(myMgr);
         //System.out.println("working2");

        myMgr.t= new TimeTable(myMgr);
       //System.out.println("working3");
       myMgr.e= new Export(myMgr);
               myMgr.c= new Close(myMgr);
        //System.out.println("working4");
        myMgr.showScreen1();
    }
    /*public static void main(String args[])
    {
        startUI();
    }*/
    public void showScreen1() {
        
        w.setVisible(true);
    }
    
    public void showScreen2() {
        
        w.setVisible(false);
        f.setVisible(true);
        t.setVisible(false);
    }
    public void showScreen3() {
           t.setVisible(true);
          f.setVisible(false);
          e.setVisible(false);
     
    }
    public void showScreen4() {
        
        t.setVisible(false);
        c.setVisible(true);
    }
    public void ExportFile(){
        e.setVisible(true);
        t.setVisible(false);
    }
    public void exitFRS() {
        c.setVisible(false);
        e.setVisible(false);
        System.exit(0);
    }
}
