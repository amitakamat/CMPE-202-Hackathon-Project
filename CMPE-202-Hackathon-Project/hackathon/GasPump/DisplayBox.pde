/*
*  Hackathon
*  @Author: Pavana S Achar
*  CMPE 202  
*/

public class DisplayBox{
    int x;
    int y;
    int nx;
    int ny;
    String msg;
    Boolean display=false;
    
    public DisplayBox(int x,int y){
          this.x = x;
          this.y = y;
    }
    
    void draw(){
      fill(255);
      rect(x,y,270,220);    
      if(display){
        fill(0);
        text(msg,x+nx,y+ny); 
      }
    }
    
    public void SetDisplayMessage(String msg, int nx,int ny){          
            this.msg = msg;
            this.nx = nx;
            this.ny = ny;
            display = true;
            
    }
  
  }
   