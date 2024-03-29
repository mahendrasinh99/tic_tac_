package com.example.tic_tac_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView[] tv = new TextView[9];

    TextView tvStatus;

    Button btnreset;

    int cnt = 0;

    Boolean isWin = false;

    String p1 = "X";

    String p2 = "O";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStatus = findViewById(R.id.tvStatus);
        btnreset = findViewById(R.id.btnreset);

        tvStatus.setText(p1 + "Turn");
        for (int i = 0; i < tv.length; i++) {
            int id = getResources().getIdentifier("tv" + i, "id", getPackageName());
            tv[i] = findViewById(id);
        }
        for (int i = 0; i < tv.length; i++) {
            int j = i;
            tv[j].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isWin) {
                        if (cnt % 2 == 0) {
                            tv[j].setText(p1);
                            tvStatus.setText(p2 + "Turn");
                        } else {
                            tv[j].setText(p2);
                            tvStatus.setText(p1 + "Turn");
                        }
                        cnt++;
                        tv[j].setClickable(false);

                        winGame();
                    }
                }
            });
        }

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < tv.length; i++) {
                    tv[i].setText("");
                    tv[i].setClickable(true);
                    tv[i].setBackgroundColor(getResources().getColor(R.color.white));
                }
                tvStatus.setText(p1 + "Turn");
                cnt = 0;
                isWin = false;
            }
        });
    }

    void winGame() {

        String s0 = tv[0].getText().toString();
        String s1 = tv[1].getText().toString();
        String s2 = tv[2].getText().toString();
        String s3 = tv[3].getText().toString();
        String s4 = tv[4].getText().toString();
        String s5 = tv[5].getText().toString();
        String s6 = tv[6].getText().toString();
        String s7 = tv[7].getText().toString();
        String s8 = tv[8].getText().toString();

        if (s0.equals(s1) && s1.equals(s2) && !s2.isEmpty()) {
            isWin = true;
            tv[0].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[1].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[2].setBackgroundColor(getResources().getColor(R.color.wincolor));

            if (s0.equals(p1)) {
                tvStatus.setText(p1 + "winer");
            } else { c
                tvStatus.setText(p2 + "winer");
            }
        } else if (s3.equals(s4) && s4.equals(s5) && !s5.isEmpty()) {
            isWin = true;
            tv[3].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[4].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[5].setBackgroundColor(getResources().getColor(R.color.wincolor));

            if (s3.equals(p1)) {
                tvStatus.setText(p1 + "winer");
            } else {
                tvStatus.setText(p2 + "winer");
            }
        } else if (s6.equals(s7) && s7.equals(s8) && !s8.isEmpty()) {
            isWin = true;
            tv[6].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[7].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[8].setBackgroundColor(getResources().getColor(R.color.wincolor));

            if (s6.equals(p1)) {
                tvStatus.setText(p1 + "winer");
            } else {
                tvStatus.setText(p2 + "winer");
            }
        } else if (s0.equals(s3) && s3.equals(s6) && !s6.isEmpty()) {
            isWin = true;
            tv[0].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[3].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[6].setBackgroundColor(getResources().getColor(R.color.wincolor));

            if (s0.equals(p1)) {
                tvStatus.setText(p1 + "winer");
            } else {
                tvStatus.setText(p2 + "winer");
            }
        } else if (s1.equals(s4) && s4.equals(s7) && !s7.isEmpty()) {
            isWin = true;
            tv[1].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[4].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[7].setBackgroundColor(getResources().getColor(R.color.wincolor));

            if (s1.equals(p1)) {
                tvStatus.setText(p1 + "winer");
            } else {
                tvStatus.setText(p2 + "winer");
            }
        } else if (s2.equals(s5) && s5.equals(s8) && !s8.isEmpty()) {
            isWin = true;
            tv[2].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[5].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[8].setBackgroundColor(getResources().getColor(R.color.wincolor));

            if (s2.equals(p1)) {
                tvStatus.setText(p1 + "winer");
            } else {
                tvStatus.setText(p2 + "winer");
            }
        } else if (s0.equals(s4) && s4.equals(s8) && !s8.isEmpty()) {
            isWin = true;
            tv[0].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[4].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[8].setBackgroundColor(getResources().getColor(R.color.wincolor));

            if (s0.equals(p1)) {
                tvStatus.setText(p1 + "winer");
            } else {
                tvStatus.setText(p2 + "winer");
            }
        } else if (s2.equals(s4) && s4.equals(s6) && !s6.isEmpty()) {
            isWin = true;
            tv[2].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[4].setBackgroundColor(getResources().getColor(R.color.wincolor));
            tv[6].setBackgroundColor(getResources().getColor(R.color.wincolor));

            if (s2.equals(p1)) {
                tvStatus.setText(p1 + "winer");
            } else {
                tvStatus.setText(p2 + "winer");
            }
        } else if (cnt == 9) {
            tvStatus.setText("Draw!!");
        }

    }
}