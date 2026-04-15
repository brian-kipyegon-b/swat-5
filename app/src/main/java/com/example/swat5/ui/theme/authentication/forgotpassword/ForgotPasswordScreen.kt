package com.example.swat5.ui.theme.authentication.forgotpassword

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.swat5.R
import com.example.swat5.ui.theme.authentication.login.LottieAnimationWidget

@Composable
fun ForgotPasswordScreen() {
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LottieAnimationWidget(R.raw.swat)

        Text(
            text = "FORGOT PASSWORD",
            color = Color.Blue
        )

        Text(
            text = "Enter your email to reset your password"
        )

        // Email Input
        OutlinedTextField(
            value = emailInput,
            onValueChange = { emailInput = it },
            maxLines = 1,
            label = { Text(text = "Email Address") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email",
                    tint = Color.Blue,
                )
            },
            shape = RoundedCornerShape(size = 32.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedTextColor = Color.Blue,
                focusedBorderColor = Color.Blue
            )
        )

        Button(
            onClick = { /* TODO: Reset password logic */ },
            modifier = Modifier.size(width = 280.dp, height = 50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
        ) {
            Text(text = "RESET PASSWORD", color = Color.White)
        }
    }
}
