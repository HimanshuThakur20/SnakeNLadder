public class Player {
    Integer currentPosition;
    Integer dieValue;

    Player(int position){

        this.currentPosition=position;
    }

    @Override
    public String toString() {
        return "Player 1 " +
                "currentPosition=" + currentPosition +
                '\n';
    }
}
