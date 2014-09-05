int startPosX = 250;
int startPosY = 150;
int endPosX = startPosX;
int endPosY = 0;
float cloudPosX = 250;
float cloudPosY = 150;
int cloudSize = 50;

void setup(){
	size(500,500);
    strokeWeight(1);
    background(255);
    noLoop();
}
void draw(){
	
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
void mousePressed(){
    background(255);
    startPosX = (int)random(225,275);
    startPosY = 150;
    endPosX = startPosX;
    endPosY = 0;
    redraw();
}
void cloud(){
    strokeWeight(2);
    stroke(100,100,100);
	fill(100,100,100);
    ellipse(cloudPosX, cloudPosY,cloudSize,cloudSize);
    ellipse(cloudPosX + 25, cloudPosY, cloudSize, cloudSize);
    ellipse(cloudPosX - 25, cloudPosY, cloudSize, cloudSize);
    ellipse(cloudPosX + 12.5, cloudPosY - 12.5, cloudSize, cloudSize);
    ellipse(cloudPosX - 12.5, cloudPosY - 12.5, cloudSize, cloudSize);
    ellipse(cloudPosX + 12.5, cloudPosY + 12.5, cloudSize, cloudSize);
    ellipse(cloudPosX - 12.5, cloudPosY + 12.5, cloudSize, cloudSize);
}

