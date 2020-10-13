package com.example.wheelview;

import
androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.Arrays;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import me.sujanpoudel.wheelview.WheelView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WheelView wheelView=findViewById(R.id.wheelview);
        wheelView.setTitles(Arrays.asList("First","Second","Third","Fourth","Fifth","Sixth"));
        wheelView.setSelectListener(new Function1<Integer, Unit>() {
            @Override
            public Unit invoke(Integer integer) {
                showToast(integer);
                return Unit.INSTANCE;
            }
            private final void showToast(Integer index) {
                Toast.makeText(MainActivity.this,""+wheelView.getTitles().get(index),Toast.LENGTH_LONG).show();
            }
        });

    }


}