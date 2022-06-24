import java.util.Scanner; 
import java.util.Random;
import java.util.ArrayList;

public class Main{
public static void main(String[]args){
  
 Scanner reader = new Scanner(System.in); 
 TTT board = new TTT();
// Display the empty board
System.out.println(board.toString());
ArrayList<Integer> posMov = new ArrayList (9);
for (int i = 1; i <10; i++ ){
posMov.add(i);
  
}

// Randomly decide who goes first
Random gen = new Random(); 
char player; 
if (gen.nextInt(2) == 1)
{
player = 'O';
}
else{ 
player = 'X';
}
// Loop while there is no winner and the board is not full
while (board.getWinner() == '-' && !board.full()){
  int row= 0;
  int column= 0;
// Prompt the user for a move
System.out.println(player + "'s turn"); System.out.print("Enter the row and column[1-3, space, 1-3]: ");
// Read the move
if (player == 'X'){
row = reader.nextInt(); 
column = reader.nextInt();
}
else {
  int cpuMov = posMov.get(gen.nextInt(posMov.size()));
  column= cpuMov %3;
row = (int)((cpuMov-1)/3) +1;
if (row == 0)
row = 1;
if (column ==0)
column =3;
System.out.print(row);
  System.out.print(column);
  
}
boolean success = board.placeXorO(player, row, column); 
if (! success)
System.out.println("Error: cell already occupied!"); 
else{
  posMov.remove(posMov.indexOf((3*(row- 1) + column)));
System.out.println(board); 
if (player == 'X'){
player = 'O';}
else{
player = 'X';}
}
}
// Display results
char winner = board.getWinner(); 
if (winner != '-'){
System.out.println(winner + "s win!");}
else{
System.out.println("It's a draw!");}
}
}
