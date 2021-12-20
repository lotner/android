package test.lotner.pcytest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Test1_13 extends AppCompatActivity {
    public int count = 13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1_13);

        //на весь экран
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //back
        Button btn_back = (Button) findViewById(R.id.buttonback);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Test1_13.this, Tests.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });
        final int[] progress = {
                R.id.point1, R.id.point2, R.id.point3, R.id.point4, R.id.point5, R.id.point6, R.id.point7, R.id.point8,
                R.id.point9, R.id.point10, R.id.point11, R.id.point12, R.id.point13, R.id.point14, R.id.point15, R.id.point16,
                R.id.point17, R.id.point18, R.id.point19, R.id.point20, R.id.point21,
        };

        for (int i=0; i<count; i++) { // и закрасила его
            TextView tv = findViewById(progress[i]);
            tv.setBackgroundResource(R.color.yellow);
        }
        TextView answer1 = (TextView) findViewById(R.id.test1_answer53);
        TextView answer2 = (TextView) findViewById(R.id.test1_answer54);
        TextView answer3 = (TextView) findViewById(R.id.test1_answer55);
        TextView answer4 = (TextView) findViewById(R.id.test1_answer56);
        answer1.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Intent mIntent = getIntent();
                int mark = mIntent.getIntExtra("mark", 0);
                if (event.getAction() == MotionEvent.ACTION_DOWN) { //нажали кнопку
                    answer2.setEnabled(false);
                    answer3.setEnabled(false);
                    answer4.setEnabled(false);
                }else if (event.getAction() == MotionEvent.ACTION_UP) { //отпустили
                    mark = mark + 3; //добавила баллы за ответ
                    if (count<23) {
                        count = count + 1; //добавила поинт
                    }
                    for (int i=0; i<count; i++) { // и закрасила его
                        TextView tv = findViewById(progress[i]);
                        tv.setBackgroundResource(R.color.yellow);
                    }
                    Intent inten = new Intent(Test1_13.this, Test1_14.class);
                    inten.putExtra("mark", mark);
                    startActivity(inten);
                    //переход дальше
                    try{
                        Intent intent = new Intent(Test1_13.this, Test1_14.class);
                        startActivity(intent);finish();
                    }catch (Exception e) {
                    }
                }
                return true;
            }
        });
        answer2.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Intent mIntent = getIntent();
                int mark = mIntent.getIntExtra("mark", 0);
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    answer1.setEnabled(false);
                    answer3.setEnabled(false);
                    answer4.setEnabled(false);
                }else if (event.getAction() == MotionEvent.ACTION_UP) {
                    mark = mark + 2;
                    if (count<23) {
                        count = count + 1;
                    }
                    for (int i=0; i<count; i++) {
                        TextView tv = findViewById(progress[i]);
                        tv.setBackgroundResource(R.color.yellow);
                    }
                    Intent inten = new Intent(Test1_13.this, Test1_14.class);
                    inten.putExtra("mark", mark);
                    startActivity(inten);
                    try{
                        Intent intent = new Intent(Test1_13.this, Test1_14.class);
                        startActivity(intent);finish();
                    }catch (Exception e) {
                    }
                }
                return true;
            }
        });
        answer3.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Intent mIntent = getIntent();
                int mark = mIntent.getIntExtra("mark", 0);
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    answer1.setEnabled(false);
                    answer2.setEnabled(false);
                    answer4.setEnabled(false);
                }else if (event.getAction() == MotionEvent.ACTION_UP) {
                    mark = mark + 1;
                    if (count<23) {
                        count = count + 1;
                    }
                    for (int i=0; i<count; i++) {
                        TextView tv = findViewById(progress[i]);
                        tv.setBackgroundResource(R.color.yellow);
                    }
                    Intent inten = new Intent(Test1_13.this, Test1_14.class);
                    inten.putExtra("mark", mark);
                    startActivity(inten);
                    try{
                        Intent intent = new Intent(Test1_13.this, Test1_14.class);
                        startActivity(intent);finish();
                    }catch (Exception e) {
                    }
                }
                return true;
            }
        });
        answer4.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Intent mIntent = getIntent();
                int mark = mIntent.getIntExtra("mark", 0);
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    answer1.setEnabled(false);
                    answer2.setEnabled(false);
                    answer3.setEnabled(false);
                }else if (event.getAction() == MotionEvent.ACTION_UP) {
                    mark = mark + 0;
                    if (count<23) {
                        count = count + 1;
                    }
                    for (int i=0; i<count; i++) {
                        TextView tv = findViewById(progress[i]);
                        tv.setBackgroundResource(R.color.yellow);
                    }
                    Intent inten = new Intent(Test1_13.this, Test1_14.class);
                    inten.putExtra("mark", mark);
                    startActivity(inten);
                    try{
                        Intent intent = new Intent(Test1_13.this, Test1_14.class);
                        startActivity(intent);finish();
                    }catch (Exception e) {
                    }
                }
                return true;
            }
        });

    }
    // системная назад -- начало
    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Test1_13.this, Tests.class);
            startActivity(intent);finish();
        } catch (Exception e) {

        }
    }
}


