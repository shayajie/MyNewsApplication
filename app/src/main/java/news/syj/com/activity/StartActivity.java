package news.syj.com.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import news.syj.com.R;
import news.syj.com.utils.MyLog;
import news.syj.com.utils.StatusBarCompat;

/**
 * Created by shayajie on 2016/7/12.
 */
public class StartActivity extends AppCompatActivity{
    private static final String TAG = "StartActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View startview = View.inflate(this,R.layout.activity_start,null);
        setContentView(startview);
//        StatusBarCompat.compat(this,android.R.color.white);

        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f,1.0f);
        alphaAnimation.setDuration(2000);
        startview.setAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                MyLog.d(TAG,"onAnimationStart");
                checkUpdate();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                MyLog.d(TAG,"onAnimationEnd");
                redirectto();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                MyLog.d(TAG,"onAnimationRepeat");
            }
        });
    }

    /**
     * 是否有新版本
     */
    private void checkUpdate() {
        MyLog.d(TAG,"checkUpdate");
    }

    /**
     * 界面跳转
     */
    private void redirectto() {
        MyLog.d(TAG,"redirectto");
        Intent intent = new Intent(this,GuideActivity.class);
        startActivity(intent);
        finish();
    }
}
