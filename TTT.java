public class TTT{
private char[][] board;


public TTT(){ 
  board = new char [3][3]; 
  reset();
}
public char getWinner()
{ 
 for (int col = 0; col<3; col++)
 {
  if ((board[0][col] == board [1][col]) && (board [2] [col] == board [1] [col]))
  {
    if (board [0][col] == 'X')
    {
      return 'X';
    }
    if (board [0][col] =='O')
    {
      return 'O';
    }
  }}
  for (int row = 0; row<3; row++){
  if ((board[row][0] == board [row][1]) && (board [row] [2] == board [row][1]))
  {
   if (board [row][0] == 'X')
    {
      return 'X';
    }
    if (board [row][0] =='O')
    {
      return 'O';
    }
  }}
  if ((board[0][2] == board[1][1]) && ((board[0][2] == board [2][0])))
  {
    if (board [0][2] == 'X')
    {
      return 'X';
    }
    if (board [0][2] =='O')
    {
      return 'O';
    }
  } 
  if ((board[0][0] == board[1][1]) && ((board[0][0] == board [2][2])))
  {
if (board [0][0] == 'X')
    {
      return 'X';
    }
    if (board [0][0] =='O')
    {
      return 'O';
    }
  }
  else {
    return '-';
  } 
  return '-';
}
public void reset(){ 
  for (int row = 0; row < 3; row++){
    for (int column = 0; column < 3; column++){ 
      board[row][column] = '-';
    }
  }
}
public String toString(){ 
  String result = "\n"; 
  for (int row = 0; row < 3; row++){
    for (int column = 0; column < 3; column++){
       result += board[row][column] + " ";
    }
        result += "\n";
  }
  return result;
}
public boolean placeXorO(char player, int row, int column){ 
  if (board[row - 1][column - 1] == '-')
  {
board[row - 1][column - 1] = player; 
return true;
}
else 
return false;
}
public boolean full()
{
  for (int row = 0; row < 3; row++){
for (int column = 0; column < 3; column++)
{
  if (board [column][row] == '-')
  {
    return false;
  }
}
}
return true;
}

}
// Methods to test for fullness and to check for a winner // go