import java.awt.Image;

import javax.swing.ImageIcon;

public class Bomb extends Coin {

  public Bomb() {
    this.start();
  }

  @Override
  public int getStartpunkt() {
    return -100;
  }

  @Override
  public Image getImage() {
    return ( new ImageIcon( getClass().getResource( "resource/bomb.png" ) ) ).getImage();
  }

  @Override
  public int move() {
    if ( y >= App.D_H ) {
      return -1;
    }
    y += INCREMENT * 2;
    return 0;
  }

  @Override
  public void start() {
    y = Demand.getRandomInt( getStartpunkt(), 0 );
    x = Demand.getRandomInt( schwankung, App.D_W - schwankung );
  }
}
