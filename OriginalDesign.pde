int carX = 0; 
int car2X= 0;


void setup()
{
background(0,0,255);
size(200,200);
}





void draw()
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
	
void buildings(){
	fill(192,192,192);
	rect(50,100,-50,-100);
	rect(100,100,-50,-75);
	rect(150,100,-50,-80);
	rect(200,100,-50,-40);
}

void road(){
	fill(128,128,128);
	rect(0,100,200,100);
	fill(255,255,102);
	rect(10,140,30,15);
	rect(60,140,30,15);
	rect(110,140,30,15);
	rect(160,140,30,15);
}

void upCar(){
	fill(200,0,0);
	rect(carX+100,105,30,20);
	fill(0,0,0);
	ellipse(carX+105,125,10,10);
	ellipse(carX+125,125,10,10);
}

void downCar(){
	fill(200,200,0);
	rect(car2X+150,160,30,20);
	fill(0,0,0);
	ellipse(car2X+156,180,10,10);
	ellipse(car2X+173,180,10,10);
}





