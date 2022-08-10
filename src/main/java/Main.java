public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setBoard("secondBoard.json");
        Solution solution = new Solution();
        System.out.println(solution.isValidSudoku(board.getBoard()));

    }
}
