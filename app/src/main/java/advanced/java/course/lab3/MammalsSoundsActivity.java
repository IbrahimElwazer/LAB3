package advanced.java.course.lab3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MammalsSoundsActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.animals_menu_layout, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        switch(item.getItemId()){
            case R.id.birds:
                Intent intent = new Intent(MammalsSoundsActivity.this, BirdSoundsActivity.class);
                startActivity(intent);
                return true;

            case R.id.mammals:
                setContentView(R.layout.mammals_layout);
                return true;
        }
        return super.onOptionsItemSelected(item);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mammals_layout);

        ImageView bear = findViewById(R.id.bear_image);
        bear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(MammalsSoundsActivity.this, R.raw.bear);
                mediaPlayer.start();
            }
        });


        ImageView wolf = findViewById(R.id.wolf_image);
        wolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(MammalsSoundsActivity.this, R.raw.wolf);
                mediaPlayer.start();
            }
        });


        ImageView elephant = findViewById(R.id.elephant_image);
        elephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(MammalsSoundsActivity.this, R.raw.elephant);
                mediaPlayer.start();
            }
        });


        ImageView lamb = findViewById(R.id.lamb_image);
        lamb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(MammalsSoundsActivity.this, R.raw.lamb);
                mediaPlayer.start();
            }
        });

    }
}
