package nyc.c4q.meltemyildirim;

/**
 * Created by meltemyildirim on 8/31/16.
 */
  public class Bicycle implements Vehicle, WheeliaAble {
    double initialSpeed;
    private int delta;
    int speed;

    @Override
    public void applyBreak(int brk){
      initialSpeed = initialSpeed - brk;
    }

    @Override
    public void speedUp(int gas){
      speed = speed + gas;
    }

    @Override
    public void slowDown(int delta){
      this.delta = delta;
    }

    @Override
    public boolean popWheelie(int duration){

      while(duration !=0){
        System.out.println("I'm a popping wheel");
        duration --;
      }
      return true;
    }

  }

