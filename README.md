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
1) `flip` method
```java
public static String flip() {
    double rand = Math.random();
    if (rand < 0.25) return "heads";
    else return "tails";
}
```
2) `arePermutations` method

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

3) If the initial contents of `values` array is `{1, 2, 3, 4}` to change the contents of `values` to `{4, 3, 2, 1}`:  
Random numbers: `{0, 1, 1, 0}`

###Activity 5
1)

###Activity 6
1) All possible plays for the board `5♠ 4♥ 2♦ 6♣ A♠ J♥ K♦ 5♣ 2♠` are:  
```
5♠ 6♣
5♣ 6♣
```
2) True. If the deck is empty, the remaining cards on the table must be able to form a pair/grouping. Any removable combination of 3 cards must be `J Q K`  
3) There is no strategy. The order doesn't matter because every card can only be used in one way. For example, the following is on the table:

```
3 8 7 9
2 A A 2
```
If one removes the `3` and `8` their options regarding other plays (`9 and 2`) will not change.  
If instead one were to remove the `9` and either `2` their options regarding `3` and `8` would not change. Additionally, both `2`s will affect possibilites equally as each is a single space into which the next card will be placed.

###Activity 7

c. The returned list will be

`0|1|3|6|7`

d. `printCards` method

```java
public static printCards(ElevensBoard board) {
    List<Integer> cIndexes = board.cardIndexes();
    for (int i : cIndexes) {
        System.out.println(board.cardAt(i));
    }
}
```

e. `removeSelectedCards` needs to call `cardIndexes` before `containsPairSum11` and `containsJQK`.

###Activity 8
1) Each of the Elevens based games all involve cards that must sum to a certain point value, or must fulfill another specific requirement (e.g. a Jack Queen King pair in Elevens).  The games differ in the number of piles for the game, as well as the point values assigned to the different cards.

2) `Board` instance variables are initialized with the `ElevensBoard` values by writing

```java
Board myBoard = new ElevensBoard();
```

3) Abstract methods in `Board.java`:

`public abstract boolean isLegal`
`public abstract boolean anotherPlayIsPossible`

The way the methods above are implemented in ElevensBoard should be sufficient in covering differences between the Elevens derivative games.



###Activity 9
1) `size` is not an abstract method because it is an accessor to a private variable of the abstract class `Board` which is a the method by which a subclass accesses `cards` array  
2) There is no abstract method to deal with the selection of cards being removed or replaced because which cards are selected is determined in an instance of `ElevensGUIRunner` (the GUI) and the selections are passed to the abstract class `isLegal` in `Board` to determine legality. In other words, the GUI must determine which cards are selected and explicitly indicate to the `Board` to replace those cards if necessary.  
3) Using an interface `Board` rather than an abstract class `Board` would still allow calls to `isLegal` and `anotherPlayIsPossible` however the design would not work as well as the current implementation as the using an abstract class `Board` allows every variation of the game (11s, 13s, etc) to use the same code in `Board` class to replace cards, determine if a game is won, and replace cards as these actions don't change depending on the game.

###Activity 10
*

###Activity 11
*
