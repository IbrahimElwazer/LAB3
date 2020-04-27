package advanced.java.course.lab3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ExternalActivityOAMK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oamk_acitivity);

        Button mapButton = findViewById(R.id.map_button);
        Button callButton = findViewById(R.id.call_button);
        final EditText editText = findViewById(R.id.text_input);
        Button goButton = findViewById(R.id.go_button);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:0,0?q=Kotkantie 1, 90250 Oulu, Finland");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);
            }
        });

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse("tel:+358206110200");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });

        goButton.setOnClickListener(new View.OnClickListener() {

            String oamksite = editText.getText().toString();
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse(oamksite);
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

    }

}
