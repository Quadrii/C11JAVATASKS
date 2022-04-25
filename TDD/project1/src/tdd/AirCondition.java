package tdd;

public class AirCondition {
    private boolean on;
    private int temperature;

    public void increaseTemperature(){
        if (on == true) {
            if (temperature ==0 && temperature <=30) {
                temperature = temperature + 1;
            }
        }
    }

    public void decreaseTemperature(){
        if (on == true) {
            if (temperature == 30) {
                temperature = temperature - 1;
            }else if (temperature == 16) {
                temperature = temperature;
            }
        }
    }

    public int getTemperature(){
        return temperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void powerOffOrOn(){
        if(on==true){
            this.on = false;
    } else if (on==false) {
            this.on =true;
        }

    }

}
