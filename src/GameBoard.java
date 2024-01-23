import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameBoard {
    ArrayList<Integer> snakes=new ArrayList<>();
    ArrayList<Integer> ladders=new ArrayList<>();
    ArrayList<Integer> snakesBites=new ArrayList<>();
    ArrayList<Integer> ladderLength=new ArrayList<>();


    GameBoard(){
        List<Integer> ladderValues= Arrays.asList(1,4,9,21,28,51,72,80);
        this.ladders.addAll(ladderValues);
        List<Integer> snakeValues= Arrays.asList(17,54,62,64,87,93,95,98);
        this.snakes.addAll(snakeValues);

        List<Integer> snakeBiteValues= Arrays.asList(7,34,19,60,36,73,75,79);
        this.snakesBites.addAll(snakeBiteValues);
        List<Integer> ladderLengthValues= Arrays.asList(38,14,31,42,84,67,91,99);
        this.ladderLength.addAll(ladderLengthValues);


    }
}
