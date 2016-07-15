package news.syj.com.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


import news.syj.com.R;
import news.syj.com.utils.MyLog;
import news.syj.com.utils.UmengManager;

/**
 * Created by shayajie on 2016/7/11.
 */
public abstract class BaseActivity extends AppCompatActivity{
    private final String TAG = this.getClass().getSimpleName();

//    protected void onCreate(@Nullable Bundle savedInstanceState,String UmenTAG) {
//        this.onCreate(savedInstanceState);
//
//    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyLog.d(TAG,"BaseActivityonCreate");
        setContentView(getLayoutId());
        findView();
        initView();
        setOnClick();
        initData();
    }

    protected abstract int getLayoutId();
    protected abstract void findView();
    protected abstract void initView();
    protected abstract void setOnClick();
    protected abstract void initData();


    @Override
    protected void onStart() {
        super.onStart();
        MyLog.d(TAG,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MyLog.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        UmengManager.onPageStart(TAG);
        UmengManager.onResume(this);
        MyLog.d(TAG,"onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        UmengManager.onPageEnd(TAG);
        UmengManager.onPause(this);
        MyLog.d(TAG,"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.push_right_in,R.anim.push_right_out);
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
        overridePendingTransition(R.anim.push_right_in,R.anim.push_right_out);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }
}
