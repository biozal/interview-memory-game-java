# Concentration Game Simulator

## Introduction

The goal of this exercise is to create code to simulate the game of Memory (Concentration). You can find information
about this game on [Wikipedia](https://en.wikipedia.org/wiki/Concentration_(card_game)).

In the game of concentration, the player is given a grid of cards all turned over, so they can’t see the value. The
player flips over two cards at a time, looking to see if they are the same. They are removed from the playing area if
they are the same card. If they do not match, both cards are turned back over, and they can pick two different cards.
The goal is to remove all the cards from the playing area. The game’s goal is to find all the matching cards in the
fewest tries.

The simulation you will build will work on these principles of the game but will use a grid with numbers assigned
instead of cards.

## Requirements

The program will have no interaction with the user; instead will use predefined data to check if, given the data
provided, the game has the correct score. The program will have the following requirements:

- It must be written in Java
- It must use JDK 11.0 or higher
- It must be checked into a GitHub repository
- It must use Java programming best practices
- It must take in the game data to run the simulation in JSON format from Couchbase Capella
- It must calculate if the game score is correct based on the game data provided.
    - The program should first calculate if the board data is correct and there are matching pairs of letters provided.
      If the board data is incorrect, the program will print out a message stating "The board data is incorrect"
    - Next the program should calculate if the total score is correct based on the guesses data provided.
        - If the game data is correct, the program will print out a message stating "The game data is correct".
        - If the game data is incorrect the program will print out a message stating "The game data is incorrect."
    - If some data is missing, the program will print out a message stating "Error in game data"
    - If the program fails for any other reason, it should print out a message "The program has run into an error"

## Provided Game Data

Our game will allow a grid of numbers of unlimited size, but it must be an even number (need pairs). These numbers will
represent the back of the playing cards. A letter starting with Z must be assigned to two random numbers in the grid.
The letters need to go up in value until all the numbers in the grid have an assigned letter. If you run out of letters
in the alphabet, you add the same letter and move up the alphabet again { ZZ, YY, XX … AA, ZZZ, YYY, XXX … AAA … }

Grid Example:
1
2
3
4
5
6
7
8
9
10
11
12

Answer Assignment Example:
W
Y
U
Z
U
V
V
W
X
X
Y
Z

In our example, the letters are assigned to the following numbers:

U = 3, 5
V = 6, 7
W = 1, 8
X = 9, 10
Y = 2, 11
Z = 4, 12

The player would be able to make two guesses at a time revealing which letters are behind the numbers. If the letters
differ, the total score will go up by 7 points. If the letters match, they are removed from the game, and -1 points
reduce the score. When all letters have been matched, the game is over. The goal is to get the lowest score possible.

The data will be provided in a JSON document. The document will have the following structure, although the data will be different (along with the board size):

```json
{
  "board": [
    "W",
    "Y",
    "U",
    "Z",
    "U",
    "V",
    "V",
    "W",
    "X",
    "X",
    "Y",
    "Z"
  ],
  "guesses": [
    {
      "guess": [
        "1",
        "2"
      ],
      "score": 7
    },
    {
      "guess": [
        "3",
        "4"
      ],
      "score": 14
    },
    {
      "guess": [
        "5",
        "3"
      ],
      "score": 13
    },
    {
      "guess": [
        "6",
        "7"
      ],
      "score": 12
    },
    {
      "guess": [
        "8",
        "1"
      ],
      "score": 11
    },
    {
      "guess": [
        "9",
        "10"
      ],
      "score": 10
    },
    {
      "guess": [
        "11",
        "12"
      ],
      "score": 17
    },
    {
      "guess": [
        "11",
        "2"
      ],
      "score": 16
    },
    {
      "guess": [
        "4",
        "12"
      ],
      "score": 15
    }
  ]
}
```

The sample data is provided in the same directory as the code.  It should be read into the program from the disk and serialized into POJO GameData and Guess, which are provided in the sample repository. 

The file names are:
 - sample-data1.json
 - sample-data2.json
 - sample-data3.json

The GameRepositoryFileImp class should be used for reading in the data from the disk and returning the POJO **ONLY**.  You are free to make as many other classes and interfaces as required to break your code into logical units to be able to test and run the program.  

## Testing
Unit and Integration tests should be provided in the test folder to test your code.


## JSON Serialization


It's recommended, but not required to use Google's GSON library for JSON Serialization.  The repo for this can be found at:

[https://github.com/google/gson](https://github.com/google/gson)

The repo readme file provides links to user guides, API documentation, and tutorials.


Change Log
==========
Version 1.  Initial check-in of code, examples, and readme.