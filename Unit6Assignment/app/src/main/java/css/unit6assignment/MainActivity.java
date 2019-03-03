package css.unit6assignment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1Call;
    Button btn2Call;
    Button btn3Call;
    Button btn1Text;
    Button btn2Text;
    Button btn3Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupButtononClickEvents();
    }

    private void setupButtononClickEvents() {

        btn1Call = (Button) findViewById(R.id.btnCall1);
        btn1Text = (Button) findViewById(R.id.btnSendText1);
        btn2Call = (Button) findViewById(R.id.btnCall2);
        btn2Text = (Button) findViewById(R.id.btnSendText2);
        btn3Call = (Button) findViewById(R.id.btnCall3);
        btn3Text = (Button) findViewById(R.id.btnSendText3);

        btn1Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call1();
            }
        });

        btn1Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message1();
            }
        });

        btn2Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call2();
            }
        });

        btn2Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message2();
            }
        });

        btn3Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call3();
            }
        });

        btn3Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message3();
            }
        });
    }

        public void Call1() {
            String number = "3203902152";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + number ));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
     }

        public void Message1() {
            Intent intent = new Intent(Intent.ACTION_SEND);
            String message = "Hi";
            intent.setData(Uri.parse("smsto:"));  // This ensures only SMS apps respond
            intent.putExtra("address", "3203902152");
            intent.putExtra("sms_body", message);
            intent.setType("text/plain");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }

        public void Call2(){
            String number = "6126003637";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + number ));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }

        public void Message2() {
            Intent intent = new Intent(Intent.ACTION_SEND);
            String message = "Hi";
            intent.setData(Uri.parse("smsto:"));  // This ensures only SMS apps respond
            intent.putExtra("address", "6126003637");
            intent.putExtra("sms_body", message);
            intent.setType("text/plain");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }

        public void Call3(){
            String number = "6125810579";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + number ));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
     }

        public void Message3() {
            Intent intent = new Intent(Intent.ACTION_SEND);
            String message = "Hi";
            intent.setData(Uri.parse("smsto:"));  // This ensures only SMS apps respond
            intent.putExtra("address", "6125810579");
            intent.putExtra("sms_body", message);
            intent.setType("text/plain");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
}
