package news.syj.com.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import news.syj.com.R;

/**
 * Created by shayajie on 2016/7/14.
 */
public class TabsFragment extends Fragment implements View.OnClickListener {

    private static final String TAG = "TabsFragment";

    private FindFragment findFragment;
    private HomeFragment homeFragment;
    private StoreFragment storeFragment;
    private PersonalFragment personalFragment;

    private ImageView img_fragment_tab_home,img_fragment_tab_find,img_fragment_tab_store,img_fragment_tab_personal;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab,container,false);
        initview(view);
        return  view;
    }

    private void initview(View view) {
        img_fragment_tab_home = (ImageView) view.findViewById(R.id.img_fragment_tab_home);
        img_fragment_tab_find = (ImageView) view.findViewById(R.id.img_fragment_tab_find);
        img_fragment_tab_store = (ImageView) view.findViewById(R.id.img_fragment_tab_store);
        img_fragment_tab_personal = (ImageView) view.findViewById(R.id.img_fragment_tab_personal);
        img_fragment_tab_home.setOnClickListener(this);
        img_fragment_tab_find.setOnClickListener(this);
        img_fragment_tab_store.setOnClickListener(this);
        img_fragment_tab_personal.setOnClickListener(this);
        SelcetTab("home");
    }

    private void SelcetTab(String s) {
       if("home".equals(s)){
           img_fragment_tab_home.setSelected(true);
           img_fragment_tab_find.setSelected(false);
           img_fragment_tab_store.setSelected(false);
           img_fragment_tab_personal.setSelected(false);

           if (null == homeFragment)
           {
               homeFragment = new HomeFragment();
           }

           FragmentTransaction localFragmentTransaction = getFragmentManager().beginTransaction();
           localFragmentTransaction.replace(R.id.fragment_contents, homeFragment);
           localFragmentTransaction.commit();

       }
        if("find".equals(s)) {
            if (null == findFragment)
            {
                findFragment = new FindFragment();
            }

            FragmentTransaction localFragmentTransaction = getFragmentManager().beginTransaction();
            localFragmentTransaction.replace(R.id.fragment_contents, findFragment);
            localFragmentTransaction.commit();
            img_fragment_tab_home.setSelected(false);
            img_fragment_tab_find.setSelected(true);
            img_fragment_tab_store.setSelected(false);
            img_fragment_tab_personal.setSelected(false);
        }
        if("store".equals(s)){
            if (null == storeFragment)
            {
                storeFragment = new StoreFragment();
            }

            FragmentTransaction localFragmentTransaction = getFragmentManager().beginTransaction();
            localFragmentTransaction.replace(R.id.fragment_contents, storeFragment);
            localFragmentTransaction.commit();
            img_fragment_tab_home.setSelected(false);
            img_fragment_tab_find.setSelected(false);
            img_fragment_tab_store.setSelected(true);
            img_fragment_tab_personal.setSelected(false);
        }
        if("personal".equals(s)){
            if (null == personalFragment)
            {
                personalFragment = new PersonalFragment();
            }

            FragmentTransaction localFragmentTransaction = getFragmentManager().beginTransaction();
            localFragmentTransaction.replace(R.id.fragment_contents, personalFragment);
            localFragmentTransaction.commit();
            img_fragment_tab_home.setSelected(false);
            img_fragment_tab_find.setSelected(false);
            img_fragment_tab_store.setSelected(false);
            img_fragment_tab_personal.setSelected(true);
        }



    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_fragment_tab_home:
                SelcetTab("home");
                break;
            case R.id.img_fragment_tab_find:
                SelcetTab("find");
                break;
            case R.id.img_fragment_tab_store:
                SelcetTab("store");
                break;
            case R.id.img_fragment_tab_personal:
                SelcetTab("personal");
                break;
        }
    }
}
