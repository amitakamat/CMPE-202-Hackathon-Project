/*
*  Hackathon
*  @Author: Pavana S Achar
*  CMPE 202  
*/

DisplayBox box;

Button button1;
Button button2;
Button button3;
Button button4;
Button button5;
Button button6;
Button button7;
Button button8;

void setup() 
{
  size(800,800);
  background(255);
  smooth() ;
  strokeWeight(4);
  strokeCap(ROUND);
  button1= new Button(100,200);
  button2=new Button(100,260);
  button3= new Button(100,320);
  button4 = new Button(100,380);
  button5= new Button(500,200);
  button6=new Button(500,260);
  button7= new Button(500,320);
  button8 = new Button(500,380);
  box = new DisplayBox(200,200);
}

void draw() {
 
  button1.draw();
  button2.draw();
  button3.draw();
  button4.draw();
  button5.draw();
  button6.draw();
  button7.draw();
  button8.draw();
  
  box.draw(); 
  
  textSize(18); 
  
}


void mousePressed(){
 if(button1.over(mouseX,mouseY))
  {
   box.SetDisplayMessage("button 1 is pressed",20,30);
  } 
  if(button2.over(mouseX,mouseY))
  {
   box.SetDisplayMessage("button 2 is pressed",20,80);
  }
  if(button3.over(mouseX,mouseY))
  {
   box.SetDisplayMessage("button 3 is pressed",20,130);
  }if(button4.over(mouseX,mouseY))
  {
   box.SetDisplayMessage("button 4 is pressed",20,180);
  }if(button5.over(mouseX,mouseY))
  {
   box.SetDisplayMessage("button 5 is pressed",80,30);
  }if(button6.over(mouseX,mouseY))
  {
   box.SetDisplayMessage("button 6 is pressed",80,80);
  }if(button7.over(mouseX,mouseY))
  {
   box.SetDisplayMessage("button 7 is pressed",80,130);
  }if(button8.over(mouseX,mouseY))
  {
   box.SetDisplayMessage("button 8 is pressed",80,180);
  }
}