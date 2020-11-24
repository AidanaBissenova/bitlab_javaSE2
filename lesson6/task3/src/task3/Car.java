package task3;

public class Car extends Thread{

    int speed;
    double distance;

    public Car() {
    }

    public Car(String name, int speed, double distance) {
        super(name);
        this.speed = speed;
        this.distance = distance;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void run(){
        try{
            double distance2=speed;
            int i=1;
            while (distance2<distance){
                System.out.println(getName() + " "+i+" is in  " + distance2);
                distance2+=speed;
                i++;
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
