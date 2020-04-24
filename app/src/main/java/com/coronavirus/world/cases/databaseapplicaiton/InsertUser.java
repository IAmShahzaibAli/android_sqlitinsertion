
package com.coronavirus.world.cases.databaseapplicaiton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertUser extends AppCompatActivity {



    EditText ID,NAME,EMAIL,MOBILE;
    DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_date_time);
        ID = (EditText)findViewById(R.id.enterid);
        NAME = (EditText)findViewById(R.id.entername);
        EMAIL = (EditText)findViewById(R.id.enteremail);
        MOBILE = (EditText)findViewById(R.id.enterphoneno);
         dbHandler = Temp.getDbHandler();





    }

    public void SaveData(View view)
    {

      String user_id =   ID.getText().toString();
        String user_name =   NAME.getText().toString();
        String user_email =   EMAIL.getText().toString();
        String user_mobile =   MOBILE.getText().toString();
        if(user_id.equals("") && user_name.equals("") && user_email.equals("") && user_mobile.equals(""))
        {
            Toast.makeText(getApplicationContext(),"Please Enter Valid Informaiton",Toast.LENGTH_SHORT).show();
        }
        else
        {
            User user = new User();
            user.setId(user_id);
            user.setName(user_name);
            user.setEmail(user_email);
            user.setMobile(user_mobile);
            int i = dbHandler.InsertUser(user);
            if(i==1)
            {

                Toast.makeText(getApplicationContext(),"User Data Inserted : ",Toast.LENGTH_SHORT).show();

            }
            else
            {
                Toast.makeText(getApplicationContext(),"User Data is Not inserted : ",Toast.LENGTH_SHORT).show();


            }








        }

















    }
}
