package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == 'X' && monoVertical(board, i) || (board[i][0] == 'X' && monoHorizontal(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean monoHorizontal(char[][] board, int index) {
        boolean result = true;
        char first = board[index][0];
        for (int i = 1; i < board[index].length; i++) {
            if (first != board[index][i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int index) {
        boolean result = true;
        char first = board[0][index];
        for (int i = 1; i < board.length; i++) {
            if (first != board[i][index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}