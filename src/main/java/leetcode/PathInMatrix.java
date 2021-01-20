package leetcode;

/**
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，
 * 每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 * 例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 *
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 *
 * 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
 *
 *RobotSRangeOfMotion
 *
 * 示例 1：
 *
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * 输出：true
 *
 * 示例 2：
 *
 * 输入：board = [["a","b"],["c","d"]], word = "abcd"
 * 输出：false
 *
 *[["C","A","A"],["A","A","A"],["B","C","D"]]
 * "AAB"
 * @author : xiongyanjun  Date: 2021/1/20 ProjectName: settleprovisions Version: 1.0
 */
public class PathInMatrix {
    public static void main(String[] args) {
        PathInMatrix pathInMatrix = new PathInMatrix();
        boolean b = pathInMatrix.exist(new char[][]{
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'}
        }, "AAB");
        System.out.printf(b+"");
    }

    char[][] board;
    String word;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        for (int col = 0; col < board[0].length; col++) {
            for (int row = 0; row < board.length; row++) {
                boolean b = findAStartingPath(col, row, 0);
                if (b){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean findAStartingPath(int col, int row, int index) {
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length
                || word.charAt(index) != board[row][col]){
            return false;
        }
        char temp = board[row][col];
        board[row][col] = 1;
        if (index == word.length()-1){
            return true;
        }
        boolean a = findAStartingPath(col - 1, row, index + 1)
                ||findAStartingPath(col + 1, row, index + 1)
                ||findAStartingPath(col , row - 1, index + 1)
                ||findAStartingPath(col , row + 1, index + 1);
        board[row][col] = temp;
        return a;
    }

}
