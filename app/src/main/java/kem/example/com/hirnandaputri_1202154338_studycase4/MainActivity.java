package kem.example.com.hirnandaputri_1202154338_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindah(View view) {
        //Mendapatkan id Button
        int id = view.getId();
        //Mengatur perpindahan activity sesuai button
        switch (id){
            case R.id.buttongambar:
                startActivity(new Intent(this, CariGambar.class));
                break;
            case R.id.buttonnama:
                startActivity(new Intent(this, ListMahasiswa.class));
                break;
        }
        //Membuat transisi antar method
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
