package club.shfront.treehousefirstapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class TreehouseFirstAppActivity extends AppCompatActivity {
    public static final String TAG = TreehouseFirstAppActivity.class.getSimpleName();
    private FactBook xFactBook = new FactBook();
    private ColorWheel xColorWheel = new ColorWheel();
    //Declare View Variable
    private TextView xTextView;
    private Button xShowAnotherButton;
    private ConstraintLayout xConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treehouse_first_app);

        //Assign the Views from the layout to the corresponding variable

        xTextView = (TextView) findViewById(R.id.mainQuestion);
        xShowAnotherButton = (Button) findViewById(R.id.showButton);
        xConstraintLayout = (ConstraintLayout) findViewById(R.id.mainLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TreehouseFirstAppActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                String question = xFactBook.getFact();
                int color = xColorWheel.getColor();
                xTextView.setText(question);
                xConstraintLayout.setBackgroundColor(color);
                xShowAnotherButton.setTextColor(color);
            }
        };
        xShowAnotherButton.setOnClickListener(listener);
        Toast.makeText(this, "Created", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"ONcreated");
    }
}
