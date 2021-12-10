import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(194, 236, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    stroke(89, 207, 106);
    fill(89, 207, 106);
    rect(0, 350, 500, 500);  
    
    stroke(252, 239, 119);
    fill(252, 239, 119);
    ellipse(30, 30, 150, 150);
    
    stroke(173, 112, 66);
    fill(173, 112, 66);
    rect(150, 250, 140, 140);
    
    stroke(61, 27, 3);
    fill(61, 27, 3);
    triangle(140, 260, 220, 180, 300, 260);
 
  }
  
  // define other methods down here.
}