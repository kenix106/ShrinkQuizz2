package cl.evilgenius.shrinkquizz2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return PartyFragment.newInstance();
            case 1:
                return MatchFragment.newInstance();
            case 2:
                return LuckyFragment.newInstance();

            default:
                return  PartyFragment.newInstance();
        }

    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle (int position){
        switch (position){
            case 0:
                return "Section 1";
            case 1:
                return "Section 2";
            case 2 :
                return "Section 3";
        }
        return null;
    }

}
