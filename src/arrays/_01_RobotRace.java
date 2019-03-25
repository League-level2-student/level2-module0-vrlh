package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] robos = new Robot[4];
int[] check = new int[4];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < 4; i++) {
robos[i] = new Robot();
robos[i].setY(550);
robos[i].setSpeed(5000);

check[i] = 0;
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
robos[0].setX(50);
robos[1].setX(150);
robos[2].setX(250);
robos[3].setX(350);


	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random randy = new Random();
while(true) {
for(int d = 0; d<4; d++) {
	int r = randy.nextInt(50);
	for(int o = 0; o < r; o++){
		 robos[d].move(1);
		 robos[d].turn(1);
		 check[d]++;
		 if (check[d] > 360) {
			 System.out.println(d + " is the winner");
				return;
		 }
	}
}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

}
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.


}

