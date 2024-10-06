package com.example.suerte

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Loginscreen() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.c ), contentDescription = "Login image lol",
        modifier = Modifier.size(200.dp))

        Text(text = "Bienvenido enfermo", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Inicio de sesión")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Escribe tu nombre")
        })

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Escribe tu contraseña")
        })

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(red = 0, green = 136, blue = 255, alpha = 255)
            ),
            shape = RoundedCornerShape(20.dp),

            ) {
            Text(
                text = "Login",
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.height(32.dp))
        
        Text(text = "Has olvidado tu contraseña?", modifier = Modifier.clickable {

        })

        Spacer(modifier = Modifier.height(13.dp))

        Text(text = "O Registrate", modifier = Modifier.clickable {

        })
        
        
    }
}