package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Deque < Player > players;
    Board gameBoard;

    public void initializeGame(){
        players = new LinkedList<>();

        PlayingPeiceX crossPeice = new PlayingPeiceX();
        Player player1 = new Player("Shakti", crossPeice);

        PlayingPieceO noPiece = new PlayingPieceO();
        Player player2 = new Player("Krishna", noPiece);
        
        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;

        Scanner sc = new Scanner(System.in);

        while(noWinner){
            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();

            List< Pair < Integer, Integer >> freeCells = gameBoard.getFreeCells();

            if(freeCells.isEmpty()){
                noWinner = false;
                continue;
            }

            System.err.println("Player : " + playerTurn.name + " Enter col, row : ");

            String st = sc.nextLine();
            String[] values = st.split(",");
            
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);
            
            boolean pieceAddSuccess = gameBoard.addPlayingPiece(inputRow, inputCol, playerTurn.playingPiece);

            if(!pieceAddSuccess){
                System.out.println("Incorrect Position, try again.");
                players.addFirst(playerTurn);
                continue;
            }

            players.addLast(playerTurn);
            boolean winner = isThereWinner(inputRow, inputCol, playerTurn.playingPiece.pieceType);
            
            if(winner){
                gameBoard.printBoard();
                return playerTurn.name;
            }
        }
        sc.close();
        return "Game Tied : No Winner";
    }

    public boolean isThereWinner(int row, int col, PieceType pieceType){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagMatch = true;
        boolean antiDiagMatch = true;

        for(int i = 0; i < gameBoard.size; i++){
            System.out.println(gameBoard.board[row][i]);
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType){
                rowMatch = false;
                break;
            }
        }
        
        for(int i = 0; i < gameBoard.size; i++){
            if(gameBoard.board[i][col] == null || gameBoard.board[i][col].pieceType != pieceType){
                colMatch = false;
                break;
            }
        }
        
        for(int i = 0, j = 0; i < gameBoard.size && j < gameBoard.size; i++, j++){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType){
                diagMatch = false;
                break;
            }
        }

        for(int i = gameBoard.size - 1, j = 0; i >= 0 && j < gameBoard.size; i--, j++){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType){
                antiDiagMatch = false;
                break;
            }
        }
        return rowMatch || colMatch || diagMatch || antiDiagMatch;
    }
}
