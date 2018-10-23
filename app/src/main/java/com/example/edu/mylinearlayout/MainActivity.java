package com.example.edu.mylinearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static com.example.edu.mylinearlayout.R.id.button1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //    public void onClick1(View view){//View view 현재눌러진 나 return 과 같은
//        }
//        Toast.makeText(getApplicationContext(), "버튼1을 눌렀습니다.",Toast.LENGTH_SHORT);
//    }
//    public void onClick2(View view){
//        Toast.makeText(getApplicationContext(), "버튼2을 눌렀습니다.",Toast.LENGTH_SHORT);
//    }
//    public void onClick3(View view){
//        Toast.makeText(getApplicationContext(), "버튼3을 눌렀습니다.",Toast.LENGTH_SHORT);
//    }
    public void onClick1(View view) {//View view 현재눌러진 나 return 과 같은
        switch (view.getId()) {
            case button1:
                ;
                Toast.makeText(getApplicationContext(), "버튼1을 눌렀습니다.", Toast.LENGTH_SHORT).show();break;
            case R.id.button2:
                ;
                Toast.makeText(getApplicationContext(), "버튼1을 눌렀습니다.", Toast.LENGTH_SHORT).show();break;
            case R.id.button3:
                ;
                Toast.makeText(getApplicationContext(), "버튼1을 눌렀습니다.", Toast.LENGTH_SHORT).show();break;
        }

    }
}
