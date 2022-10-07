package br.senai.sp.jandira.turismo.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.turismo.dao.PontosTuristicosDao

class PontosTuristicosAdapter(val context: Context) : RecyclerView.Adapter<PontosTuristicosAdapter.HolderPt>(){

    // Criando uma innerClass
    class HolderPt(view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderPt {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: HolderPt, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}