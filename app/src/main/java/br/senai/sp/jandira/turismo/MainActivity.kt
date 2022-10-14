package br.senai.sp.jandira.turismo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.turismo.adapters.PontosTuristicosAdapter
import br.senai.sp.jandira.turismo.dao.PontosTuristicosDao
import br.senai.sp.jandira.turismo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var adapterPontosTuristicos: PontosTuristicosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar!!.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Determinar o layout da Recycler View
        binding.rvPontosTuristicos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // Declarando o Adapter e a adicionando a Recycler View
        adapterPontosTuristicos = PontosTuristicosAdapter(this)
        adapterPontosTuristicos.updatePontosTuristicosList(PontosTuristicosDao.getPontosTuristicos(this))

        // Ligando o adapter a recycler view
        binding.rvPontosTuristicos.adapter = adapterPontosTuristicos
    }
}