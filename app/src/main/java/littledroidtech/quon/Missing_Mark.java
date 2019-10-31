package littledroidtech.quon;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.zip.DataFormatException;

public class Missing_Mark extends AppCompatActivity {

    private EditText name, clas, yearstudy, unitname, unitcode, lecname,description;
    private Button send;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missing__mark);

        name = findViewById(R.id.name);
        clas = findViewById(R.id.clas  );
        yearstudy = findViewById(R.id.yearstudy);
        unitname = findViewById(R.id.unitname);
        unitcode = findViewById(R.id.unitcode);
        lecname = findViewById(R.id.lecname);
        description = findViewById(R.id.description);



        databaseReference = FirebaseDatabase.getInstance().getReference("Students");


        send = findViewById(R.id.button_for_submiting);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addStudents();
            }
        });



    }

    public void  addStudents(){

        String studentName = name.getText().toString();
        String studentClas = clas.getText().toString();
        String studentyearstudy = yearstudy.getText().toString();
        String studentunitname = unitname.getText().toString();
        String studentunitcode = unitcode.getText().toString();
        String studentlecname = lecname.getText().toString();
        String studentdescription = description.getText().toString();

        if (!TextUtils.isEmpty(studentName) && !TextUtils.isEmpty(studentClas) && !TextUtils.isEmpty(studentyearstudy)
                && !TextUtils.isEmpty(studentunitname)  && !TextUtils.isEmpty(studentunitcode)
                && !TextUtils.isEmpty(studentlecname) && !TextUtils.isEmpty(studentdescription)){

            String id = databaseReference.push().getKey();

            Students students =new Students(id,studentName,studentClas,studentyearstudy,
                    studentunitname,studentunitcode,studentlecname,studentdescription);
            databaseReference.child(id).setValue(students).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {

                    if (task.isSuccessful())
                    {
                        Toast.makeText(Missing_Mark.this, "Data was Submitted Successfully", Toast.LENGTH_SHORT).show();
                    }else
                    {
                        Toast.makeText(Missing_Mark.this, "Error Submiting Information", Toast.LENGTH_SHORT).show();
                    }

                }
            });

            name.setText("");
            clas.setText("");
            yearstudy.setText("");
            unitname.setText("");

        }
        else {
            Toast.makeText(Missing_Mark.this,"Please Fill Field",Toast.LENGTH_LONG).show();
        }

    }
}
