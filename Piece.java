public class Piece
{
  private boolean isFire;
  private Board b;
  private int x, y;
  private String type;

  public Piece(boolean isFire, Board b, int x, int y, String type)
  {
    this.isFire = isFire;
    this.b = b;
    this.x = x;
    this.y = y;
    this.type = type;
  }

  boolean isFire()
  {
    return isFire;
  }

  int side()
  {
    if(isFire)
      return 0;
    else
      return 1;
  }

  boolean isKing()
  {
    
  }

  booealn isBomb()
  {
  }

  boolean isShield()
  {
  }

  void move(int x, int y)
  {
  }

  boolean hasChanged()
  {
  }

  void doneCapturing()
  {
  }
}
