package news.syj.com.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import news.syj.com.R;

/**
 * Created by shayajie on 2016/7/15.
 */
public class HomeFragment extends BaseFragment{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected int getTitleId() {
        return R.string.home_title;
    }

    @Override
    protected int getImgResID() {
        return R.mipmap.ic_fragment_home;
    }

}
