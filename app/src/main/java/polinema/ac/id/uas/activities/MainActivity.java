package polinema.ac.id.uas.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import polinema.ac.id.uas.R;
import polinema.ac.id.uas.fragments.JadwalFragment;
import polinema.ac.id.uas.fragments.StadionFragment;
import polinema.ac.id.uas.fragments.PemainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
