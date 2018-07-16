package cl.evilgenius.shrinkquizz2;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MatchFragment extends Fragment {


    public MatchFragment() {
        // Required empty public constructor
    }

    public static  MatchFragment newInstance(){
        return new MatchFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_match, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final SeekBar userSB= (SeekBar) view.findViewById(R.id.userSeekBar);
        final SeekBar loverSB= (SeekBar)view.findViewById(R.id.LoverSeekBar);
        final TextView userTV = (TextView)view.findViewById(R.id.UserTV);
        final TextView loverTV =(TextView)view.findViewById(R.id.LoverTV);
        Button btn = (Button)view.findViewById(R.id.Btn_Eviar);

        userSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                userTV.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getContext(), "Comieza el conteo", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getContext(), "Termino el conteo", Toast.LENGTH_SHORT).show();
            }
        });

        loverSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                loverTV.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getContext(), "Empezo", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getContext(), "Termino", Toast.LENGTH_SHORT).show();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int you = userSB.getProgress();
                int other = loverSB.getProgress();


            }
        });

    }
}
