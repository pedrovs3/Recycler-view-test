package br.senai.sp.jandira.turismo.models

import android.content.Context
import android.graphics.drawable.Drawable

class PontoTuristico(codigo:Int, nomePontoTuristico: String, descricao:String) {
    var codigo = codigo
    var nomePontoTuristico = nomePontoTuristico
    var descricao = descricao
    var imagem: Drawable? = null

}