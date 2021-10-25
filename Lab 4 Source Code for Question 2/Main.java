/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Clarence Lau
 * @version 1.0
 */

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Vector _shapes = new Vector();
		boolean cont = true;
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		Shape [] shapeCreators ={new Circle(0,0,0), new Rectangle(0, 0,0,0)};

		try {
			while (cont) {
				System.out.println("Enter command: 0 = exit, 1 = draw all shapes, 2 = create circle, 3 = create rectangle");
				String line = br.readLine();
				int command = Integer.parseInt(line);
				if (command == 0)
					cont = false;
				else if (command == 1) {
					for (int i = 0; i < _shapes.size(); i++)
						( (Shape) _shapes.elementAt(i)).draw();

				//nothing to del 
				
				} else{
					_shapes.add(shapeCreators[command-2].create() );
				

				} 
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}