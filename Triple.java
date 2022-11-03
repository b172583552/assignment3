public class Triple extends Hand {
    public Triple(CardGamePlayer player, CardList cards){
        super(player, cards);        
    }

    public String getType() {
        return "Triple";
    }

    public boolean isValid() {
        if (this.size() != 3){
            return false;
        }
        else {
            BigTwoCard card0 = (BigTwoCard) this.getCard(0);
            BigTwoCard card1 = (BigTwoCard) this.getCard(1);
            BigTwoCard card2 = (BigTwoCard) this.getCard(2);
            if (card0.rank != card1.rank || card0.rank != card2.rank){
                return false;
            }
            else {
                return true;
            }
        }
    }
}