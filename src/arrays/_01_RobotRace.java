package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robs = new Robot[5];
		
		_01_RobotRace ex = new _01_RobotRace();
		
		for( int i = 0; i < robs.length; i++ ) {
			robs[i] = new Robot();
			robs[i].setX(100 + i*150);
			//robs[i].setY(100 + new Random().nextInt(500));
			robs[i].setY(200);
			new Thread(ex.getRunnable(robs[i])).start();
		}
	}

	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
    private Runnable getRunnable(Robot rob) {
    	return () -> {
    		rob.move(50);
/*
    		while( true ) {
    			boolean exit = false;
    				rob.move(new Random().nextInt(100));
    				if( rob.getY() <= 0 ) {
    					JOptionPane.showMessageDialog(null, "winner!");
    					exit = true;
    					break;
    				}
    			if( exit == true ) {
    				break;
    			}
    		}
*/
    	};
    }

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
