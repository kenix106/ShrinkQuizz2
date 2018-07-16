package cl.evilgenius.shrinkquizz2;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class LuckyFragment extends Fragment {


    public LuckyFragment() {
        // Required empty public constructor
    }

    public static LuckyFragment newInstance(){
        return new LuckyFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lucky, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final CheckBox happy = (CheckBox) view.findViewById(R.id.cb_happy);
        final CheckBox mood = (CheckBox) view.findViewById(R.id.cb_happy2);
        Button btn = (Button) view.findViewById(R.id.luckyBTN);




        happy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mood.setChecked(b);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean answer = happy.isChecked();
                Log.e("Answer", String.valueOf(answer));
            }
        });


    }
}
