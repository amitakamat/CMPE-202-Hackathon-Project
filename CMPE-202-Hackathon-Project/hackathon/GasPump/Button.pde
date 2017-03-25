/*
* Hackathon
*  @Author: Pavana S Achar
*  CMPE 202  
*/


public class Button{
  int x,y;
  
  String label;
  
  color grey = color(204);
  color black = color(0);
    

  Button(int xp,int yp){
    this.x=xp;
    this.y=yp;
    
  }
  
  boolean over(int mx,int my){
    if((mx>=this.x)&&(mx<=this.x+75)&&(my>=this.y)&&(my<=this.y+40))
       return true;
    else
      return false;
    
    
  }
  
 void draw()
 {
 
 fill(255);
 if(over(mouseX,mouseY))
 {
   fill(grey);
 
 if(pressed())
 {
   fill(black);
 }
 }
 rect(x,y,75,40);
 
}
  
 boolean pressed(){
    if(mousePressed == true)
        return true;    
    else
        return false;
   }
  
}
 