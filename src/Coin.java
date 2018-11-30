import java.awt.Image;

import javax.swing.ImageIcon;

public class Coin extends Demand {

  public Coin() {
    this.start();
  }

  @Override
  public int getStartpunkt() {
    return -2000;
  }

  @Override
  public Image getImage() {
    return ( new ImageIcon( getClass().getResource( "resource/coin.png" ) ) ).getImage();
  }

  @Override
  public int move() {
    if ( y >= App.D_H ) {
      this.start();
    }
    else {
      y += INCREMENT;
      if ( x < 0 )
        x += getRandomInt( 0, INCREMENT * 2 );
      else if ( x > App.D_W - 48 )
        x += getRandomInt( 0 - INCREMENT * 2, 0 );
      else
        x += getRandomInt( 0 - INCREMENT * 2, INCREMENT * 2 );
    }
    return 0;
  }

  @Override
  public void start() {
    y = getRandomInt( getStartpunkt(), 0 );
    x = getRandomInt( schwankung, App.D_W - schwankung );
  }

}