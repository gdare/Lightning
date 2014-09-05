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

public class Lightning extends PApplet {

int startPosX = 250;
int startPosY = 150;
int endPosX = startPosX;
int endPosY = 0;
float cloudPosX = 250;
float cloudPosY = 150;
int cloudSize = 50;

public void setup(){
	size(500,500);
    strokeWeight(1);
    background(255);
    noLoop();
}
public void draw(){
	
    while(endPosY < 500){
        strokeWeight(1);
        stroke(0,150,100);
        endPosX = startPosX + (int)random(-10,10);
        endPosY = startPosY + (int)random(1,10);
        line(startPosX,startPosY,endPosX,endPosY);
        System.out.println(""+startPosX+", " +startPosY+ ", " +endPosX + ", " +endPosY);
        startPosX = endPosX;
        startPosY = endPosY;
    }
	cloud();
}
public void mousePressed(){
    background(255);
    startPosX = (int)random(225,275);
    startPosY = 150;
    endPosX = startPosX;
    endPosY = 0;
    redraw();
}
public void cloud(){
    strokeWeight(2);
    stroke(100,100,100);
	fill(100,100,100);
    ellipse(cloudPosX, cloudPosY,cloudSize,cloudSize);
    ellipse(cloudPosX + 25, cloudPosY, cloudSize, cloudSize);
    ellipse(cloudPosX - 25, cloudPosY, cloudSize, cloudSize);
    ellipse(cloudPosX + 12.5f, cloudPosY - 12.5f, cloudSize, cloudSize);
    ellipse(cloudPosX - 12.5f, cloudPosY - 12.5f, cloudSize, cloudSize);
    ellipse(cloudPosX + 12.5f, cloudPosY + 12.5f, cloudSize, cloudSize);
    ellipse(cloudPosX - 12.5f, cloudPosY + 12.5f, cloudSize, cloudSize);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
