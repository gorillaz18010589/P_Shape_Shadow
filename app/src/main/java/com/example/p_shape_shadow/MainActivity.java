package com.example.p_shape_shadow;
/*
*   rectangle－矩形（直角矩形、圓角矩形），默認的形狀
    oval－橢圓形、圓形
    line－線形（實線、虛線）
    ring－環形、環形進度條
*
* */
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.shape.DisplayUtil;

public class MainActivity extends AppCompatActivity {
    private TextView tvRadius;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setRadiusBg(tvRadius);
    }

    private void init() {
        tvRadius = findViewById(R.id.tvRadius);
    }


    //設定圓角背景自帶背景顏色
    @RequiresApi(api = Build.VERSION_CODES.Q)
    private void setRadiusBg(View view) {
        GradientDrawable drawable=new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE);
        drawable.setGradientType(GradientDrawable.RECTANGLE);
        drawable.setCornerRadius(60);
        drawable.setPadding(DisplayUtil.px2dip(this,10),DisplayUtil.px2dip(this,10),DisplayUtil.px2dip(this,10),DisplayUtil.px2dip(this,10));
        drawable.setColor(getResources().getColor(R.color.colorAccent));
        view.setBackground(drawable);
    }
}
