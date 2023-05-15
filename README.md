# SolidPrincipleAssignment
1.  Which principle of Solid principles will be used to resolve the below Scenerio? Implement that principle on below code.

public class FinalExam {

    public void AddQuestion() {
        //functionality of the method
    }
    public void ExpectedAnswer() {
        //functionality of the method
    }
    public void Marksdistribution() {
        //functionality of the method
    }
}

2.  Which principle of Solid principles will be used to resolve the below scenario? Implement that principle on below code.

public class StudentInfo {  

    public String Streamname(Student st) {  
    if (st instanceof Science) {  
        return st.getStream();  
    } if (st instanceof Commerce) {  
        return st.getStream();  
    }  
}

3.  Implement Liskov Substitution Principle on below code.

    public class Rectangle {
        private double height;
        private double width;
        public void setHeight(double h) { height = h; }
        public void setWidht(double w) { width = w; }
        ...
    }
    public class Square extends Rectangle {
        public void setHeight(double h) {
        super.setHeight(h);
        super.setWidth(h);
        }
        public void setWidth(double w) {
        super.setHeight(w);
        super.setWidth(w);
        }
    }

4.  Implement Interface segregation principle on below code.

    public interface Vehicle {
        public void drive();
        public void stop();
        public void refuel();
        public void openDoors();
    }
    public class Bike implements Vehicle {

        // Can be implemented
        public void drive() {...}
        public void stop() {...}
        public void refuel() {...}
       
        // Can not be implemented
        public void openDoors() {...}
    }

5. We have a class WindowMachine that contains keyboard and monitor classes inside it
   and we create instances of monitor and keyboard class inside WindowMachine constructor to use them.
   Implement Dependency Inversion Principle on below code.

    public class WindowsMachine  
    {  
        public final keyboard;  
        public final monitor;  
        public WindowsMachine()  
        {  
            monitor = new monitor();  //instance of monitor class  
            keyboard = new keyboard(); //instance of keyboard class  
        }  
    }
