package android.example.doesntmatter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    boolean radioCheck = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void radioClick(View view) {

        ImageView image_file = findViewById(R.id.imageView1);
        if(view.getId() == R.id.radioButton)
        {
            RadioButton radio_butt = findViewById(R.id.radioButton);
            radio_butt.setChecked(true);
            image_file.setImageResource(R.drawable.otisblue);
            mp = MediaPlayer.create(this,R.raw.achangeisgonnacome);
            radioCheck = true;
        }
        else if(view.getId() == R.id.radioButton2)
        {
            RadioButton radio_butt2 = findViewById(R.id.radioButton2);
            radio_butt2.setChecked(true);
            image_file.setImageResource(R.drawable.oneofthesenights);
            mp = MediaPlayer.create(this,R.raw.oneofthesenights);
            radioCheck = true;
        }
        else if(view.getId() == R.id.radioButton3)
        {
            RadioButton radio_butt3 = findViewById(R.id.radioButton3);
            radio_butt3.setChecked(true);
            image_file.setImageResource(R.drawable.daydreamnation);
            mp = MediaPlayer.create(this,R.raw.heyjoni);
            radioCheck = true;
        }
    }

    public void playClick(View view)
    {
        if(radioCheck) {
            mp.start();
        }
    }


    public void pauseClick(View view)
    {
        if(radioCheck) {
            mp.pause();
        }
    }

    public void stopClick(View view)
    {
        if(radioCheck) {
            mp.stop();
        }
    }
}
