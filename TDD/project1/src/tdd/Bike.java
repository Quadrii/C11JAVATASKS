package tdd;

public class Bike {
    private boolean on;
    private int speed;
    
    public void accelerateBike() {
        if (on == true) {
            if (speed <= 20) {
                speed = speed + 1;
            } else if (speed > 20 && speed <= 30) {
                speed = speed + 2;
            } else if (speed > 30 && speed <= 40) {
                speed = speed + 3;
            } else if (speed > 40) {
                speed = speed + 4;
            }

        }
    }
    public int getSpeed() {
        return speed;
    }

    public void deccelerateBike(){
        if (speed <= 20) {
            speed  = speed - 1;
        } else if (speed > 20 && speed <= 30) {
            speed = speed - 2;
        } else if (speed > 30 && speed <= 40) {
            speed = speed - 3;
        }else if(speed > 40){
            speed = speed - 4;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void powerOfOrOn() {
        if(on==false){
            this.on = true;
        }else if(on==true){
            this.on = false;
        }
    }
}
