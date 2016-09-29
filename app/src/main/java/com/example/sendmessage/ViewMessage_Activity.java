package com.example.sendmessage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by usuario on 23/09/16.
 */

public class ViewMessage_Activity extends AppCompatActivity {

    private TextView txvContentMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);

        txvContentMessage = (TextView) findViewById(R.id.txvContentVmString);

        Bundle bundle = this.getIntent().getExtras();

        txvContentMessage.setText(bundle.getString("msg"));
    }
}
