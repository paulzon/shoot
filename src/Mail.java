import java.awt.Image;

import javax.swing.ImageIcon;

public class Mail extends Coin {

  public Mail() {
    this.start();
  }

  @Override
  public Image getImage() {
    return ( new ImageIcon( getClass().getResource( "resource/mail.png" ) ) ).getImage();
  }

  @Override
  public int move() {
    return 0;
  }

  @Override
  public void start() {
    x = App.D_W / 2;
    y = App.D_H / 2;
  }

}