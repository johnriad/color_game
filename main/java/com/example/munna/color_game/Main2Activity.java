package com.example.munna.color_game;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.graphics.Color.*;

public class Main2Activity extends AppCompatActivity {

    Button b,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    TextView tv,count;
    int score=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b=(Button)findViewById(R.id.id_btn);
        b2=(Button)findViewById(R.id.id_btn2);
        b3=(Button)findViewById(R.id.id_btn3);
        b4=(Button)findViewById(R.id.id_btn4);
        b5=(Button)findViewById(R.id.id_btn5);
        b6=(Button)findViewById(R.id.id_btn6);
        b7=(Button)findViewById(R.id.id_btn7);
        b8=(Button)findViewById(R.id.id_btn8);
        b9=(Button)findViewById(R.id.id_btn9);
        b10=(Button)findViewById(R.id.id_btn10);
        b11=(Button)findViewById(R.id.id_btn11);
        b12=(Button)findViewById(R.id.id_btn12);
        b13=(Button)findViewById(R.id.id_btn13);
        b14=(Button)findViewById(R.id.id_btn14);
        b15=(Button)findViewById(R.id.id_btn15);
        b16=(Button)findViewById(R.id.id_btn16);
        tv=(TextView)findViewById(R.id.id_scr);
        count=(TextView)findViewById(R.id.id_Time);

        final CountDownTimer countDownTimer=new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                count.setText("Time : "+millisUntilFinished / 1000);

            }
            @Override
            public void onFinish() {

            }
        }.start();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setBackgroundColor(Color.RED);
                b2.setText("B");
                b3.setText("C");
                b4.setText("D");
                b5.setText("E");
                b6.setText("F");
                b7.setText("G");
                b8.setText("H");
                b9.setText("I");
                b10.setText("J");
                b11.setText("K");
                b12.setText("L");
                b13.setText("M");
                b14.setText("N");
                b15.setText("O");

                endgame();
            }
        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b2.setText("BLUE");
//
//                b.setText("A");
//                b3.setText("C");
//                b4.setText("D");
//                b5.setText("E");
//                b6.setText("F");
//                b7.setText("G");
//                b8.setText("H");
//                b9.setText("I");
//                b10.setText("J");
//                b11.setText("K");
//                b12.setText("L");
//                b14.setText("N");
//                b15.setText("O");
//                b16.setText("P");
//                endgame();
//            }
//        });
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b3.setText("GREEN");
//
//                b.setText("A");
//                b2.setText("B");
//                b4.setText("D");
//                b5.setText("E");
//                b6.setText("F");
//                b7.setText("G");
//                b8.setText("H");
//                b9.setText("I");
//                b10.setText("J");
//                b11.setText("K");
//                b12.setText("L");
//                b13.setText("M");
//                b15.setText("O");
//                b16.setText("P");
//                endgame();
//            }
//        });
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b4.setText("WHITE");
//
//                b.setText("A");
//                b2.setText("B");
//                b3.setText("C");
//                b5.setText("E");
//                b6.setText("F");
//                b7.setText("G");
//                b8.setText("H");
//                b9.setText("I");
//                b10.setText("J");
//                b11.setText("K");
//                b12.setText("L");
//                b13.setText("M");
//                b14.setText("N");
//                b16.setText("P");
//                endgame();
//            }
//        });
//        b5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b5.setText("YELLOW");
//
//                b.setText("A");
//                b2.setText("B");
//                b3.setText("C");
//                b4.setText("D");
//                b6.setText("F");
//                b7.setText("G");
//                b8.setText("H");
//                b10.setText("J");
//                b11.setText("K");
//                b12.setText("L");
//                b13.setText("M");
//                b14.setText("N");
//                b15.setText("O");
//                b16.setText("P");
//                endgame();
//            }
//        });
//        b6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b6.setText("ORANGE");
//
//                b.setText("A");
//                b2.setText("B");
//                b3.setText("C");
//                b4.setText("D");
//                b5.setText("E");
//                b7.setText("G");
//                b8.setText("H");
//                b9.setText("I");
//                b10.setText("J");
//                b11.setText("K");
//                b13.setText("M");
//                b14.setText("N");
//                b15.setText("O");
//                b16.setText("P");
//                endgame();
//            }
//        });
//        b7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b7.setText("PINK");
//
//                b.setText("A");
//                b2.setText("B");
//                b3.setText("C");
//                b4.setText("D");
//                b5.setText("E");
//                b6.setText("F");
//                b8.setText("H");
//                b9.setText("I");
//                b10.setText("J");
//                b12.setText("L");
//                b13.setText("M");
//                b14.setText("N");
//                b15.setText("O");
//                b16.setText("P");
//                endgame();
//            }
//        });
//        b8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b8.setText("GOLD");
//
//                b.setText("A");
//                b2.setText("B");
//                b3.setText("C");
//                b4.setText("D");
//                b5.setText("E");
//                b6.setText("F");
//                b7.setText("G");
//                b9.setText("I");
//                b11.setText("K");
//                b12.setText("L");
//                b13.setText("M");
//                b14.setText("N");
//                b15.setText("O");
//                b16.setText("P");
//                endgame();
//            }
//        });
//        b9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b9.setText("YELLOW");
//
//                b.setText("A");
//                b2.setText("B");
//                b3.setText("C");
//                b4.setText("D");
//                b6.setText("F");
//                b7.setText("G");
//                b8.setText("H");
//                b10.setText("J");
//                b11.setText("K");
//                b12.setText("L");
//                b13.setText("M");
//                b14.setText("N");
//                b15.setText("O");
//                b16.setText("P");
//                endgame();
//            }
//        });
//        b10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b10.setText("GOLD");
//
//                b.setText("A");
//                b2.setText("B");
//                b3.setText("C");
//                b4.setText("D");
//                b5.setText("E");
//                b6.setText("F");
//                b7.setText("G");
//                b9.setText("I");
//                b11.setText("K");
//                b12.setText("L");
//                b13.setText("M");
//                b14.setText("N");
//                b15.setText("O");
//                b16.setText("P");
//                endgame();
//            }
//        });
//        b11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b11.setText("PINK");
//
//                b.setText("A");
//                b2.setText("B");
//                b3.setText("C");
//                b4.setText("D");
//                b5.setText("E");
//                b6.setText("F");
//                b8.setText("H");
//                b9.setText("I");
//                b10.setText("J");
//
//                b12.setText("L");
//                b13.setText("M");
//                b14.setText("N");
//                b15.setText("O");
//                b16.setText("P");
//                endgame();
//            }
//        });
//        b12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b12.setText("ORANGE");
//
//                b.setText("A");
//                b2.setText("B");
//                b3.setText("C");
//                b4.setText("D");
//                b5.setText("E");
//                b7.setText("G");
//                b8.setText("H");
//                b9.setText("I");
//                b10.setText("J");
//                b11.setText("K");
//                b13.setText("M");
//                b14.setText("N");
//                b15.setText("O");
//                b16.setText("P");
//                endgame();
//            }
//        });
//        b13.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b13.setText("BLUE");
//
//                b.setText("A");
//                b3.setText("C");
//                b4.setText("D");
//                b5.setText("E");
//                b6.setText("F");
//                b7.setText("G");
//                b8.setText("H");
//                b9.setText("I");
//                b10.setText("J");
//                b11.setText("K");
//                b12.setText("L");
//                b14.setText("N");
//                b15.setText("O");
//                b16.setText("P");
//                endgame();
//            }
//        });
//        b14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b14.setText("GREEN");
//
//                b.setText("A");
//                b4.setText("D");
//                b5.setText("E");
//                b6.setText("F");
//                b7.setText("G");
//                b8.setText("H");
//                b9.setText("I");
//                b10.setText("J");
//                b11.setText("K");
//                b12.setText("L");
//                b13.setText("M");
//                b15.setText("O");
//                b16.setText("P");
//                endgame();
//            }
//        });
//        b15.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                b15.setText("WHITE");
//
//                b.setText("A");
//                b2.setText("B");
//                b3.setText("C");
//                b5.setText("E");
//                b6.setText("F");
//                b7.setText("G");
//                b8.setText("H");
//                b9.setText("I");
//                b10.setText("J");
//                b11.setText("K");
//                b12.setText("L");
//                b13.setText("M");
//                b14.setText("N");
//                b16.setText("P");
//                endgame();
//            }
//        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b16.setBackgroundColor(RED);

                b2.setText("B");
                b3.setText("C");
                b4.setText("D");
                b5.setText("E");
                b6.setText("F");
                b7.setText("G");
                b8.setText("H");
                b9.setText("I");
                b10.setText("J");
                b11.setText("K");
                b12.setText("L");
                b13.setText("M");
                b14.setText("N");
                b15.setText("O");

                endgame();
            }
        });
    }
    public void endgame(){
        String a,bb,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
//        a=b.getText().toString();
//        bb=b2.getText().toString();
//        c=b3.getText().toString();
//        d=b4.getText().toString();
//        e=b5.getText().toString();
//        f=b6.getText().toString();
//        g=b7.getText().toString();
//        h=b8.getText().toString();
//        i=b9.getText().toString();
//        j=b10.getText().toString();
//        k=b11.getText().toString();
//        l=b12.getText().toString();
//        m=b13.getText().toString();
//        n=b14.getText().toString();
//        o=b15.getText().toString();
//        p=b16.getText().toString();

//       if (bb && b16.setBackgroundColor(Color.RED)){
//            b.setVisibility(View.GONE);
//            b16.setVisibility(View.GONE);
//            tv.setText("Score:"+score);
//            score++;
//        }
//        if (bb.equals("BLUE")&& m.equals("BLUE")){
//            b2.setVisibility(View.GONE);
//            b13.setVisibility(View.GONE);
//            tv.setText("Score:"+score);
//            score++;
//        }
//        if (c.equals("GREEN")&& n.equals("GREEN")){
//            b3.setVisibility(View.GONE);
//            b14.setVisibility(View.GONE);
//            tv.setText("Score:"+score);
//            score++;
//        }
//        if (d.equals("WHITE")&& o.equals("WHITE")){
//            b4.setVisibility(View.GONE);
//            b15.setVisibility(View.GONE);
//            tv.setText("Score:"+score);
//            score++;
//        }
//        if (e.equals("YELLOW")&& i.equals("YELLOW")){
//            b5.setVisibility(View.GONE);
//            b9.setVisibility(View.GONE);
//            tv.setText("Score:"+score);
//            score++;
//        }
//        if (f.equals("ORANGE")&& l.equals("ORANGE")){
//            b6.setVisibility(View.GONE);
//            b12.setVisibility(View.GONE);
//            tv.setText("Score:"+score);
//            score++;
//        }
//        if (g.equals("PINK")&& k.equals("PINK")){
//            b7.setVisibility(View.GONE);
//            b11.setVisibility(View.GONE);
//            tv.setText("Score:"+score);
//            score++;
//        }
//        if (h.equals("GOLD")&& j.equals("GOLD")){
//            b8.setVisibility(View.GONE);
//            b10.setVisibility(View.GONE);
//            tv.setText("Score:"+score);
//            score++;
//        }

    }
    public void onBackPressed(){
        AlertDialog.Builder ad=new AlertDialog.Builder(Main2Activity.this);
        ad.setTitle("ARE YOU WANT TO EXIT HERE !!");
        ad.setCancelable(false);
        ad.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        ad.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).show();
    }
}
