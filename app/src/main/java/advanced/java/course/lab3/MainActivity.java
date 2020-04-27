package advanced.java.course.lab3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_layout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        View main = findViewById(R.id.main);
        TextView text = findViewById(R.id.main_text);
        switch (item.getItemId()) {
            case R.id.blue:
                main.setBackgroundColor(Color.BLUE);
                text.setText("BLUE");
                return true;
            case R.id.green:
                main.setBackgroundColor(Color.GREEN);
                text.setText("GREEN");
                return true;
            case R.id.red:
                main.setBackgroundColor(Color.RED);
                text.setText("RED");
                return true;
            case R.id.yellow:
                main.setBackgroundColor(Color.YELLOW);
                text.setText("YELLOW");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
