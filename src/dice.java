class dice {
    int currentValue = 0;

    void Dice() {
        currentValue = 0;
    }

    int doTheThing() {
        //make a random value from 1-6
        currentValue = (int) ((Math.random() * 6) + 1);
        //return value
        return currentValue;
    }
}
