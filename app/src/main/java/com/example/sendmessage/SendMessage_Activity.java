package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Class sends a message to another <b>Activity</b>
 *
 * @author David Primenko
 * @version 1.0
 * @see android.app.Activity
 */

//TODO My first Activity

public class SendMessage_Activity extends AppCompatActivity {
    private static final String TAG = "com.example.sendmessage";
    /**
     * Method wich create <b>Activity</b>
     *
     * @param savedInstanceState @see android.os.Bundle
     */

    private EditText edtMessage;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        this.edtMessage = (EditText) findViewById(R.id.edtMessage);
        this.btnSend = (Button) findViewById(R.id.btnSend);
        this.btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create Bundle Object
                Bundle bundle = new Bundle();
                bundle.putString("msg", edtMessage.getText().toString());
                // Create Intent and add Bundle Object
                Intent intent = new Intent(SendMessage_Activity.this, ViewMessage_Activity.class);
                intent.putExtras(bundle);
                // Start ViewMessage Activity
                startActivity(intent);
            }
        });
        Log.d(TAG, "onCreate(): La actividad se ha creado");
    }

    /*public void getOnClick (View view) {
        switch (view.getId()){
            case R.id.btnSend:
                // Create Bundle Object
                Bundle bundle = new Bundle();
                bundle.putString("msg", edtMessage.getText().toString());
                // Create Intent and add Bundle Object
                Intent intent = new Intent(SendMessage_Activity.this, ViewMessage_Activity.class);
                intent.putExtras(bundle);
                // Start ViewMessage Activity
                startActivity(intent);
        }
    }*/

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart(): La actividad se ha iniciado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume(): La actividad es visible");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause(): La actividad no es visible");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop(): La actividad se ha terminado");
    }
}
