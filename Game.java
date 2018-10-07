//Opretter klassen Game
public class Game {
   
   //Viser Java at det er mit main program
   public static void main(String[]args){
   
      //Opretter to objekter
      Snake snake = new Snake();
      Rabbit rabbit = new Rabbit();
   
      //Opretter variablen spist
      boolean spist = false;
      
      //Opretter en while funktion som kører så længe spist er false
      while(spist == false){
         rabbit.move();          //Kalder metoden move som får kaninen til at flytte sig
         rabbit.lookOut(snake);  //Kalder metoden lookOut som får kaninen til at kigge efter slangen 
         snake.move();
         rabbit.lookOut(snake);
      
         //Kalder metoden iEatYou som returnerer en false-værdi 
         //når dyrene står på samme koordinat, og på den måde kommer vi ud af while loopet
         spist = snake.iEatYou(rabbit);
      }
   }
 
}

