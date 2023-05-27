package SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    Board(int boardSize, int numberOfSnakes, int numberOfLadders){
        initializeCells(boardSize);
        addSnakesAndLadders(cells, numberOfLadders, numberOfSnakes);
    }

    private void initializeCells(int boardSize){
        cells = new Cell[boardSize][boardSize];

        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }

    private void addSnakesAndLadders(Cell[][] cells, int numberOfLadders, int numberOfSnakes){
        while(numberOfSnakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length  - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length  - 1);

            if(snakeTail >= snakeHead){
                continue;
            }

            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;
            numberOfSnakes -= 1;
        }
        
        while(numberOfLadders > 0){
            int ladderHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length  - 1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length  - 1);

            if(ladderHead <= ladderTail){
                continue;
            }

            Jump ladderObj = new Jump();
            ladderObj.start = ladderHead;
            ladderObj.end = ladderTail;

            Cell cell = getCell(ladderHead);
            cell.jump = ladderObj;
            numberOfLadders -= 1;
        }
    }

    Cell getCell(int playerPosition){
        int boardRow = playerPosition/cells.length;
        int boardCol = playerPosition/cells.length;

        return cells[boardRow][boardCol];
    }
}
