 package littledroidtech.quon;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

 public class BookOne extends AppCompatActivity {

    private TextView text1;
    private PDFView pdfview;
    private FirebaseDatabase database= FirebaseDatabase.getInstance();

    DatabaseReference mref=database.getReference("url");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_one);

        pdfview= findViewById(R.id.pdfview);
        text1= findViewById(R.id.text1);

        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value= dataSnapshot.getValue(String.class);
                text1.setText(value);
                Toast.makeText(BookOne.this,"Updated",Toast.LENGTH_SHORT).show();
                String url=text1.getText().toString();
                new RetrivePdfStream().execute(url);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            Toast.makeText(BookOne.this,"Failed to Load",Toast.LENGTH_SHORT).show();
            }
        });}

        class RetrivePdfStream extends AsyncTask<String,Void,InputStream>{

            @Override
            protected InputStream doInBackground(String... strings) {
                InputStream inputStream = null;

                try {
                    URL url = new URL (strings[0]);
                    HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();

                    if (urlConnection.getResponseCode()==200)

                    {
                        inputStream= new BufferedInputStream(urlConnection.getInputStream());
                    }

                }catch (IOException e){
                    return null;
                }

                return inputStream;
            }

            @Override
            protected void onPostExecute(InputStream inputStream) {
                pdfview.fromStream(inputStream).load();
            }
        }


    }

