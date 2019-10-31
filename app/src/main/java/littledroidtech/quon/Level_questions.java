package littledroidtech.quon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Level_questions extends AppCompatActivity {

    private CardView levelOneQuestions, levelTwoQuestions, levelThreeQuestions, levelFourQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_questions);

        levelOneQuestions = findViewById(R.id.levelOneQuestions);
        levelTwoQuestions = findViewById(R.id.levelTwoQuestions);
        levelThreeQuestions = findViewById(R.id.levelThreeQuestions);
        levelFourQuestions = findViewById(R.id.levelFourQuestions);



        levelOneQuestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level_questions.this, Level_questions_one.class);
                startActivity(intent);
            }
        });

        levelTwoQuestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level_questions.this, Level_questions_two.class);
                startActivity(intent);
            }
        });

        levelThreeQuestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level_questions.this, Level_questions_three.class);
                startActivity(intent);
            }
        });

        levelFourQuestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level_questions.this, Level_questions_four.class);
                startActivity(intent);
            }
        });

    }
}
