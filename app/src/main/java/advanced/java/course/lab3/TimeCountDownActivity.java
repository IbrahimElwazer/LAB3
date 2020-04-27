package advanced.java.course.lab3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TimeCountDownActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.count_down_layout);


        Intent intent = getIntent();
        String givenTime = intent.getStringExtra("time");

        final TextView time = findViewById(R.id.time);
        time.setText(givenTime);

        int number = Integer.parseInt(givenTime);
        int convertedNumber = number * 1000;
        final CountDownTimer timer = new CountDownTimer(convertedNumber, 1000) {

            public void onTick(long millisUntilFinished) {
                time.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                time.setText("Time is over!");
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(TimeCountDownActivity.this, R.raw.alarm_sound);
                mediaPlayer.start();
            }

        }.start();

        Button button = findViewById(R.id.stop_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                timer.cancel();

                Intent intent = new Intent(TimeCountDownActivity.this, EggTimerActivity.class);
                startActivity(intent);
            }
        });


    }
}
