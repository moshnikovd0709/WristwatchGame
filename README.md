# WristwatchGame
Implementation of the mathematical simulation of the game "wristwatch"
The rules of this game:
From one deck of cards (52 cards, 4 suits consisting of Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King)
you place cards face up in a ring of 12 cards. The 13th card is placed in the middle of the ring. If an Ace
was put on “place one” or a 2 on “place two” and so on (a King on “place 13”) you simply skip that
place on the next lap and continue to place cards on top of the cards not corresponding to their
positions.
Every time you have a new match you pick up the cards on that certain position and place them in
the bottom of your deck and leave the matched card on its position in the ring. You continue this
procedure until you either run out of cards or have all 13 positions matched.
You win if you have all 13 positions matched.

To start the simulation, you need to run Main class. To change the desired number of simulations you need to change the value of the constant "amountGames" in Main class.

Statistics for 1 billion games:
amount Total: 1000000000
amount Wins: 116832287
amount Lose: 883167713
rtp: 0.116832287
