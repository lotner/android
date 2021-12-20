package test.lotner.pcytest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Test1_20 extends AppCompatActivity {
    public int count = 20;
    Dialog dialogdepression;
    Dialog dialogexist;
    Dialog dialogeasy;
    Dialog dialognosimptom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1_20);

        //на весь экран
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //back
        Button btn_back = (Button) findViewById(R.id.buttonback);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Test1_20.this, Tests.class);
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
        TextView answer1 = (TextView) findViewById(R.id.test1_answer81);
        TextView answer2 = (TextView) findViewById(R.id.test1_answer82);
        TextView answer3 = (TextView) findViewById(R.id.test1_answer83);
        TextView answer4 = (TextView) findViewById(R.id.test1_answer84);
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
                    if (mark >= 0 && mark <= 21) {
                        dialogdepression.show();
                    }else if (mark > 21 && mark <= 42) {
                        dialogexist.show();
                    }else if (mark > 42 && mark <= 63) {
                        dialogeasy.show();
                    }else if (mark > 63 && mark <=84) {
                        dialognosimptom.show();
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
                    if (mark >= 0 && mark <= 21) {
                        dialogdepression.show();
                    }else if (mark > 21 && mark <= 42) {
                        dialogexist.show();
                    }else if (mark > 42 && mark <= 63) {
                        dialogeasy.show();
                    }else if (mark > 63 && mark <=84) {
                        dialognosimptom.show();
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
                    if (mark >= 0 && mark <= 21) {
                        dialogdepression.show();
                    }else if (mark > 21 && mark <= 42) {
                        dialogexist.show();
                    }else if (mark > 42 && mark <= 63) {
                        dialogeasy.show();
                    }else if (mark > 63 && mark <=84) {
                        dialognosimptom.show();
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
                    if (mark >= 0 && mark <= 21) {
                        dialogdepression.show();
                    }else if (mark > 21 && mark <= 42) {
                        dialogexist.show();
                    }else if (mark > 42 && mark <= 63) {
                        dialogeasy.show();
                    }else if (mark > 63 && mark <=84) {
                        dialognosimptom.show();
                    }
                }
                return true;
            }
        });

        dialogdepression = new Dialog(this); //создали новое окно диалога
        dialogdepression.requestWindowFeature(Window.FEATURE_NO_TITLE); //скрыли заголовок
        dialogdepression.setContentView(R.layout.dialogdepression);
        dialogdepression.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); // прозрачный фон
        dialogdepression.setCancelable(false); //не закроется кнопкой назад

        TextView btnclose = (TextView)dialogdepression.findViewById(R.id.btnclose);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                Intent intent = new Intent(Test1_20.this, Tests.class);
                startActivity(intent); finish();
                }catch (Exception e) {

                }
                dialogdepression.dismiss();
            }
        });

        Button btncontinue = (Button)dialogdepression.findViewById(R.id.bntcontinue);
        btncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Test1_20.this, Tests.class);
                    startActivity(intent); finish();
                }catch (Exception e) {

                }
                dialogdepression.dismiss();
            }
        });

        dialogexist = new Dialog(this); //создали новое окно диалога
        dialogexist.requestWindowFeature(Window.FEATURE_NO_TITLE); //скрыли заголовок
        dialogexist.setContentView(R.layout.dialogexist);
        dialogexist.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); // прозрачный фон
        dialogexist.setCancelable(false); //не закроется кнопкой назад

        TextView btnnclose = (TextView)dialogexist.findViewById(R.id.btnclose);
        btnnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Test1_20.this, Tests.class);
                    startActivity(intent); finish();
                }catch (Exception e) {

                }
                dialogexist.dismiss();
            }
        });

        Button btnncontinue = (Button)dialogexist.findViewById(R.id.bntcontinue);
        btnncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Test1_20.this, Tests.class);
                    startActivity(intent); finish();
                }catch (Exception e) {

                }
                dialogexist.dismiss();
            }
        });

        dialogeasy = new Dialog(this); //создали новое окно диалога
        dialogeasy.requestWindowFeature(Window.FEATURE_NO_TITLE); //скрыли заголовок
        dialogeasy.setContentView(R.layout.dialogeasy);
        dialogeasy.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); // прозрачный фон
        dialogeasy.setCancelable(false); //не закроется кнопкой назад

        TextView bttnclose = (TextView)dialogeasy.findViewById(R.id.btnclose);
        bttnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Test1_20.this, Tests.class);
                    startActivity(intent); finish();
                }catch (Exception e) {

                }
                dialogeasy.dismiss();
            }
        });

        Button bttncontinue = (Button)dialogeasy.findViewById(R.id.bntcontinue);
        bttncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Test1_20.this, Tests.class);
                    startActivity(intent); finish();
                }catch (Exception e) {

                }
                dialogeasy.dismiss();
            }
        });

        dialognosimptom = new Dialog(this); //создали новое окно диалога
        dialognosimptom.requestWindowFeature(Window.FEATURE_NO_TITLE); //скрыли заголовок
        dialognosimptom.setContentView(R.layout.dialognosiptom);
        dialognosimptom.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); // прозрачный фон
        dialognosimptom.setCancelable(false); //не закроется кнопкой назад

        TextView bbtnclose = (TextView)dialognosimptom.findViewById(R.id.btnclose);
        bbtnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Test1_20.this, Tests.class);
                    startActivity(intent); finish();
                }catch (Exception e) {

                }
                dialognosimptom.dismiss();
            }
        });

        Button bbtncontinue = (Button)dialognosimptom.findViewById(R.id.bntcontinue);
        bbtncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Test1_20.this, Tests.class);
                    startActivity(intent); finish();
                }catch (Exception e) {

                }
                dialognosimptom.dismiss();
            }
        });

    }
    // системная назад -- начало
    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Test1_20.this, Tests.class);
            startActivity(intent);finish();
        } catch (Exception e) {

        }
    }
}



