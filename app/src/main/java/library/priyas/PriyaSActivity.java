package library.priyas;

import library.priyas.util.DBOperator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class PriyaSActivity extends AppCompatActivity implements OnClickListener{

    Button checkoutBtn,queryBtn;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout. activity_priya_s_layout);
        checkoutBtn=(Button)this.findViewById(R.id.goCheckOut_btn);
        checkoutBtn.setOnClickListener(this);
        queryBtn=(Button)this.findViewById(R.id.goDoQuery_btn);
        queryBtn.setOnClickListener(this);
        //copy database file
        try{
            DBOperator.copyDB(getBaseContext());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void onClick(View v)
    {
        int id=v.getId();
        if (id==R.id.goCheckOut_btn){

            Intent intent = new Intent(this, CheckoutActivity.class);
            this.startActivity(intent);


        }else if (id==R.id.goDoQuery_btn){
            Intent intent = new Intent(this, QueryActivity.class);
            this.startActivity(intent);
        }
    }
}
