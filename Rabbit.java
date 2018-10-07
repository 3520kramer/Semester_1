//Importerer Random fra Java-biblioteket
import java.util.Random;

//Opretter klassen Snake
public class Rabbit {

   //Opretter attributter for klassen
   public static int x;
   public static int y;
   
   //Opretter et objekt af Random med identifier xy
   Random xy = new Random();
   
   //Opretter en kontruktør for Rabbit
   public Rabbit(){
      x = xy.nextInt(10)+1;//Vi bruger metoden nextInt fra Random objektet for at generere det næste pseudotilfældige tal
      y = xy.nextInt(10)+1;//Vi bruger +1 for at sørge for at nextInt bruger tal fra 1-10 i stedet for 0-9 
   }
   
     //Opretter en metode som gør det muligt for dyrene at rykke i en 8 retninger tilfældigt.
     public void move(){
      
      Random random = new Random(); //Opretter et Random objekt
      int oldX = this.x;            //Opretter to nye variabler for x og y 
      int oldY = this.y;
      boolean outOfBounds = true;   //Opretter en variabel for at sørge for at spillet
      while(outOfBounds){           //Opretter et while loop som kører så længe outOfBounds er true
         switch(random.nextInt(8)){ //Opretter en Switch som indeholder de 8 retninger som slangen og kaninen kan rykke
            case 0 : this.y += 1;   
               break;
               
            case 1 : this.y += 1;
               this.x += 1;
               break;
               
            case 2 : this.x += 1;
               break;
            case 3 : this.x += 1;
               this.y -= 1;
               break;
               
            case 4 : this.y -= 1;
               break;
               
            case 5 : this.y -= 1;
               this.x -= 1;
               break;
               
            case 6 : this.y -= 1;
               break;
               
            case 7 : this.y -= 1;
               this.x += 1;
               break;
         }
      
         //Opretter en if/else sætningen som sørger for at dyrene ikke rykker ud over koordinatsystemet
         if(this.x <= 10 && this.y <= 10 && this.x >= 1 && this.y >= 1){
            System.out.println("Jeg er den søde kanin  og jeg står på " + this.x + "," + this.y);
            outOfBounds = false;
         }else{
            this.x = oldX;
            this.y = oldY;
         }
      
      }
   }
   //Opretter en metode som skal bruges når slangen spiser kaninen
   public void lookOut(Snake snake){
      if((this.x - snake.x) == 1 || (this.y - snake.y) == 1){
         System.out.println("Ååååååh nej");
      } 
      
   }

}