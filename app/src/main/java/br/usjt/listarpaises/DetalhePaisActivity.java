package br.usjt.listarpaises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by daniel_pejon on 18/03/2018.
 * RA 816114026
 */
public class DetalhePaisActivity extends AppCompatActivity {
    private TextView nomeSelecionadoTextView;
    /**
     * Created by daniel_pejon on 18/03/2018.
     * RA 816114225
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
        nomeSelecionadoTextView =
                (TextView) findViewById(R.id.nomeSelecionadoTextView);
        Intent i = getIntent();
        String selecionado = i.getStringExtra(ListarPaises.DESCRICAO);
        if (selecionado.equals ("Europe/Germany.")) {
            nomeSelecionadoTextView.setText ("Nome=Alemanha\n"+
                                             "Capital=Berlin\n"+
                                             "Região=Europa\n"+
                                             "População=82,67\n"+
                                             "Lingua=Alemão");
        }else if (selecionado.equals ("Asia/Japan.")){


            nomeSelecionadoTextView.setText ("Nome=Japão\n"+
                                            "Capital=TOkyo\n"+
                                            "Região=Asia\n"+
                                            "População=127 milhões \n"+
                                            "Lingua=Japones");

        }
        Toast.makeText (getApplicationContext (),""+selecionado,Toast.LENGTH_SHORT).show ();
    }
}
