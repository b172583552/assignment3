public class BigTwoCard extends Card{
    public BigTwoCard(int suit, int rank){
        super(suit, rank);
    }
    public int compareTo(Card card){
        int newRank;
        int cardRank;
        if (this.rank == 0){
            newRank = this.rank + 13;
        }
        else if (this.rank == 1){
            newRank = this.rank + 14;
        }
        else{
            newRank = this.rank;
        }

        if (card.rank == 0){
            cardRank = card.rank + 13;
        }
        else if (card.rank == 1){
            cardRank = card.rank + 14;
        }
        else{
            cardRank = card.rank;
        }


        if (newRank > cardRank) {
			return 1;
		} 
        else if (newRank < cardRank) {
			return -1;
		} 
        else if (this.suit > card.suit) {
			return 1;
		} 
        else if (this.suit < card.suit) {
			return -1;
		} 
        else {
			return 0;
		}
    }
}