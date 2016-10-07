package library.priyas;

import library.priyas.constant.SQLCommand;
import library.priyas.view.TableView;
import library.priyas.util.DBOperator;
//import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ScrollView;



public class PriyaSActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priya_s_layout);

        //copy database file
        try{
            DBOperator.copyDB(getBaseContext());
        }catch(Exception e){
            e.printStackTrace();
        }
        //implement SQL query and get cursor of resultset
//            Cursor cursor = DBOperator.getInstance().execQuery(SQLCommand.QUERY_STUDENT);
//            TableView tableView = new TableView(this, cursor);
//            //show data in tableview
        ScrollView scrollView = (ScrollView)this.findViewById(R.id.scrollView);
//            scrollView.addView(tableView);

        /*OnClickListener listnr=new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent("query_priya_s_layout");
                Curr    entActivity.this.startActivity(myIntent);
                startActivity(i);
            }
        };
        Button goDoQuery_btn =(Button) findViewById(R.id.goDoQuery_btn);
        goDoQuery_btn.setOnClickListener(listnr);
        */

        Button next = (Button) findViewById(R.id.goDoQuery_btn);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), QueryActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
}
