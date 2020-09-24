public class Main{

 public static void main(String args[]){

  int position = 0;
  int winningPosition = 100;
  int possiblity = 0;
  int diceRoll = 0;
  int noPlay = 0;
  int ladder = 0;
  int snake = 0;
  // 0 for noPlay, 1 for ladder, 2 for snake
  while(position < 100){

   possiblity = (int)(Math.floor(Math.Random()*10))%3;
   diceRoll = 1 + (int)(Math.floor(Math.Random()*10))%6;
   noPlay = 0;
   ladder = diceRoll;
   snake = diceRoll;
  
  
  if(possiblity == 0) 
      postion = position;
  else if(possiblity == 1){
      position = position+ladder;
      if(position > 100)// position should exactly be 100 
         position = position - ladder;
   }
  else{
      position = position - snake;
      if(position < 0)// if position is negative 
        position = 0;
      }

  System.out.println("current position : "+ position); 
  }
  System.out.println("you won!! your position is "+ position);

 }
} 
