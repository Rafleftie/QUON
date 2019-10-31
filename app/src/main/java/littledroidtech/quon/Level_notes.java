package littledroidtech.quon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Level_notes extends AppCompatActivity {

    private CardView levelOne, levelTwo, levelThree, levelFour;
    private TextView  littletech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_notes);

        levelOne = findViewById(R.id.levelOne);
        levelTwo = findViewById(R.id.levelTwo);
        levelThree = findViewById(R.id.levelThree);
        levelFour = findViewById(R.id.levelFour);

        littletech = findViewById(R.id.little_tech);


        levelOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level_notes.this, First_year.class);
                startActivity(intent);
            }
        });


        levelTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Level_notes.this, Second_year.class);
                startActivity(intent2);
            }
        });

        levelThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Level_notes.this, Third_year.class);
                startActivity(intent3);
            }
        });

        levelFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Level_notes.this, Fourth_year.class);
                startActivity(intent4);
            }
        });

        littletech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Level_notes.this, Events.class);
                startActivity(intent5);
            }
        });


    }
}
