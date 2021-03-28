package com.example.work2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
    }
    package com.example.work2

    import android.app.Activity;
    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.view.View.OnClickListener;
    import android.widget.Button;
    import android.widget.EditText;

    public class MainActivity extends Activity implements OnClickListener {

        EditText etFName;
        EditText etLName;

        Button btnSubmit;


        /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);

            etFName = (EditText) findViewById(R.id.etFName);
            etLName = (EditText) findViewById(R.id.etLName);

            btnSubmit = (Button) findViewById(R.id.btnSubmit);
            btnSubmit.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
            Intent intent = new Intent(this, ViewActivity.class);
            intent.putExtra("fname", etFName.getText().toString());
            intent.putExtra("lname", etLName.getText().toString());
            startActivity(intent);
        }
    }
}