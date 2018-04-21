void setup(){
PImage face= loadImage("beyonce.png");
background(face);
size(1093,873);
}
void draw(){
  fill(255,255,255);
  ellipse(479,309,30,20);
  ellipse(598,294,28,18);

  
  if(mousePressed){
    println(mouseX+" "+mouseY);
    
  }
  if(mouseX<472){
    mouseX=472;   
}
if(mouseX>486){
  mouseX=486;
}
if (mouseY>313){
mouseY=313;
}
if(mouseY<306){
  mouseY=306;
}
  ellipse(mouseX,mouseY,10,10);
  ellipse(mouseX+117,mouseY-15,10,10);
}