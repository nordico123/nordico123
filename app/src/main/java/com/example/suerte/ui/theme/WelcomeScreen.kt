package com.example.suerte.ui.theme

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.suerte.R
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun WelcomeScreen() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Ceimess",
            color = Color.Black,
            fontWeight = FontWeight.Black,
            fontSize = 40.sp
        )

        Spacer(modifier = Modifier.height(100.dp))
        Image(painter = painterResource(id = R.drawable.c ), contentDescription = "Login image lol",
            modifier = Modifier.size(300.dp))
        Spacer(modifier = Modifier.height(130.dp))

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(red = 0, green = 136, blue = 255, alpha = 255)
            ),
            shape = RoundedCornerShape(10.dp),

        ) {
            Text(
                text = "Comenzar",
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.SemiBold


            )
        }






    }



}