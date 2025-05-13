public static int maxDrinks(int numCoconuts, int numEmptyShells) {
    
    int totalExchangedCoconuts = 0;
    int numFullCoconuts = numCoconuts;

    while (numFullCoconuts / numEmptyShells != 0){
        int div = numFullCoconuts / numEmptyShells;
        int rem = numFullCoconuts % numEmptyShells;
        totalExchangedCoconuts += div;
        numFullCoconuts = div + rem;
    }

    return numCoconuts + totalExchangedCoconuts;
}
