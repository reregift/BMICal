package com.example.bmical;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BMIResultAct extends AppCompatActivity {
    private Button ButtonB;

    public void backb(View view) {
        Intent intent = new Intent(BMIResultAct.this, MainActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiresult);
        Intent intent = getIntent();
        double bmi = intent.getDoubleExtra("bmi_value", 0);
        String BMIText = intent.getStringExtra("bmi_text");

        String much = String.valueOf(String.format("%.2f", bmi));

        TextView t = (TextView) findViewById(R.id.BMICal);
        TextView t2 = (TextView) findViewById(R.id.BMIdetail);

        t.setText("ค่า BMI ที่ได้คือ" + much);
        t2.setText("อยู่ในเกณฑ์ " + BMIText);

        //ButtonB = (Button) findViewById(R.id.button_back);




}

}