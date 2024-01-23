import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Main m1 = new Main();

        int position1=0;
        Player p1 = new Player(position1);
        GameBoard g = new GameBoard();

//        position1 += p1.dieValue;
//        p1.currentPosition=position1;
        System.out.println("Position of the player 1: "+ p1.currentPosition );

        System.out.println("\nPress Enter to roll the die...");
        sc.nextLine();

        m1.dieRoll(p1) ;
        while(p1.currentPosition==0){

            if(p1.currentPosition==0 && p1.dieValue==6){
                System.out.println("game started!!\n\n");
                p1.currentPosition=0;

                while (p1.currentPosition!=100) {

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
                            continue;
                        }
                        else {
                            p1.currentPosition = updatePosition;
                            System.out.println(p1);
                        }
                    }
                }
                if(p1.currentPosition==100){
                    System.out.println("You won!!");
                }


            }
            else {
                System.out.println("\nPress Enter to roll the die and get a 6 to start the game.");
                sc.nextLine();
                m1.dieRoll(p1) ;
            }
        }


    }

    public int dieRoll(Player p){
        return (p.dieValue= (int) (Math.random()*10%6) +1);
    }
}
