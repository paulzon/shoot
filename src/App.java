import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class App extends JFrame {

  private static final long serialVersionUID = 1L;

  protected static final int D_W = 1325;

  protected static final int D_H = 715;

  public static void main( String[] args ) {
    App app = new App();
    app.setVisible( true );
  }

  public App() {
    super( "Shoot 2.1.0" );
    try {
      UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
    }
    catch ( Exception e ) {
      e.printStackTrace();
    }

    // hide mouse cursor
    BufferedImage cursorImg = new BufferedImage( 16, 16, BufferedImage.TYPE_INT_ARGB );
    Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor( cursorImg, new Point( 0, 0 ), "blank cursor" );
    this.getContentPane().setCursor( blankCursor );

    this.setIconImage( ( new ImageIcon( getClass().getResource( "resource/bullet.png" ) ).getImage() ) );
    this.setSize( D_W, D_H );
    this.setResizable( false );
    this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    this.add( new Action() );
  }

}