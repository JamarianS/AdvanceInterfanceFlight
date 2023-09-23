/**Class: Airplane
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: September 22, 2023
 *
 * This class – This class implements both the Flight and Movement interface, it also
 * creates a constructor, getters and setters and overrides the fly, walk, and jump methods
 */
public class Airplane implements Flight,Movement {
        String model;
        int yearBuilt;

        public Airplane(String model, int yearBuilt){
            this.model = model;
            this.yearBuilt = yearBuilt;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYearBuilt() {
            return yearBuilt;
        }

        public void setYearBuilt(int yearBuilt) {
            this.yearBuilt = yearBuilt;
        }

        @Override
        public void fly(){
            System.out.println("I rely on my engine to fly");
        }

        public void walk(){
            System.out.println("I tax on my wheels");
        }

        public void jump(){
            System.out.println("I cannot jump");
        }

        @Override
        public String toString() {
            return "Airplane [" + "model='" + model + '\'' + ", yearBuilt=" + yearBuilt + ']';
        }
    }
