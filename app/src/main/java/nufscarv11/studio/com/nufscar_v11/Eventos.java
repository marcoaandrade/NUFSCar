package nufscarv11.studio.com.nufscar_v11;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import java.util.Locale;

public class Eventos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        Button buttonEventos = (Button) findViewById(R.id.buttonEventos);
        Button buttonBusca = (Button) findViewById(R.id.buttonBusca);
        Button buttonFavoritos = (Button) findViewById(R.id.buttonFavoritos);
        //Button buttonAdd = (Button) findViewById(R.id.buttonAdd);

        //Clique botão de Eventos
        buttonEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Eventos.this, Newsfeed.class);
                startActivity(intent);
                Toast.makeText(Eventos.this, "Abrindo News Feed...", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        //Clique botão de Busca
        buttonBusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Eventos.this, Busca.class);
                startActivity(intent);
                Toast.makeText(Eventos.this, "Abrindo Busca...", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        //Clique botão de Favoritos
        buttonFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Eventos.this, Favoritos.class);
                startActivity(intent);
                Toast.makeText(Eventos.this, "Abrindo Favoritos...", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }


}
