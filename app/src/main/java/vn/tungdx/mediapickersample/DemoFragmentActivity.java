package vn.tungdx.mediapickersample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

/**
 * Created by TUNGDX on 6/6/2015.
 */
public class DemoFragmentActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_fragment);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new DemoFragment()).commit();
    }
}
