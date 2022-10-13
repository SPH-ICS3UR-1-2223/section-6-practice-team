package LoopShape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
    	//Draw the top
    	for (int i=0;i<width;i++) {
    		System.out.print("#");
    	}
    	System.out.println();
    	//Draw the middle
    	for (int j = 0; j < height-2; j++) {
			
    	System.out.print("#");
    	for (int i=0;i<width-2;i++); {
    		System.out.print ("   ");
    	}
    	if (width>1) {
    		System.out.println("#");
    	}else {
    		System.out.println();
    	}
    }
    	//Draw the bottom
    	if (height>1) {
    		for (int i=0;i<width;i++) {
        		System.out.print("#");
        	}
    		
    	}
        	System.out.println(); 
        
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
    	System.out.println();
    	
    	for (int line=1;line<=leg;line++) {
    		
    		if (line == 1) {
    			System.out.println("#");
    			
    		}
    			
    			else if (line <1) {
    				String a = ("#");
    				String b = (" ");
    				
    				
    				System.out.println(a+b+a);
    				
    			} 
    		
    		
    		for (line==leg;) {
    			System.out.println("#");
    		}
    		
    		};
    	}
    	
    	
    	
    }

