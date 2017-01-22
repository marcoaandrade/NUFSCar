package nufscarv11.studio.com.nufscar_v11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Favoritos extends AppCompatActivity {

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
                Intent intent = new Intent(Favoritos.this, Newsfeed.class);
                startActivity(intent);
                Toast.makeText(Favoritos.this, "Abrindo News Feed...", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        buttonBusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Favoritos.this, Busca.class);
                startActivity(intent);
                Toast.makeText(Favoritos.this, "Abrindo Busca...", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        buttonFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Favoritos.this, Eventos.class);
                startActivity(intent);
                Toast.makeText(Favoritos.this, "Abrindo Eventos...", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
