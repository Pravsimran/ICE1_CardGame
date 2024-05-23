public class CardTrick {
    private Card[] hand = new Card[7];
    private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

    public CardTrick() {
        for (int i = 0; i < 7; i++) {
            int cardNumber = (int) (Math.random() * 13) + 1;
            String suit = suits[(int) (Math.random() * 4)];
            hand[i] = new Card(cardNumber, suit);
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card (any card): ");
        int cardNumber = scanner.nextInt();
        String suit = scanner.next();

        boolean found = false;
        for (Card card : hand) {
            if (card.getNumber() == cardNumber && card.getSuit().equals(suit)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations, your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }

    public static void main(String[] args) {
        CardTrick cardTrick = new CardTrick();
        cardTrick.play();
    }
}
