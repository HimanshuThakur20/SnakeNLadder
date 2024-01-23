import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Main m1 = new Main();

        int position1=0;
        Player p1 = new Player(position1,"Player 1");
        Player p2 = new Player(position1,"Player 2");

        GameBoard g = new GameBoard();

        for(int i=0;;i++) {
            if (p1.currentPosition == 100 || p2.currentPosition == 100) {
                break;
            } else if (i % 2 == 0) {
                System.out.println("\nPlayer " + p1.playerName + " at play");
                m1.play(p1, g);
                System.out.println("Position of the player: "+ p1.currentPosition );

            } else {
                System.out.println("\nPlayer " + p2.playerName + " at play");
                m1.play(p2, g);
                System.out.println("Position of the player: "+ p2.currentPosition );

            }
        }

            if(p1.currentPosition==100){
                System.out.println("Player 1 won!! Die count is" + p1.dieCount);
            }
            else{
                System.out.println("Player 2 Won!! Die count is" + p2.dieCount);
            }


    }

    public int dieRoll(Player p){
        p.dieCount++;
        return (p.dieValue= (int) (Math.random()*10%6) +1);
    }

    public void play(Player p1, GameBoard g){
        Main m1 = new Main();
        Scanner sc = new Scanner(System.in);

            if(p1.currentPosition==0 ){
                System.out.println("\nPress Enter to roll the die...");
                sc.nextLine();
                m1.dieRoll(p1) ;
                if(p1.dieValue!=6) {
                    System.out.println("\nYou need to  get a 6 to start the game. \n");
                    return;
                }
            }
            if(p1.currentPosition==0 && p1.dieValue==6){
                System.out.println("\n\nGame started!! for player "+ p1.playerName+"\n");
                System.out.println("Position of the player: "+ p1.currentPosition );

                p1.currentPosition=0;
            }

                    System.out.println("\nPress Enter to roll the die...");
                    sc.nextLine();

                    m1.dieRoll(p1);

                    int updatePosition = p1.dieValue+p1.currentPosition;

                    if(g.ladders.contains(updatePosition)){
                        int index = g.ladders.indexOf(updatePosition);
                        p1.currentPosition = g.ladderLength.get(index);
                        System.out.println(p1);

                    } else if (g.snakes.contains(updatePosition)) {
                        int index = g.snakes.indexOf(updatePosition);
                        p1.currentPosition = g.snakesBites.get(index);
                        System.out.println(p1);
                    }
                    else {
                        if(updatePosition>100){
                            System.out.println("You should get exactly "+(100-p1.currentPosition)+" to win the game!");
                        }
                        else {
                            p1.currentPosition = updatePosition;
                            System.out.println(p1);
                        }
                    }
                    return;
    }
}
