package recogniser.imagenet.tensorflow.ljlabs.tabfakeswipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

public class Groups extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);
        TextView map = (TextView) findViewById(R.id.textView);
        TextView feed = (TextView) findViewById(R.id.textView2);
        TextView group = (TextView) findViewById(R.id.textView3);

        try {
            getActionBar().setTitle("Groups");
        }catch (Exception e){}
        try{
            getSupportActionBar().setTitle("Groups");  // provide compatibility to all the versions
        }catch (Exception e){}
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapI = new Intent(getApplicationContext(), map.class);
                startActivity(mapI);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
        });
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent feedI = new Intent(getApplicationContext(), Feeds.class);
                startActivity(feedI);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
        });
    }
}
