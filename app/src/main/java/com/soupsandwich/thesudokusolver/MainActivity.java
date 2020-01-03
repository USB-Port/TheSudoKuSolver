package com.soupsandwich.thesudokusolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btns[][] = new Button[9][9];

    private int board[][] = new int[9][9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btns[0][0] = findViewById(R.id.cell_0_0);
        btns[0][1] = findViewById(R.id.cell_0_1);
        btns[0][2] = findViewById(R.id.cell_0_2);
        btns[0][3] = findViewById(R.id.cell_0_3);
        btns[0][4] = findViewById(R.id.cell_0_4);
        btns[0][5] = findViewById(R.id.cell_0_5);
        btns[0][6] = findViewById(R.id.cell_0_6);
        btns[0][7] = findViewById(R.id.cell_0_7);
        btns[0][8] = findViewById(R.id.cell_0_8);

        btns[1][0] = findViewById(R.id.cell_1_0);
        btns[1][1] = findViewById(R.id.cell_1_1);
        btns[1][2] = findViewById(R.id.cell_1_2);
        btns[1][3] = findViewById(R.id.cell_1_3);
        btns[1][4] = findViewById(R.id.cell_1_4);
        btns[1][5] = findViewById(R.id.cell_1_5);
        btns[1][6] = findViewById(R.id.cell_1_6);
        btns[1][7] = findViewById(R.id.cell_1_7);
        btns[1][8] = findViewById(R.id.cell_1_8);

        btns[2][0] = findViewById(R.id.cell_2_0);
        btns[2][1] = findViewById(R.id.cell_2_1);
        btns[2][2] = findViewById(R.id.cell_2_2);
        btns[2][3] = findViewById(R.id.cell_2_3);
        btns[2][4] = findViewById(R.id.cell_2_4);
        btns[2][5] = findViewById(R.id.cell_2_5);
        btns[2][6] = findViewById(R.id.cell_2_6);
        btns[2][7] = findViewById(R.id.cell_2_7);
        btns[2][8] = findViewById(R.id.cell_2_8);

        btns[3][0] = findViewById(R.id.cell_3_0);
        btns[3][1] = findViewById(R.id.cell_3_1);
        btns[3][2] = findViewById(R.id.cell_3_2);
        btns[3][3] = findViewById(R.id.cell_3_3);
        btns[3][4] = findViewById(R.id.cell_3_4);
        btns[3][5] = findViewById(R.id.cell_3_5);
        btns[3][6] = findViewById(R.id.cell_3_6);
        btns[3][7] = findViewById(R.id.cell_3_7);
        btns[3][8] = findViewById(R.id.cell_3_8);

        btns[4][0] = findViewById(R.id.cell_4_0);
        btns[4][1] = findViewById(R.id.cell_4_1);
        btns[4][2] = findViewById(R.id.cell_4_2);
        btns[4][3] = findViewById(R.id.cell_4_3);
        btns[4][4] = findViewById(R.id.cell_4_4);
        btns[4][5] = findViewById(R.id.cell_4_5);
        btns[4][6] = findViewById(R.id.cell_4_6);
        btns[4][7] = findViewById(R.id.cell_4_7);
        btns[4][8] = findViewById(R.id.cell_4_8);

        btns[5][0] = findViewById(R.id.cell_5_0);
        btns[5][1] = findViewById(R.id.cell_5_1);
        btns[5][2] = findViewById(R.id.cell_5_2);
        btns[5][3] = findViewById(R.id.cell_5_3);
        btns[5][4] = findViewById(R.id.cell_5_4);
        btns[5][5] = findViewById(R.id.cell_5_5);
        btns[5][6] = findViewById(R.id.cell_5_6);
        btns[5][7] = findViewById(R.id.cell_5_7);
        btns[5][8] = findViewById(R.id.cell_5_8);

        btns[6][0] = findViewById(R.id.cell_6_0);
        btns[6][1] = findViewById(R.id.cell_6_1);
        btns[6][2] = findViewById(R.id.cell_6_2);
        btns[6][3] = findViewById(R.id.cell_6_3);
        btns[6][4] = findViewById(R.id.cell_6_4);
        btns[6][5] = findViewById(R.id.cell_6_5);
        btns[6][6] = findViewById(R.id.cell_6_6);
        btns[6][7] = findViewById(R.id.cell_6_7);
        btns[6][8] = findViewById(R.id.cell_6_8);

        btns[7][0] = findViewById(R.id.cell_7_0);
        btns[7][1] = findViewById(R.id.cell_7_1);
        btns[7][2] = findViewById(R.id.cell_7_2);
        btns[7][3] = findViewById(R.id.cell_7_3);
        btns[7][4] = findViewById(R.id.cell_7_4);
        btns[7][5] = findViewById(R.id.cell_7_5);
        btns[7][6] = findViewById(R.id.cell_7_6);
        btns[7][7] = findViewById(R.id.cell_7_7);
        btns[7][8] = findViewById(R.id.cell_7_8);

        btns[8][0] = findViewById(R.id.cell_8_0);
        btns[8][1] = findViewById(R.id.cell_8_1);
        btns[8][2] = findViewById(R.id.cell_8_2);
        btns[8][3] = findViewById(R.id.cell_8_3);
        btns[8][4] = findViewById(R.id.cell_8_4);
        btns[8][5] = findViewById(R.id.cell_8_5);
        btns[8][6] = findViewById(R.id.cell_8_6);
        btns[8][7] = findViewById(R.id.cell_8_7);
        btns[8][8] = findViewById(R.id.cell_8_8);

        initialBoard();
        setBtnText();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                btns[i][j].setOnClickListener(this);
            }
        }

        Button solveBtn = findViewById(R.id.solveBtn);
        solveBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                solve(0,0);
                CharSequence text;
                if (isSolved()) {
                    text = "Solved!";
                }
                else {
                    text = "Failed to solve";
                }
                Toast.makeText(getApplicationContext(),text,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View v) {
        if(v==btns[0][0]) {
            incrementCell(0,0);
            btns[0][0].setText(Integer.toString(board[0][0]));
        } else if(v==btns[0][1]) {
            incrementCell(0,1);
            btns[0][1].setText(Integer.toString(board[0][1]));
        } else if (v==btns[0][2]) {
            incrementCell(0,2);
            btns[0][2].setText(Integer.toString(board[0][2]));
        } else if (v==btns[0][3]) {
            incrementCell(0,3);
            btns[0][3].setText(Integer.toString(board[0][3]));
        } else if(v==btns[0][4]) {
            incrementCell(0,4);
            btns[0][4].setText(Integer.toString(board[0][4]));
        } else if (v==btns[0][5]) {
            incrementCell(0,5);
            btns[0][5].setText(Integer.toString(board[0][5]));
        } else if (v==btns[0][6]) {
            incrementCell(0,6);
            btns[0][6].setText(Integer.toString(board[0][6]));
        } else if(v==btns[0][7]) {
            incrementCell(0,7);
            btns[0][7].setText(Integer.toString(board[0][7]));
        } else if (v==btns[0][8]) {
            incrementCell(0,8);
            btns[0][8].setText(Integer.toString(board[0][8]));
        }


        else if(v==btns[1][0]) {
            incrementCell(1,0);
            btns[1][0].setText(Integer.toString(board[1][0]));
        } else if (v==btns[1][1]) {
            incrementCell(1,1);
            btns[1][1].setText(Integer.toString(board[1][1]));
        } else if (v==btns[1][2]) {
            incrementCell(1,2);
            btns[1][2].setText(Integer.toString(board[1][2]));
        } else if(v==btns[1][3]) {
            incrementCell(1,3);
            btns[1][3].setText(Integer.toString(board[1][3]));
        } else if (v==btns[1][4]) {
            incrementCell(1,4);
            btns[1][4].setText(Integer.toString(board[1][4]));
        } else if (v==btns[1][5]) {
            incrementCell(1,5);
            btns[1][5].setText(Integer.toString(board[1][5]));
        } else if(v==btns[1][6]) {
            incrementCell(1,6);
            btns[1][6].setText(Integer.toString(board[1][6]));
        } else if (v==btns[1][7]) {
            incrementCell(1,7);
            btns[1][7].setText(Integer.toString(board[1][7]));
        } else if (v==btns[1][8]) {
            incrementCell(1,8);
            btns[1][8].setText(Integer.toString(board[1][8]));
        }

        else if(v==btns[2][0]) {
            incrementCell(2,0);
            btns[2][0].setText(Integer.toString(board[2][0]));
        } else if (v==btns[2][1]) {
            incrementCell(2,1);
            btns[2][1].setText(Integer.toString(board[2][1]));
        } else if (v==btns[2][2]) {
            incrementCell(2,2);
            btns[2][2].setText(Integer.toString(board[2][2]));
        } else if(v==btns[2][3]) {
            incrementCell(2,3);
            btns[2][3].setText(Integer.toString(board[2][3]));
        } else if (v==btns[2][4]) {
            incrementCell(2,4);
            btns[2][4].setText(Integer.toString(board[2][4]));
        } else if (v==btns[2][5]) {
            incrementCell(2,5);
            btns[2][5].setText(Integer.toString(board[2][5]));
        } else if(v==btns[2][6]) {
            incrementCell(2,6);
            btns[2][6].setText(Integer.toString(board[2][6]));
        } else if (v==btns[2][7]) {
            incrementCell(2,7);
            btns[2][7].setText(Integer.toString(board[2][7]));
        } else if (v==btns[2][8]) {
            incrementCell(2,8);
            btns[2][8].setText(Integer.toString(board[2][8]));
        }

        else if(v==btns[3][0]) {
            incrementCell(3,0);
            btns[3][0].setText(Integer.toString(board[3][0]));
        } else if (v==btns[3][1]) {
            incrementCell(3,1);
            btns[3][1].setText(Integer.toString(board[3][1]));
        } else if (v==btns[3][2]) {
            incrementCell(3,2);
            btns[3][2].setText(Integer.toString(board[3][2]));
        } else if(v==btns[3][3]) {
            incrementCell(3,3);
            btns[3][3].setText(Integer.toString(board[3][3]));
        } else if (v==btns[3][4]) {
            incrementCell(3,4);
            btns[3][4].setText(Integer.toString(board[3][4]));
        } else if (v==btns[3][5]) {
            incrementCell(3,5);
            btns[3][5].setText(Integer.toString(board[3][5]));
        } else if(v==btns[3][6]) {
            incrementCell(3,6);
            btns[3][6].setText(Integer.toString(board[3][6]));
        } else if (v==btns[3][7]) {
            incrementCell(3,7);
            btns[3][7].setText(Integer.toString(board[3][7]));
        } else if (v==btns[3][8]) {
            incrementCell(3,8);
            btns[3][8].setText(Integer.toString(board[3][8]));
        }

        else if(v==btns[4][0]) {
            incrementCell(4,0);
            btns[4][0].setText(Integer.toString(board[4][0]));
        } else if (v==btns[4][1]) {
            incrementCell(4,1);
            btns[4][1].setText(Integer.toString(board[4][1]));
        } else if (v==btns[4][2]) {
            incrementCell(4,2);
            btns[4][2].setText(Integer.toString(board[4][2]));
        } else if(v==btns[4][3]) {
            incrementCell(4,3);
            btns[4][3].setText(Integer.toString(board[4][3]));
        } else if (v==btns[4][4]) {
            incrementCell(4,4);
            btns[4][4].setText(Integer.toString(board[4][4]));
        } else if (v==btns[4][5]) {
            incrementCell(4,5);
            btns[4][5].setText(Integer.toString(board[4][5]));
        } else if(v==btns[4][6]) {
            incrementCell(4,6);
            btns[4][6].setText(Integer.toString(board[4][6]));
        } else if (v==btns[4][7]) {
            incrementCell(4,7);
            btns[4][7].setText(Integer.toString(board[4][7]));
        } else if (v==btns[4][8]) {
            incrementCell(4,8);
            btns[4][8].setText(Integer.toString(board[4][8]));
        }

        else if(v==btns[5][0]) {
            incrementCell(5,0);
            btns[5][0].setText(Integer.toString(board[5][0]));
        } else if (v==btns[5][1]) {
            incrementCell(5,1);
            btns[5][1].setText(Integer.toString(board[5][1]));
        } else if (v==btns[5][2]) {
            incrementCell(5,2);
            btns[5][2].setText(Integer.toString(board[5][2]));
        } else if(v==btns[5][3]) {
            incrementCell(5,3);
            btns[5][3].setText(Integer.toString(board[5][3]));
        } else if (v==btns[5][4]) {
            incrementCell(5,4);
            btns[5][4].setText(Integer.toString(board[5][4]));
        } else if (v==btns[5][5]) {
            incrementCell(5,5);
            btns[5][5].setText(Integer.toString(board[5][5]));
        } else if(v==btns[5][6]) {
            incrementCell(5,6);
            btns[5][6].setText(Integer.toString(board[5][6]));
        } else if (v==btns[5][7]) {
            incrementCell(5,7);
            btns[5][7].setText(Integer.toString(board[5][7]));
        } else if (v==btns[5][8]) {
            incrementCell(5,8);
            btns[5][8].setText(Integer.toString(board[5][8]));
        }

        else if(v==btns[6][0]) {
            incrementCell(6,0);
            btns[6][0].setText(Integer.toString(board[6][0]));
        } else if (v==btns[6][1]) {
            incrementCell(6,1);
            btns[6][1].setText(Integer.toString(board[6][1]));
        } else if (v==btns[6][2]) {
            incrementCell(6,2);
            btns[6][2].setText(Integer.toString(board[6][2]));
        } else if(v==btns[6][3]) {
            incrementCell(6,3);
            btns[6][3].setText(Integer.toString(board[6][3]));
        } else if (v==btns[6][4]) {
            incrementCell(6,4);
            btns[6][4].setText(Integer.toString(board[6][4]));
        } else if (v==btns[6][5]) {
            incrementCell(6,5);
            btns[6][5].setText(Integer.toString(board[6][5]));
        } else if(v==btns[6][6]) {
            incrementCell(6,6);
            btns[6][6].setText(Integer.toString(board[6][6]));
        } else if (v==btns[6][7]) {
            incrementCell(6,7);
            btns[6][7].setText(Integer.toString(board[6][7]));
        } else if (v==btns[6][8]) {
            incrementCell(6,8);
            btns[6][8].setText(Integer.toString(board[6][8]));
        }

        else if(v==btns[7][0]) {
            incrementCell(7,0);
            btns[7][0].setText(Integer.toString(board[7][0]));
        } else if (v==btns[7][1]) {
            incrementCell(7,1);
            btns[7][1].setText(Integer.toString(board[7][1]));
        } else if (v==btns[7][2]) {
            incrementCell(7,2);
            btns[7][2].setText(Integer.toString(board[7][2]));
        } else if(v==btns[7][3]) {
            incrementCell(7,3);
            btns[7][3].setText(Integer.toString(board[7][3]));
        } else if (v==btns[7][4]) {
            incrementCell(7,4);
            btns[7][4].setText(Integer.toString(board[7][4]));
        } else if (v==btns[7][5]) {
            incrementCell(7,5);
            btns[7][5].setText(Integer.toString(board[7][5]));
        } else if(v==btns[7][6]) {
            incrementCell(7,6);
            btns[7][6].setText(Integer.toString(board[7][6]));
        } else if (v==btns[7][7]) {
            incrementCell(7,7);
            btns[7][7].setText(Integer.toString(board[7][7]));
        } else if (v==btns[7][8]) {
            incrementCell(7,8);
            btns[7][8].setText(Integer.toString(board[7][8]));
        }

        else if(v==btns[8][0]) {
            incrementCell(8,0);
            btns[8][0].setText(Integer.toString(board[8][0]));
        } else if (v==btns[8][1]) {
            incrementCell(8,1);
            btns[8][1].setText(Integer.toString(board[8][1]));
        } else if (v==btns[8][2]) {
            incrementCell(8,2);
            btns[8][2].setText(Integer.toString(board[8][2]));
        } else if(v==btns[8][3]) {
            incrementCell(8,3);
            btns[8][3].setText(Integer.toString(board[8][3]));
        } else if (v==btns[8][4]) {
            incrementCell(8,4);
            btns[8][4].setText(Integer.toString(board[8][4]));
        } else if (v==btns[8][5]) {
            incrementCell(8,5);
            btns[8][5].setText(Integer.toString(board[8][5]));
        } else if(v==btns[8][6]) {
            incrementCell(8,6);
            btns[8][6].setText(Integer.toString(board[8][6]));
        } else if (v==btns[8][7]) {
            incrementCell(8,7);
            btns[8][7].setText(Integer.toString(board[8][7]));
        } else if (v==btns[8][8]) {
            incrementCell(8,8);
            btns[8][8].setText(Integer.toString(board[8][8]));
        }

    }

    private void incrementCell(int row, int col) {
        board[row][col] =  ++board[row][col];
        if (board[row][col] > 9) {
            board[row][col] = 0;
        }
    }

    private void setBtnText() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                btns[i][j].setText(Integer.toString(board[i][j]));
            }
        }
    }

    private void initialBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = 0;
            }
        }

        board[0][1] = 7;
        board[0][3] = 9;
        board[0][5] = 4;
        board[0][6] = 5;
        board[0][8] = 1;

        board[1][5] = 7;
        board[1][6] = 6;

        board[2][3] = 6;
        board[2][4] = 1;
        board[2][5] = 3;
        board[2][8] = 7;

        board[3][1] = 5;
        board[3][2] = 7;
        board[3][5] = 2;
        board[3][7] = 9;
        board[3][8] = 6;

        board[4][0] = 3;
        board[4][2] = 6;
        board[4][3] = 7;
        board[4][5] = 5;
        board[4][6] = 2;

        board[5][1] = 8;
        board[5][3] = 1;
        board[5][4] = 9;
        board[5][6] = 7;

        board[6][1] = 1;
        board[6][7] = 6;
        board[6][8] = 2;

        board[7][0] = 9;
        board[7][1] = 2;
        board[7][2] = 8;
        board[7][3] = 5;
        board[7][5] = 1;
        board[7][8] = 4;

        board[8][1] = 6;
        board[8][3] = 4;
        board[8][7] = 8;
        board[8][8] = 5;

    }

    private boolean solve(int row, int col) {
        if (col == board[row].length) {
            col = 0;
            row = ++row;

            if (row == board.length) {
                return true;
            }
        }

        if (board[row][col] != 0) {
            return solve(row, col + 1);
        }

        for (int i = 1; i < 10; i++) {
            if (isValidPlacment(row, col, i)) {
                board[row][col] = i;
                btns[row][col].setText(Integer.toString(i));

                if (solve(row, col + 1)) {
                    return true;
                }
                board[row][col] = 0;
                btns[row][col].setText("?");
            }
        }

        return false;
    }

    private boolean isValidPlacment(final int row, final int col, final int checkVal) {
        return isValidRow(row, checkVal) && isValidColumn(col, checkVal) && isValidArea(row, col, checkVal);
    }

    private boolean isValidRow(final int row, final int checkVal) {
        for (int i : board[row]) {
            if (i == checkVal) {
                return  false;
            }
        }
        return true;
    }

    private boolean isValidColumn(final int col, final int checkVal) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == checkVal) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidArea(final int row, final int col, final int checkVal) {
        int rowCorner = (int)Math.floor(row / 2.8) * 3;
        int columnCorner = (int)Math.floor(col / 2.8) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (checkVal == board[rowCorner + i][columnCorner + j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isSolved() {
        return isAllRowsSolved() && isAllColumnSolved() && isAllAreaSolved();
    }

    private boolean isAllRowsSolved() {
        ArrayList<Integer> currentNumbers = new ArrayList<>();
        for (int[] row : board){

            for (int num : row) {
                if(!currentNumbers.contains(num)) {
                    currentNumbers.add(num);
                }
                else {
                    return false;
                }
            }

            for (int i = 1; i < 10; i++) {
                if (!currentNumbers.contains(i)) {
                    return false;
                }
            }
            currentNumbers.clear();
        }

        return true;
    }

    private boolean isAllColumnSolved() {
        ArrayList<Integer> currentNumbers = new ArrayList<>();
        for (int k = 0; k < 9; k++){

            for (int j = 0; j < 9; j++) {
                if(!currentNumbers.contains(board[k][j])) {
                    currentNumbers.add(board[k][j]);
                }
                else {
                    return false;
                }
            }

            for (int i = 1; i < 10; i++) {
                if (!currentNumbers.contains(i)) {
                    return false;
                }
            }
            currentNumbers.clear();
        }

        return true;
    }

    private boolean isAllAreaSolved() {
        for (int row = 0; row < 7; row += 3){
            for (int col = 0; col < 7; col += 3){
                if (!checkArea(row, col)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkArea(int rowCorner, int colCorner) {
        ArrayList<Integer> currentNumbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(!currentNumbers.contains(board[i][j])) {
                    currentNumbers.add(board[i][j]);
                }
                else {
                    return false;
                }
            }
        }

        for (int i = 1; i < 10; i++) {
            if (!currentNumbers.contains(i)) {
                return false;
            }
        }

        return true;
    }

}


  //  CharSequence text = "Hello toast!
//  ";Toast.makeText(getApplicationContext(),text,
    //                    Toast.LENGTH_SHORT).show();

/*

        btn_0_0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button btn_0_0 = (Button)findViewById(R.id.cell_0_0);
                incrementCell(0,0);
                btn_0_0.setText(Integer.toString(board[0][0]));

                CharSequence text = Integer.toString(board[0][0]);
                Toast.makeText(getApplicationContext(),text,
                                    Toast.LENGTH_SHORT).show();
            }
        });
    }
 */