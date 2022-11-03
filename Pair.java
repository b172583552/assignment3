public class Pair extends Hand{
    public Pair(CardGamePlayer player, CardList cards){
        super(player, cards);        
    }

    public String getType() {
        return "Pair";
    }

    public boolean isValid() {
        if (this.size() != 2){
            return false;
        }
        else {
            BigTwoCard card0 = (BigTwoCard) this.getCard(0);
            BigTwoCard card1 = (BigTwoCard) this.getCard(1);
            if (card0.rank != card1.rank){
                return false;
            }
            else {
                return true;
            }
        }
    }
}
