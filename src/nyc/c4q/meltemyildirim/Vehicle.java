package nyc.c4q.meltemyildirim;

/**
 * Created by meltemyildirim on 8/31/16.
 */
public interface Vehicle {

  void applyBreak(int speed);
  void speedUp(int delta);
  void slowDown(int delta); // delta will say how much slowdown by
}
