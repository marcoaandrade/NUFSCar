package nufscarv11.studio.com.nufscar_v11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText editLogin = (EditText) findViewById(R.id.textLogin);
        final EditText editPassword = (EditText) findViewById(R.id.textPassword);
        Button buttonLogin = (Button) findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String login = editLogin.getText().toString();
                String password = editPassword.getText().toString();

                //if (Objects.equals(login, "aluno") && Objects.equals(password, "senha")){
                    Intent intent = new Intent(Login.this, Newsfeed.class);
                    startActivity(intent);
                    finish();
                /*}else{
                    editLogin.setText("");
                    editPassword.setText("");
                    Toast.makeText(Login.this, "Login/Senha incorretos", Toast.LENGTH_SHORT).show();
                }*/

            }
        });
    }
}
