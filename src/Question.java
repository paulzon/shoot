import java.awt.Image;

import javax.swing.ImageIcon;

public class Question extends Coin {

  int offset = 1;

  public Question() {
    this.start();
  }

  @Override
  public int getStartpunkt() {
    return -1000;
  }

  @Override
  public Image getImage() {
    return ( new ImageIcon( getClass().getResource( "resource/question.png" ) ) ).getImage();
  }

  @Override
  public int move() {
    if ( y >= App.D_H ) {
      y = getRandomInt( getStartpunkt(), 0 );
      x = getRandomInt( schwankung, App.D_W - schwankung );
      // return -1;
    }
    else {
      y += INCREMENT * 1;
      if ( x < 0 || x > App.D_W - 48 )
        offset = offset * -1;
      x += INCREMENT * offset;
    }
    return 0;
  }

  @Override
  public void start() {
    y = getRandomInt( getStartpunkt(), 0 );
    x = getRandomInt( schwankung, App.D_W - schwankung );
    offset = getRandomInt( 0, 2 ) == 1 ? 1 : -1;
  }

}
