package news.syj.com.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import news.syj.com.R;
import news.syj.com.utils.MyLog;

/**
 * Created by shayajie on 2016/7/12.
 */
public class GuideActivity extends BaseActivity{
    private static final String TAG = "GuideActivity";
    private SharedPreferences shared;
    private SharedPreferences.Editor editor;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyLog.d(TAG,"onCreate");


    }

    @Override
    protected int getLayoutId() {
        MyLog.d(TAG,"getLayoutId");
        return R.layout.activity_guide;
    }

    @Override
    protected void findView() {
        MyLog.d(TAG,"findView");
        checkIsFirstRun();



    }

    private void checkIsFirstRun() {
        MyLog.d(TAG,"checkIsFirstRun");
        shared = getSharedPreferences("newsappinfo", Context.MODE_PRIVATE);
        editor = shared.edit();
        boolean isFirstRun = shared.getBoolean("isFirstRun", true);
        isFirstRun = false;
        if(!isFirstRun) {
            MyLog.d(TAG,"false");
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void initView() {
        MyLog.d(TAG,"initView");
    }

    @Override
    protected void setOnClick() {
        MyLog.d(TAG,"setOnClick");
    }

    @Override
    protected void initData() {
        MyLog.d(TAG,"initData");
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }
}
