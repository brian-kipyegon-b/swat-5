package com.example.swat5.ui.theme.authentication.signup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.swat5.R
import com.example.swat5.ui.theme.authentication.login.LottieAnimationWidget

@Composable
fun SignupScreen() {
    var nameInput by remember { mutableStateOf(TextFieldValue("")) }
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LottieAnimationWidget(R.raw.swat)

        Text(
            text = "CREATE ACCOUNT",
            color = Color.Blue
        )

        // Name Input
        OutlinedTextField(
            value = nameInput,
            onValueChange = { nameInput = it },
            maxLines = 1,
            label = { Text(text = "Full Name") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Name",
                    tint = Color.Blue,
                )
            },
            shape = RoundedCornerShape(size = 32.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedTextColor = Color.Blue,
                focusedBorderColor = Color.Blue
            )
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

        // Password Input
        var isVisible by remember { mutableStateOf(false) }
        OutlinedTextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            maxLines = 1,
            label = { Text(text = "Password") },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.baseline_password_24),
                    contentDescription = "Password",
                    tint = Color.Green
                )
            },
            trailingIcon = {
                IconButton(onClick = { isVisible = !isVisible }) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.visible),
                        contentDescription = "Toggle Password",
                        tint = Color.Green
                    )
                }
            },
            shape = RoundedCornerShape(size = 32.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedTextColor = Color.Blue,
                focusedBorderColor = Color.Green
            )
        )

        Button(
            onClick = { /* TODO: Signup logic */ },
            modifier = Modifier.size(width = 280.dp, height = 50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
        ) {
            Text(text = "SIGN UP", color = Color.White)
        }
    }
}
