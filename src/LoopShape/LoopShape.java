package LoopShape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        
    	String tag = "#";
    	
    	while (width <1 || height <1) {
    		System.out.println();
    	}
    	
    	while (width >=1 && height >=1) {
    	
    	for (int counter = 1; counter >=height || counter >= width; counter++);
    	System.out.println(tag);
    	
    	}
        
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        
    }
}
