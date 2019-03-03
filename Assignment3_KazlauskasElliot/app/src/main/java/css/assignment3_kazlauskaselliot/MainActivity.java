package css.assignment3_kazlauskaselliot;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    //declared variables for needed widgets
    EditText etBill;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton rb1, rb2, rb3, rb4 ;
    TextView tvTotalTip;
    TextView tvTipPerPerson;
    CheckBox cbService;
    DecimalFormat currency = new DecimalFormat("$###,###.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initalize variables
        etBill = (EditText) findViewById(R.id.editTextBill);
        radioGroup = findViewById(R.id.radioGroup);
        tvTotalTip = (TextView) findViewById(R.id.textViewTotalTip);
        tvTipPerPerson = (TextView) findViewById(R.id.textViewTipPerPerson);
        cbService = (CheckBox) findViewById(R.id.checkBoxService);
        rb1 = (RadioButton) findViewById(R.id.radio_one);
        rb2 = (RadioButton) findViewById(R.id.radio_two);
        rb3 = (RadioButton) findViewById(R.id.radio_three);
        rb4 = (RadioButton) findViewById(R.id.radio_four);
    }

    public void checkButton (View view) {
        //public class for the radio group
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

    }
    public void onClickButtonCalculate(View view) {
        //calculates total tip and tip per person
        Double bill = Double.parseDouble(etBill.getText().toString());
        Double totalTip;
        int numPeople = 1;

        if (cbService.isChecked()) {
            totalTip = bill * 0.2;
        } else {
            totalTip = bill * 0.1;
        }
        if (rb1.isChecked()) {
            numPeople = 1;
        }
        if (rb2.isChecked()) {
            numPeople = 2;
        }
        if (rb3.isChecked()) {
            numPeople = 3;
        }
        if (rb4.isChecked()) {
            numPeople = 4;
        }

        Double tipPerPerson = totalTip / numPeople;

        tvTotalTip.setText("Total Tip: " + currency.format(totalTip));
        tvTipPerPerson.setText("Tip per Person: " + currency.format(tipPerPerson));

    }
}

