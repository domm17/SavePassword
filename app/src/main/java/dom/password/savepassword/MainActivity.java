package dom.password.savepassword;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void generaPassword(View vista){

        TextView textPassword=findViewById(R.id.textView2);

        EditText length=findViewById(R.id.editText);
        String longitud=length.getText().toString();
        generadorPasswords generator=new generadorPasswords();

        if(longitud.isEmpty()){
            textPassword.setText(generator.getPassword());

        }else{
            int l= Integer.parseInt(longitud);
            textPassword.setText(generator.getPassword(l));

        }

        textPassword.setTextColor(Color.parseColor("#FFFFFF"));
    }

    public void generaPin(View vista){

        TextView textPassword=findViewById(R.id.textView2);
        EditText length=findViewById(R.id.editText);
        String longitud=length.getText().toString();

        if(longitud.isEmpty()){

            generadorPasswords generator=new generadorPasswords();
            textPassword.setText(generator.getPinNumber(4));

        }else{

            int l= Integer.parseInt(longitud);
            generadorPasswords generator=new generadorPasswords();
            textPassword.setText(generator.getPinNumber(l));

        }

        textPassword.setTextColor(Color.parseColor("#FFFFFF"));

    }

    public void salirApp(View view){
        finish();
    }




}
