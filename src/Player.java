public class Player {
    String playerName;
    Integer currentPosition;
    Integer dieValue;
    Integer dieCount;

    Player(int position,String name){

        this.currentPosition=position;
        this.playerName=name;
        this.dieCount=0;
    }

    @Override
    public String toString() {
        return "\nPlayer " +
                "playerName='" + playerName  +
                ", currentPosition=" + currentPosition +
                '\n';
    }
}
