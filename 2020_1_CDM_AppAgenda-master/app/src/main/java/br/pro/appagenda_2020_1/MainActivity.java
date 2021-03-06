package br.pro.appagenda_2020_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText etNome, etTelefone;
    private Spinner spCidade, spEstado;
    private RadioButton rbFeminino, rbMasculino;
    private CheckBox cbEmail;
    private Button btnSalvar;

    @Override

    //Primeiro método a ser chamado
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//arquivo da view

        //(EditText) casting opcional
        etNome      = (EditText) findViewById(R.id.etNome);
        etTelefone  = findViewById(R.id.etTelefone);
        spCidade    = findViewById(R.id.spCidade);
        spEstado    = findViewById(R.id.spEstado);
        rbFeminino  = findViewById(R.id.rbFeminino);
        rbMasculino = findViewById(R.id.rbMasculino);
        cbEmail     = findViewById(R.id.cbAceitaEmail);
        btnSalvar   = findViewById(R.id.btnSalvar);

        //Inicializou o botão salvar
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvar();
            }
        });
    }

    private void salvar() {
        String texto = "";
        texto += "Nome: " + etNome.getText().toString() + "\n" +
        getResources().getString(R.string.lblTelefone) + etTelefone.getText().toString() + "\n" +
        getResources().getString((R.string.lblCidade)) + spCidade.getSelectedItem().toString()  + "\n" +
        getResources().getString((R.string.lblEstado)) + spEstado.getSelectedItem().toString() + "\n" +
        getResources().getString((R.string.lblSexo));


        if(rbFeminino.isChecked()){
            texto+= getResources().getString(R.string.lblFeminino);
        }else if(rbFeminino.isChecked()){
            texto+= getResources().getString(R.string.lblMasculino);
        }else{
            texto+= "(não informado)";
        }

        texto+= "\n" + getResources().getString(R.string.lblAceitaEmail);

        if(cbEmail.isChecked()){
            texto+= "SIM";
        }else{
            texto+= "NÃO";
        }

        texto += "\n\n Deseja salvar?";


        //this = main activity = tela atual
        AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
        alerta.setTitle("Salvar");
        alerta.setIcon(android.R.drawable.ic_dialog_alert);
        alerta.setMessage(texto);
        alerta.setNeutralButton("Cancelar", null);
        alerta.setPositiveButton("Sim", null);
        alerta.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alerta.show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}

//Notes

//onCreate -> onStart(iniciou) ->onResume(usuarioTemAcessoAqui)
//onPause (paraEaTENDE) ->onRestart() -> onResume(voltou)


//receita de bolo: classe, xml , ligação  setContentView(R.layout.activity_main);//arquivo da view
//registrar activity no manifest



