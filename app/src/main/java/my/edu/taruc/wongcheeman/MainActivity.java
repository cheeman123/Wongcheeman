package my.edu.taruc.wongcheeman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText text_bm = (EditText)findViewById(R.id.editText1);
        String bm = text_bm.getText().toString();

        EditText text_english = (EditText)findViewById(R.id.editText2);
        String english = text_english.getText().toString();

        EditText text_sejarah = (EditText)findViewById(R.id.editText3);
        String math = text_sejarah.getText().toString();

        EditText text_sc = (EditText)findViewById(R.id.editText4);
        String sub1 = text_sejarah.getText().toString();

        EditText text_math = (EditText)findViewById(R.id.editText5);
        String sub2 = text_sejarah.getText().toString();

        if(math.equals("B")  || math.equals("b")||math.equals("A")  || math.equals("a"))
        {
            if(english.equals("D")||english.equals("d")||english.equals("E")||english.equals("e")||english.equals("F")||english.equals("f")&&bm.equals("D")||bm.equals("d")||bm.equals("E")||bm.equals("e")||bm.equals("F")||bm.equals("f"))
            {
                Toast.makeText(MainActivity.this, "Not Under Requieremnt!",
                        Toast.LENGTH_LONG).show();
            }
            else
            {
                if(bm.equals("D")||bm.equals("d")||bm.equals("E")||bm.equals("e")||bm.equals("F")||bm.equals("f")&&sub1.equals("D")||sub1.equals("d")||sub1.equals("E")||sub1.equals("e")||sub1.equals("F")||sub1.equals("f"))
                {
                    Toast.makeText(MainActivity.this, "Not Under Requieremnt!",
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "YES Welcome you to taruc!",
                            Toast.LENGTH_LONG).show();

                }
            }
        }
        else
        {
            Toast.makeText(MainActivity.this, "Not Under Requieremnt!",
                    Toast.LENGTH_LONG).show();
        }
    }


    }


