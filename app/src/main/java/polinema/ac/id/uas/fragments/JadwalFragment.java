package polinema.ac.id.uas.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import polinema.ac.id.uas.R;

public class JadwalFragment {
    TextView jadwal;
    Button LigaInggris, LigaSpanyol;

    public JadwalFragment () {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflaterter, ViewGroup container,
                             Bundle savedInstanceState ) {
        LayoutInflater inflater;
        View view = inflater.inflate(R.layout.fragment_jadwal, container, false);
        jadwal= view.findViewById(R.id.textView);
        senin = view.findViewById(R.id.button);
        rabu = view.findViewById(R.id.button2);
    }
}
