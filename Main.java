public class Main{

 public static void main(String args[]){

  int position = 0;
  // 0 for noPlay, 1 for ladder, 2 for snake or options
  int possiblity = (Math.Random()*10)%3;
  int diceRoll = 1 + (int)(Math.Random()*10)%6;
  int noPlay = 0;
  int ladder = diceRoll;
  int snake = diceRoll;
 
  if(possiblity == 0) 
      postion = position;
  else if(possiblity == 1)
      position = position+ladder;
  else
      position = position - snake;

  System.out.println("current position : "+ position); 
  

 }
} 
