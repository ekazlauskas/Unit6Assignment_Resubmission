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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etWidth = findViewById(R.id.editTextWidth);
        etLength = findViewById(R.id.editTextLength);
        btnResult = findViewById(R.id.buttonResult);
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textWidth = etWidth.getText().toString();
                String txtLength = etLength.getText().toString();

                Intent detailActIntent = new Intent(this, PizzaActivity.class);
                detailActIntent.putExtra("orderedPizza", orderedPizza);
                startActivity(detailActIntent);
            }
        });
    }

}
