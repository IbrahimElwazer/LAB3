package advanced.java.course.lab3;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class BirdSoundsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birds_layout);


        ImageView huuhkaja = findViewById(R.id.huuhkaja_image);
        huuhkaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(BirdSoundsActivity.this, R.raw.huuhkaja_norther_eagle_owl);
                mediaPlayer.start();
            }
        });


        ImageView peippo = findViewById(R.id.peippo_image);
        peippo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(BirdSoundsActivity.this, R.raw.peippo_chaffinch);
                mediaPlayer.start();
            }
        });


        ImageView peukaloinen = findViewById(R.id.peukaloinen_image);
        peukaloinen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(BirdSoundsActivity.this, R.raw.peukaloinen_wren);
                mediaPlayer.start();
            }
        });

        ImageView punatulkku = findViewById(R.id.punatulkku_image);
        punatulkku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(BirdSoundsActivity.this, R.raw.punatulkku_northern_bullfinch);
                mediaPlayer.start();
            }
        });



    }
}
