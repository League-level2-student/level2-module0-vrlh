package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] robos = new Robot[5];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < 5; i++) {
robos[i] = new Robot();
robos[i].setY(550);
robos[i].setSpeed(50);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
robos[0].setX(50);
robos[1].setX(150);
robos[2].setX(250);
robos[3].setX(350);
robos[4].setX(450);

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random randy = new Random();
while(robos[0].getY() > 0 && robos[1].getY() > 0 && robos[2].getY() > 0 && robos [3].getY() > 0
		&& robos[4].getY() > 0) {
for(int d = 0; d<5; d++) {
	robos[d].move(randy.nextInt(50));
}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
for (int w = 0; w<5; w++) {
	if(robos[w].getY() <= 0) {
		System.out.println(w + " is the winner");
		break;
	}
}
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
