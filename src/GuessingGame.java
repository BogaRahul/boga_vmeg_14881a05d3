class GuessingGame {
    public int answer;
    public int min;
    public int max;

    public GuessingGame(int min, int max) {
        min = min;
        max = max;
    }

    public int guess() {
        
        return (min+max)/2;
    }

    public void lower() {
       min = (min+max)/2;
    }

    public void higher() {
        max = (min+max)/2;
    }
}
