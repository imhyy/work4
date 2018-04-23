package com.example.hyy.work4;



        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;

public class FirstActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //final Button button2 = (Button) findViewById(R.id.button2);
       /* button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a =  getIntent().getStringExtra("s");
                Log.v("jieshou",a);
                //  finish();
            }
        });*/

        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,MainActivity.class);
                intent.putExtra("fanhui","返回");
                startActivity(intent);
                //  Log.v("jieshou",a);
                //  finish();
            }
        });
    }

}
