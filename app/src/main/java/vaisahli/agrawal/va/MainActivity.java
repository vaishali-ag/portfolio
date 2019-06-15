package vaisahli.agrawal.va;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewManager;

public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;
ViewManager viewManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tablayout);
        viewManager=findViewById(R.id.viewmanager);

    }
}
