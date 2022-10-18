package LoopShape;

public class LoopShape {

	static void createRectangle(int width, int height) {
		// Draw a Rectangle
		// Draw the top
		for (int i = 0; i < width; i++) {
			System.out.print("#");
		}
		System.out.println();
		// Draw the middle
		for (int j = 0; j < height - 2; j++) {

			System.out.print("#");
			for (int i = 0; i < width - 2; i++)
				;
			{
				System.out.print("   ");
			}
			if (width > 1) {
				System.out.println("#");
			} else {
				System.out.println();
			}
		}
		// Draw the bottom
		if (height > 1) {
			for (int i = 0; i < width; i++) {
				System.out.print("#");
			}

		}
		System.out.println();

	}

	static void createTriangle(int leg) {
		// Draw an Isosceles Right Triangle
		System.out.println(" ");
		// if line is 1
		for (int i = 1; i <= leg; i++) {

			if (i == 1) {
				// print one symbol
				System.out.println("#");
			}

			// else if line < leg
			else if (i < leg) {
				// print one symbol
				System.out.print("#");
				// loop line-2 times
				for (int j = 1; j <= i - 2; j++) {
					// print space
					System.out.print(" ");
				}

				// print one symbol and newline
				System.out.println("#");

			} else {
				// loop leg times
				for (int count = 0; count < leg; count++) {
					System.out.print("#");
				}

				// print symbol

			}

		}

	}
}
