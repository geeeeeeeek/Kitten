package com.yat3s.kitten.decoration;


import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

/**
 * Created by Yat3s on 19/06/2017.
 * Email: hawkoyates@gmail.com
 * GitHub: https://github.com/yat3s
 */
public class KittenRefreshHeaderIndicator extends LottieAnimationView implements RefreshHeaderIndicatorProvider {

    public KittenRefreshHeaderIndicator(Context context) {
        super(context);
    }

    public KittenRefreshHeaderIndicator(Context context, String animationFileName) {
        super(context);
        setAnimation(animationFileName);
    }

    public KittenRefreshHeaderIndicator(Context context, String animationFileName, float scale) {
        this(context, animationFileName);
        setScale(scale);
    }

    public KittenRefreshHeaderIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public KittenRefreshHeaderIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public View provideContentView() {
        return this;
    }

    @Override
    public void onRefreshStart() {
        playAnimation();
    }

    @Override
    public void onRefreshComplete() {
        clearAnimation();
    }

    @Override
    public void onRefreshHeaderViewScrollChange(int progress) {
        setProgress(progress / 100.0f);
    }
}
