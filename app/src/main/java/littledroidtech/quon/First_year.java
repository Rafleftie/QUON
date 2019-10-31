package littledroidtech.quon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class First_year extends AppCompatActivity {

    private TextView classone,classtwo,classthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year);

        classone= findViewById(R.id.classone);
        classtwo= findViewById(R.id.classtwo);
        classthree= findViewById(R.id.classthree);


        classone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First_year.this,BookOne.class);
                startActivity(intent);
            }
        });


        classtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First_year.this,Book2.class);
                startActivity(intent);
            }
        });


        classthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First_year.this,BookThree.class);
                startActivity(intent);

            }
        });

    }
}
