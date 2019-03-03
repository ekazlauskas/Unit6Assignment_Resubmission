package css.unit7assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnResult;
    EditText etWidth, etLength;

    private static final int FLOORING_REQUEST_CODE = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etWidth = findViewById(R.id.editTextWidth);
        etLength = findViewById(R.id.editTextLength);
    }

        /**
         * Called when the user taps the Show Results button
         */
        public void sendData (View view){
            String textWidth = etWidth.getText().toString();
            String textLength = etLength.getText().toString();
            Intent intent = new Intent(this, FlooringResults.class);
            intent.putExtra("WidthNumber", textWidth);
            intent.putExtra("LengthNumber", textLength);
            startActivityForResult(intent, FLOORING_REQUEST_CODE);
        }
    };

