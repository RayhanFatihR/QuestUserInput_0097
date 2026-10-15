package com.example.pertemuan_5

import android.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier {
    //variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }
    val gender:List<string> = listOf("Laki-laki","Perempuan")
}