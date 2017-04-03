package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {
    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_second);

        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.putExtra("return_data","Hello First");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    /**
     * 重写按下back键的方法
     */
    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("return_data","Hello First");
        setResult(RESULT_OK,intent);
        finish();
    }
}
