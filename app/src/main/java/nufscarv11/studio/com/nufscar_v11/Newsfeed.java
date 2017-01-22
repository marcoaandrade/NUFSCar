package nufscarv11.studio.com.nufscar_v11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Newsfeed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed);

        Button buttonEventos = (Button) findViewById(R.id.buttonEventos);
        Button buttonBusca = (Button) findViewById(R.id.buttonBusca);
        Button buttonFavoritos = (Button) findViewById(R.id.buttonFavoritos);

        buttonEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Newsfeed.this, Eventos.class);
                startActivity(intent);
                Toast.makeText(Newsfeed.this, "Abrindo Calendário de eventos...", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        buttonBusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Newsfeed.this, Busca.class);
                startActivity(intent);
                Toast.makeText(Newsfeed.this, "Abrindo Busca...", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        buttonFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Newsfeed.this, Favoritos.class);
                startActivity(intent);
                Toast.makeText(Newsfeed.this, "Abrindo Favoritos...", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
