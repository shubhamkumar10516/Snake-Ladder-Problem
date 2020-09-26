public class Main{

 public static void main(String args[]){

  int player1Position = 0;
  int player2Position = 0;
  int winningPosition = 100;
  int possiblityPlayer1 = 0;
  int possiblityPlayer2 = 0;
  int diceRollPlayer1 = 0;
  int diceRollPlayer2 = 0;
  int noPlay = 0;
  int ladder = 0;
  int snake = 0;
  int diceCount = 0;
  // 0 for noPlay, 1 for ladder, 2 for snake
  while(player1Position < 100 &&  player2Position < 100){
   diceCount++;//counting dice
   
  
  // for player 1
  
 // player 1 rolled the dice
   diceRollPlayer1 = 1 + (int)(Math.floor(Math.random()*10))%6;
   possiblityPlayer1 = (int)(Math.floor(Math.random()*10))%3;
  
   noPlay = 0;
   ladder = diceRollPlayer1;
   snake = diceRollPlayer1;
  
   System.out.println("Player 1 position: "+ player1Position);

  if(possiblityPlayer1 == 0) 
      player1Position = player1Position;
  else if(possiblityPlayer1 == 1){
      
      player1Position = player1Position + ladder;
      if(player1Position > 100)// position should exactly be 100 
         player1Position = player1Position - ladder;
       else if (player1Position == 100){// player 1 winner
        System.out.println("Player 1 won the game");
        System.out.println("dice count: "+diceCount);
        return;
       }
   }
  else{
      player1Position = player1Position - snake;
      if(player1Position < 0)// if position is negative 
        player1Position = 0;
      }

  

  
  // for player 2
  
 // player 2 rolled the dice
   diceRollPlayer2 = 1 + (int)(Math.floor(Math.random()*10))%6;
   possiblityPlayer2 = (int)(Math.floor(Math.random()*10))%3;
  
   noPlay = 0;
   ladder = diceRollPlayer2;
   snake = diceRollPlayer2;
  
   
   System.out.println("Player 2 position: "+ player2Position);
  
   if(possiblityPlayer2 == 0) 
      player2Position = player2Position;
  
   else if(possiblityPlayer2 == 1){
      
      player2Position = player2Position + ladder;
      if(player2Position > 100)// position should exactly be 100 
         player2Position = player1Position - ladder;
       else if (player2Position == 100){// player 2 winner
        System.out.println("Player 2 won the game");
        System.out.println("dice count: "+diceCount);
        return;
       }
   }
  
   else{
      player2Position = player2Position - snake;
      if(player2Position < 0)// if position is negative 
        player2Position = 0;
      }



  }
   
 }
} 
