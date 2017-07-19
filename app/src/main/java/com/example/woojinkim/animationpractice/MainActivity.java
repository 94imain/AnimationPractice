package com.example.woojinkim.animationpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    AnimationSet set = new AnimationSet(true);

    @OnClick(R.id.left_bt) void left() {
        Intent intent = new Intent(MainActivity.this, LeftComingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.from_left, R.anim.kamahi);
        set.setInterpolator(new AccelerateInterpolator());
    }
    @OnClick(R.id.top_bt) void top() {
        Intent intent = new Intent(MainActivity.this, LeftComingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.from_bot, R.anim.kamahi);
        set.setInterpolator(new AccelerateInterpolator());
    }
    @OnClick(R.id.right_bt) void right() {
        Intent intent = new Intent(MainActivity.this, LeftComingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.from_right, R.anim.kamahi);
        set.setInterpolator(new AccelerateInterpolator());
    }
    @OnClick(R.id.bot_bt) void bot() {
        Intent intent = new Intent(MainActivity.this, LeftComingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.from_top, R.anim.kamahi);
        set.setInterpolator(new AccelerateInterpolator());
    }

    @OnClick(R.id.flip_bt) void flipListener() {
        Intent intent = new Intent(MainActivity.this, LeftComingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.kamahi);
    }

    @BindView(R.id.ltav1) LottieAnimationView a1;
    @BindView(R.id.ltav2) LottieAnimationView a2;
    @BindView(R.id.ltav3) LottieAnimationView a3;
    @BindView(R.id.ltav4) LottieAnimationView a4;

    @OnClick(R.id.ltav1) void setA1() {
        setdefault();
        a1.setAnimation("movin.json");
        a1.playAnimation();
    }
    @OnClick(R.id.ltav2) void setA2() {
        setdefault();
        a2.setAnimation("movin.json");
        a2.playAnimation();
    }
    @OnClick(R.id.ltav3) void setA3() {
        setdefault();
        a3.setAnimation("movin.json");
        a3.playAnimation();
    }
    @OnClick(R.id.ltav4) void setA4() {
        setdefault();
        a4.setAnimation("movin.json");
        a4.playAnimation();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);

        setdefault();
    }

    public void setdefault() {
        a1.setAnimation("default.json");
        a1.setProgress(0.0f);
        a1.cancelAnimation();

        a2.setAnimation("default.json");
        a2.setProgress(0.0f);
        a2.cancelAnimation();

        a3.setAnimation("default.json");
        a3.setProgress(0.0f);
        a3.cancelAnimation();

        a4.setAnimation("default.json");
        a4.setProgress(0.0f);
        a4.cancelAnimation();
    }

}
