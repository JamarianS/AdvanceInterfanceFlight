/**Class: Bird
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: September 22, 2023
 *
 * This class – This class implements both the Flight and Movement interface, it also
 * creates a constructor, getters and setters and overrides the fly, walk, and jump methods
 */
public class Bird implements Flight, Movement {
    String type;

    public Bird(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println("I flap my wings to fly.");
    }

    @Override
    public void walk() {
        System.out.println("I walk on my feet.");
    }

    @Override
    public void jump() {
        System.out.println("I jump by leaping from my feet.");
    }

    @Override
    public String toString() {
        return "Bird [type=" + type + "]";
    }
}