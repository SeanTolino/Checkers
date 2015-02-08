public class Board 
{
  //private static boolean[][] pieces; 
  
  Board(boolean shouldBeEmpty)
  {
    if(shouldBeEmpty)
      drawBoard(8);
  }
  /*
  public Piece pieceAt(int x, int y){}

  public boolean canSelect(int x, int y) {}

  public void select(int x, int y) {}

  public void place (Piece p, int x, int y) {}

  public Piece remove(int x, int y) {}

  public boolean canEndTurn() {}

  public void endturn() {}

  public String winner() {}
  */
  private static void drawBoard(int N) 
  {
    for (int i = 0; i < N; i++) 
    {
      for (int j = 0; j < N; j++) 
      {
        if ((i + j) % 2 == 0) 
          StdDrawPlus.setPenColor(StdDrawPlus.GRAY);
        else                  
          StdDrawPlus.setPenColor(StdDrawPlus.RED);

        StdDrawPlus.filledSquare(i + .5, j + .5, .5);
        StdDrawPlus.setPenColor(StdDrawPlus.WHITE);
        /*if (pieces[i][j]) 
        {
          StdDrawPlus.picture(i + .5, j + .5, "img/bomb-fire-crowned.png", 1, 1);
        }*/
      }
    }
  }

  public static void main(String[] args) 
  {
    int N = 8;
    StdDrawPlus.setXscale(0, N);
    StdDrawPlus.setYscale(0, N);
    //pieces = new boolean[N][N];

    /** Monitors for mouse presses. Wherever the mouse is pressed,
        a new piece appears. */
    /*while(true) 
    {
      drawBoard(N);
      if (StdDrawPlus.mousePressed()) {
        double x = StdDrawPlus.mouseX();
        double y = StdDrawPlus.mouseY();
        pieces[(int) x][(int) y] = true;
      }            
      StdDrawPlus.show(100);
    }*/
    Board testBoard = new Board(true);
  }
}
