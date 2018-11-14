public class SoundBox implements Runnable {

  private SoundEffect next;

  public SoundBox( SoundEffect next ) {
    this.next = next;
  }

  @Override
  public void run() {
    try {
      next.play();
    }
    catch ( Exception e ) {
    }
  }

}
