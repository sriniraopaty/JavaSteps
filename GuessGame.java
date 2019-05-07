public class GuessGame{

Player p1;
Player p2;
Player p3;

public void startGame()
{
p1 = new Player();
p2 = new Player();
p3 = new Player();

int guessp1 = 0;
int guessp2 = 0;
int guessp3 = 0;

boolean p1isright = false;
boolean p2isright = false;
boolean p3isright = false;

int targetName = (int) (Math.random() * 10);
System.out.println("I am thinking of number between 0 to 9");

while(true)
{
System.out.println("Numberr to guess " +targetName);

p1.guess();
p2.guess();
p3.guess();

guessp1 = p1.number;
System.out.println("player 1 guessed number " +guessp1);
guessp2 = p2.number;
System.out.println("player 2 guessed number " +guessp2);
guessp3 = p3.number;
System.out.println("player 3 guessed number " +guessp3);

if(guessp1 == targetName)
{
p1isright = true ;
}
if(guessp2 == targetName)
{
p2isright = true ;
}
if(guessp3 == targetName)
{
p3isright = true ;
}

if(p1isright || p2isright || p3isright)
{
System.out.println("We have a winner");
System.out.println("player 1 guess " +p1isright);
System.out.println("player 2 guess " +p2isright);
System.out.println("player 3 guess " +p3isright);
System.out.println("Game over");
}
else{
System.out.println("Players will have to try again");}
}
}
}