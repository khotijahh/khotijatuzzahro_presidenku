package com.example.khotijatuzzahro_presidenku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presidenList= listOf<Presiden>(
            Presiden(
                R.drawable.gmbr_soekarno,
                "SOEKARNO",
                "1945-1947"
            ),
            Presiden(
                R.drawable.suharto,
                "SOHARTO",
                "1967-1968"
            ),
            Presiden(
                R.drawable.presiden_habibie,
                "BJ.HABIBI",
                "1998-1999"
            ),
            Presiden(
                R.drawable.abdurrahman_wahid,
                "ABDURRAHMAN WAHID",
                "1999-2001"
            ),
            Presiden(
                R.drawable._megawati_sukarnoputri,
                "MEGAWATI SUKARNOPUTRI",
                "2001-2004"
            ),
            Presiden(
                R.drawable.susilo_bambang_yudhoyono,
                "SUSILO BAMBANG YUDHOYONO",
                "2004-2014"
            ),
            Presiden(
                R.drawable.jokowi,
                "JOKOWI DODO",
                "2014-SEKARANG"
            )
        )
        val RecyclerView= findViewById<RecyclerView>(R.id.rv_presiden)
        RecyclerView.layoutManager=LinearLayoutManager(this)
        RecyclerView.setHasFixedSize(true)
        RecyclerView.adapter = presidenAdapter(this,presidenList){

        }
    }
}