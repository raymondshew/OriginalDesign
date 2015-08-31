import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int carX = 0; 
int car2X= 0;


public void setup()
{
background(0,0,255);
size(200,200);
}





public void draw()
{
	background(0,0,255);
	buildings();
	road();
	upCar();
	downCar();
	
	carX= carX+1;
	if (carX>100){
		carX= -110;
	}
	car2X= car2X-1;
	
}
	
public void buildings(){
	fill(192,192,192);
	rect(50,100,-50,-100);
	rect(100,100,-50,-75);
	rect(150,100,-50,-80);
	rect(200,100,-50,-40);
}

public void road(){
	fill(128,128,128);
	rect(0,100,200,100);
	fill(255,255,102);
	rect(10,140,30,15);
	rect(60,140,30,15);
	rect(110,140,30,15);
	rect(160,140,30,15);
}

public void upCar(){
	fill(200,0,0);
	rect(carX+100,105,30,20);
	fill(0,0,0);
	ellipse(carX+105,125,10,10);
	ellipse(carX+125,125,10,10);
}

public void downCar(){
	fill(200,200,0);
	rect(car2X+150,160,30,20);
	fill(0,0,0);
	ellipse(car2X+156,180,10,10);
	ellipse(car2X+173,180,10,10);
}





  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
