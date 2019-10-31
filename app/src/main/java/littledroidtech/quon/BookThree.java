package littledroidtech.quon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BookThree extends AppCompatActivity {

    private TextView text3;
    private PDFView pdfview3;

    private FirebaseDatabase database= FirebaseDatabase.getInstance();

    DatabaseReference mref=database.getReference("url1");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_three);


        pdfview3= findViewById(R.id.pdfview3);
        text3= findViewById(R.id.text3);


    }
}
