package com.example.navigasi_234.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.navigasi_234.R

@Composable
fun ListPeserta(
    onBackToBerandaClick:()-> Unit,
    OnBtnToFormulirClick:()-> Unit
) {
    val daftar = listOf(
        Pair(first = stringResource(R.string.namalengkap), second = "Danuarta"),
        Pair(first = stringResource(R.string.jk), second = "Laki-laki"),
        Pair(first = stringResource(R.string.status), second = "Lajang"),
        Pair(first = stringResource(R.string.alamat), second = "Yogyakarta")
    )
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text=stringResource(R.string.list), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(R.color.purple_200))
            )}
    ) {
        isiRuang->
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Top)
        {

        }
    }
}