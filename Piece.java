public class Piece
{
  private boolean isFire, captured;
  private Board b;
  private int x, y;
  private String type;
  private String pieceURL;

  public Piece(boolean isFire, Board b, int x, int y, String type)
  {
    this.isFire = isFire;
    this.b = b;
    this.x = x;
    this.y = y;
    this.type = type;
    
    if(isFire())
      drawFire();
    else
      drawWater();
  }

  private void drawFire()
  {
    switch(type)
    {
      case "pawn":
        StdDrawPlus.picture(x + .5, y + .5, "img/pawn-fire.png", 1, 1);
        break;
      case "shield":
        StdDrawPlus.picture(x + .5, y + .5, "img/shield-fire.png", 1, 1);
        break;
      case "bomb":
        StdDrawPlus.picture(x + .5, y + .5, "img/bomb-fire.png", 1, 1);
        break;
      default:
        break;
    }
  }

  private void drawWater()
  {
    case "pawn":
      StdDrawPlus.picture(x + .5, y + .5, "img/pawn-water.png", 1, 1);
      break;
    case "shield":
      StdDrawPlus.picture(x + .5, y + .5, "img/shield-water.png", 1, 1);
      break;
    case "bomb":
      StdDrawPlus.picture(x + .5, y + .5, "img/bomb-water.png", 1, 1);
      break;
    default:
      break;
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
    return type.equals("Kinged");
  }

  boolean isBomb()
  {
    return type.equals("Bomb");
  }

  boolean isShield()
  {
    return type.equals("Shield");
  }

  void move(int x, int y)
  {
    int prev_x = this.x, prev_y = this.y;
    this.x = x;
    this.y = y;

    if(prev_x < x && prev_y < y)
    {
      while(prev_x < x)
      {
        prev_x += 1;
        prev_y += 1;
        if(b.canSelect(prev_x, prev_y))
        {
          captured = true;
          b.remove(prev_x, prev_y);
        }
      }
    }
    else if(prev_x < x && prev_y > y)
    {
      while(prev_x < x)
      {
        prev_x += 1;
        prev_y -= 1;
        if(b.canSelect(prev_x, prev_y))
        {
          captured = true;
          b.remove(prev_x, prev_y);
        }
      }
    }
    else if(prev_x > x && prev_y < y)
    {
      while(prev_x > x)
      {
        prev_x -= 1;
        prev_y += 1;
        if(b.canSelect(prev_x, prev_y))
        {
          captured = true;
          b.remove(prev_x, prev_y);
        }
      }
    }
    else
    {
      while(prev_x > x)
      {
        prev_x -= 1;
        prev_y -= 1;
        if(b.canSelect(prev_x, prev_y))
        {
          captured = true;
          b.remove(prev_x, prev_y);
        }
      }
    }
  }

  boolean hasChanged()
  {
    return captured;
  }

  void doneCapturing()
  {
    if(!captured)
    {
    }
  }
}
