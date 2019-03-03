package css.unit7assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FlooringResults extends AppCompatActivity {

    TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flooring_results);

        tvResults = findViewById(R.id.textViewResults);

        Bundle extras = getIntent().getExtras();
        String Width = extras.getString("WidthNumber");
        String Length = extras.getString("LengthNumber");
        Double WidthNumber = Double.parseDouble(Width);
        Double LengthNumber = Double.parseDouble(Length);
        Double Area = WidthNumber*LengthNumber;
        tvResults.setText("Width is " + Width + " and Length is " + Length + " and flooring needed is " + Area + ".");

    }


}
