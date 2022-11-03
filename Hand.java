public abstract class Hand extends CardList{
   private final CardGamePlayer player;

   public Hand(CardGamePlayer player, CardList cards){
      this.player = player;
      for (int i = 0 ; i < cards.size(); i++){
         this.player.addCard(cards.getCard(i));
      }
      this.sort();
   }

   public CardGamePlayer getPlayer(){
      return this.player;
   }

   public Card getTopCard(){
      //for card number < 5
      if (!this.isEmpty()){
         this.sort();
         return this.getCard(this.size() - 1);
      }
      else {
         return null;
      } 
   }

   public boolean beats(Hand hand){
      if (hand == null || !hand.isValid() || !this.isValid() || !(this.getType() == hand.getType())){
         return false;
      } else{
         return this.getTopCard().compareTo(hand.getTopCard()) > 0;
      }

   }

   public abstract boolean isValid();
   public abstract String getType();
}
