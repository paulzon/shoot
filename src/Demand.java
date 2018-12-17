import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class Demand {
  int x, y, schwankung = 20;

  protected static final int INCREMENT = 5;

  public Demand() {
    this.start();
  }

  public int getStartpunkt() {
    return -100;
  }

  public void draw( Graphics g ) {
    g.drawImage( getImage(), x, y, null );
  }

  public Image getImage() {
    return ( new ImageIcon( getClass().getResource( "resource/rf.png" ) ) ).getImage();
  }

  public int move() {
    if ( y >= App.D_H ) {
      start();
      return getBalance();
    }
    y += INCREMENT;
    if ( x < 0 )
      x += getRandomInt( 0, INCREMENT * 2 );
    else if ( x > App.D_W - 48 )
      x += getRandomInt( 0 - INCREMENT * 2, 0 );
    else
      x += getRandomInt( 0 - INCREMENT * 2, INCREMENT * 2 );
    return 0;
  }

  public void start() {
    y = getRandomInt( getStartpunkt(), 0 );
    x = getRandomInt( schwankung, App.D_W - schwankung );
  }

  public int getBalance() {
    return -10;
  }

  public static int getRandomInt( int low, int high ) {
    Random r = new Random();
    return r.nextInt( high - low ) + low;
  }

}
