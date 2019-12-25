package polinema.ac.id.uas.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import polinema.ac.id.uas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StadionFragment extends Fragment {
    TextView stadion;
    Button senin, rabu;



    public StadionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jadwal, container, false);
        stadion= view.findViewById(R.id.textView);
        senin = view.findViewById(R.id.button);
        rabu = view.findViewById(R.id.button2);
        // Inflate the layout for this fragment
        senin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stadion.setText("Stdaion Gelora Bung Karno");
            }

        });
        rabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stadion.setText("Stadion Batakan");
            }
        });

        return view;
        // Inflate the layout for this fragment

    }

}
