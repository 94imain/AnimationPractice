package com.example.woojinkim.animationpractice;

import android.animation.ValueAnimator;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.Cancellable;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

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
