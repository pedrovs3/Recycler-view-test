package br.senai.sp.jandira.turismo.dao

import android.content.Context
import br.senai.sp.jandira.turismo.R
import br.senai.sp.jandira.turismo.models.PontoTuristico

class PontosTuristicosDao {

    // Tudo que esta dentro do metodo companion é estatico (existe apenas uma instancia)
    companion object {

        fun getPontosTuristicos(context: Context): List<PontoTuristico> {

            //PontoTuristico pt1 = new PontoTuristico()
            val pt1 = PontoTuristico(1,
                "Dunas Genipabu",
                "O Parque Turístico Ecológico Dunas de Genipabu engloba uma praia, um grande complexo de dunas, uma lagoa.")
            pt1.imagem = context.getDrawable(R.drawable.dunas_genipabu)

            val pt2 = PontoTuristico(2,
                "Fossa das Marianas",
                "A Fossa das Marianas é o local mais profundo dos oceanos, atingindo uma profundidade de 10 984 metros. Localiza-se no oceano Pacífico, a leste das ilhas Marianas")
            pt2.imagem = context.getDrawable(R.drawable.fossa_das_marianas)

            val pt3 = PontoTuristico(3,
                "Noruega",
                "A aurora boreal na Noruega é um dos fenômenos mais belos da natureza. Ela também pode ser observada ao redor do mundo, em regiões próximas ao Círculo Polar Ártico.")
            pt3.imagem = context.getDrawable(R.drawable.noruega)

            val pt4 = PontoTuristico(4,
                "Monte Fuji",
                "O monte Fuji é a mais alta montanha da ilha de Honshu e de todo o arquipélago japonês. É um vulcão ativo, porém de baixo risco de erupção.")
            pt4.imagem = context.getDrawable(R.drawable.monte_fuji)

            val pontosTuristicos = listOf<PontoTuristico>(pt1, pt2, pt3, pt4)

            return pontosTuristicos
        }
    }
}