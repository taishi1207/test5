public class Choki implements Hand{
    private String HAND_NAME = "チョキ";

    public int compare(Hand hand) {
        return 0;
    }

    public String getHandName() {
        return this.HAND_NAME;
    }
}