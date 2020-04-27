package advanced.java.course.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EggTimerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer_layout);

        final EditText editText = findViewById(R.id.edit_text);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EggTimerActivity.this, TimeCountDownActivity.class);
                String userInput = editText.getText().toString();
                intent.putExtra("time", userInput);
                startActivity(intent);
            }
        });

    }

}
