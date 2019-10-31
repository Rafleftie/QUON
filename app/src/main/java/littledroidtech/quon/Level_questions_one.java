package littledroidtech.quon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Level_questions_one extends AppCompatActivity {

    private TextView questionclass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_questions_one);

        questionclass= findViewById(R.id.questionmgtmaths);

        questionclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level_questions_one.this,QuestionDate.class);
                startActivity(intent);
            }
        });
    }
}
