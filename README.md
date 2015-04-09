# 11-s-Lab

##Questions

###Activity 2
1) A deck is a class which contains cards in a specific order  
2) 6 cards  
3) To play the game "21" the following is required:  
```java
ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
suits = {"spades", "hearts", "diamonds", "clubs"};
pointValues = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11 };
Deck d = new Deck(ranks, suits, pointValues);
```
4) The order of elements in *rank* and *pointValues* matter in that they must be of the same arbitrary order as eachother. The order of elements in *suits* do not matter.

###Activity 3
1) ```flip``` method
```java
public static String flip() {
    double rand = Math.random();
    if (rand < 0.25) return "heads";
    else return "tails";
}
```
2) ```arePermutations``` method

```java
public static boolean arePermutations(int[] array1, int[] array2) {
    if (array1.length != array2.length) return false; //checks lengths
    int sum1 = 0;
    for (int a : array1) {
        sum1 += a;
    }
    int sum2 = 0;
    for (int b : array2) {
        sum2 += b;
    }
    if (sum1 != sum2) return false; //checks sums

    for (int a : array1) {
        boolean isInB = false;
        for (int b : array2) {
            if (a == b) isInB = true;
            break
        }
        if !isInB return false; //checks individual values
    }
    return true;
}
```

3) If the initial contents of ```values``` array is ```{1, 2, 3, 4}``` to change the contents of ```values``` to ```{4, 3, 2, 1}```:  
Random numbers: ```{0, 1, 1, 0}```

###Activity 5
1) 

###Activity 6
1) All possible plays for the board ```5♠ 4♥ 2♦ 6♣ A♠ J♥ K♦ 5♣ 2♠``` are:  
```
5♠ 6♣
5♣ 6♣
```
2) True. If the deck is empty, the remaining cards on the table must be able to form a pair/grouping. Any removable combination of 3 cards must be ```J Q K```  
3) There is no strategy. EXPLAIN WHY DOESN'T MATTER ORDER

###Activity 7
*

###Activity 8
*

###Activity 9
*

###Activity 10
*

###Activity 11
*
