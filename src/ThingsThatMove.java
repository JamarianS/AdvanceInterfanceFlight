/**Class: ThingsThatFly
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: September 22, 2023
 *
 * This class – This is the tester method that creates an Airplane object and two Bird objects,and a movement
 * object. It stores the airpalne and bird objects into an
 * array. The prints the fly,walk,and jump method its also
 * prints the toString method from the Airplane and Bird classes.
 */
public class ThingsThatMove {
        public static void main(String[] args) {
            Airplane airplane = new Airplane("Boeing 747", 2016);
            Bird eagle = new Bird("Eagle");
            Bird Hummingbird = new Bird("Hummingbird");

            Flight Flying[] = {airplane, eagle, Hummingbird};

            for (Flight flight : Flying) {
                Movement movement = (Movement) flight;
                System.out.println(flight.toString());
                flight.fly();
                movement.walk();
                movement.jump();



            }
        }
    }

