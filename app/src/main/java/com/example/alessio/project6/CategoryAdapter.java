package com.example.alessio.project6;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    /*Field*/
    private Context mContext;

    /*Constructor Method*/
    public CategoryAdapter (Context context, FragmentManager fm){
        super (fm);
        mContext = context;
    }

    /*Helper Method*/
    @Override
    public Fragment getItem(int position){

        switch (position) {
            case 0:
                return new EatFragment();
            case 1:
                return new DrinkFragment();
            case 2:
                return new HaveFunFragment();
            default:
                return new LearnFragment();
        }
    }

    /*Helper Method*/
    @Override
    public int getCount() {
        return 4;
    }

    /*Helper Method*/
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return mContext.getString(R.string.category_eat);
            case 1:
                return mContext.getString(R.string.category_drink);
            case 2:
                return mContext.getString(R.string.category_havefun);
            default:
                return mContext.getString(R.string.category_learn);
        }
    }
}
