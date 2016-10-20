package recogniser.imagenet.tensorflow.ljlabs.tabfakeswipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

public class Feeds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeds);
        TextView map = (TextView) findViewById(R.id.textView);
        TextView feed = (TextView) findViewById(R.id.textView2);

        TextView group = (TextView) findViewById(R.id.textView3);
        try {
            getActionBar().setTitle("Feeds");
        }catch (Exception e){}
        try{
            getSupportActionBar().setTitle("Feeds");  // provide compatibility to all the versions
        }catch (Exception e){}
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapI = new Intent(getApplicationContext(), map.class);
                startActivity(mapI);
                //push from bottom to top
                //overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
                //slide from right to left
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
        });
        group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GroupI = new Intent(getApplicationContext(), Groups.class);
                startActivity(GroupI);
                //push from bottom to top
                //overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
                //slide from right to left
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
            }
        });
    }
}
