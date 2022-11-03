public class Single extends Hand{
    public Single(CardGamePlayer player, CardList cards){
        super(player, cards);        
    }

    public String getType() {
        return "Single";
    }

    public boolean isValid() {
        if (this.size() != 1){
            return false;
        }
        else {
            return true;
        }
    }
    
}
