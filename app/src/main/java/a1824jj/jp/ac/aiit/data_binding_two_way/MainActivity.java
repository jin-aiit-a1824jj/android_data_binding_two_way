package a1824jj.jp.ac.aiit.data_binding_two_way;

import a1824jj.jp.ac.aiit.data_binding_two_way.databinding.ActivityMainBinding;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Contact contact = new Contact("Alex","alex@gmail.com");
        this.activityMainBinding.setContact(contact);
    }
}
