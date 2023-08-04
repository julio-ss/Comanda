package com.example.comanda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criando itens
        Item item1 = new Item("Coca-Cola", 4.5);
        Item item2 = new Item("Pizza", 46.0);
        Item item3 = new Item("Fritas", 15.0);

        //criando comanda
        Comanda comanda = new Comanda();

        //adicionando intens
        comanda.adicionarItem(item1, 2);
        comanda.adicionarItem(item2, 1);
        comanda.adicionarItem(item3, 3);

        Log.i("Comanda", "itens: " + comanda);

        //remover item
        comanda.removerItem(item1, 1);

        //total da comanda
        double total = comanda.calcularTotal();
        Log.i("Comanda", "Total: " + total);
    }
}