package br.senai.sp.jandira.turismo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.turismo.R
import br.senai.sp.jandira.turismo.dao.PontosTuristicosDao
import br.senai.sp.jandira.turismo.models.PontoTuristico

class PontosTuristicosAdapter(val context: Context) : RecyclerView.Adapter<PontosTuristicosAdapter.HolderPt>() {

    //lateinit var binding: HolderLayoutBinding
    private var pontosTuristicosList = listOf<PontoTuristico>()

    fun updatePontosTuristicosList(pontosTuristicos: List<PontoTuristico>) {
     this.pontosTuristicosList = pontosTuristicos
     notifyDataSetChanged()
    }

    // Criando uma innerClass
    class HolderPt(view: View): RecyclerView.ViewHolder(view) {

        val textTitlePt = view.findViewById<TextView>(R.id.text_view_titulo)
        val imageHolderPt = view.findViewById<ImageView>(R.id.image_holder)
        val descriptionTextPt = view.findViewById<TextView>(R.id.text_view_descricao)
        val buttonDetailsPt = view.findViewById<Button>(R.id.button_details)

        fun bind(pontoTuristico: PontoTuristico) {
            textTitlePt.text = pontoTuristico.nomePontoTuristico
            imageHolderPt.setImageDrawable(pontoTuristico.imagem)
            descriptionTextPt.text = pontoTuristico.descricao
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderPt {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_layout, parent, false)

        return HolderPt(view)
    }

    override fun onBindViewHolder(holder: HolderPt, position: Int) {
        holder.bind(this.pontosTuristicosList[position])
    }

    override fun getItemCount(): Int {
        return this.pontosTuristicosList.size
    }

}