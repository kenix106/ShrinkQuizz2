package cl.evilgenius.shrinkquizz2;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class PartyFragment extends Fragment {


    public PartyFragment() {
        // Required empty public constructor
    }

    public static PartyFragment newInstance (){

        return new PartyFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_party, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.partyRadioGroup);
        Button btn = (Button) view.findViewById(R.id.PartyButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = radioGroup.getCheckedRadioButtonId();

                if (id != -1){
                    RadioButton rB= radioGroup.findViewById(id);
                    String answer = rB.getText().toString();
                 //   Toast.makeText(getContext(), answer, Toast.LENGTH_SHORT).show();
                    showDialog(answer);

                }else{
                    Toast.makeText(getContext(), "Debes marcar una opcion", Toast.LENGTH_SHORT).show();
                }

                Log.e ("RADIO GROUP", String.valueOf(radioGroup.getCheckedRadioButtonId()));

            }
        });
    }

    private void showDialog(String answer){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Party Level");
        alertDialog.setMessage(new PartyResult(answer).score());
        alertDialog.setPositiveButton("YEAH", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();

            }
        });
        alertDialog.show();

    }
}
