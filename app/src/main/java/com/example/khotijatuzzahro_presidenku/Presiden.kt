package com.example.khotijatuzzahro_presidenku

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Presiden(
    val gmbrPresiden:Int,
    val teksNama:String,
    val teksPriode:String
): Parcelable
