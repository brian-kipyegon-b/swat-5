package com.example.swat5.ui.theme.authentication.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.Lock
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
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.swat5.R

@Composable
fun LoginScreen() {
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Lottie animation
        LottieAnimationWidget(R.raw.swat)

        Text(
            text = "JOIN SWAT",
            color = Color.Blue
        )
        // Input for email
        OutlinedTextField(
            value = emailInput,
            onValueChange = { emailInput = it },
            maxLines = 1,
            label = {
                Text(text = "Email Address")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email",
                    tint = Color.Blue,
                )
            },
            shape = RoundedCornerShape(size = 32.dp),
            placeholder = {
                Text(text = "Email Address")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedTextColor = Color.Blue,
                focusedBorderColor = Color.Blue
            )
        )

//        input for password
        OutlinedTextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            maxLines = 1,
            label = {
                Text(text = "Password")
            },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.baseline_password_24),
                    contentDescription = "Password",
                    tint = Color.Green
                )
            },
            trailingIcon = {
                IconButton(
                    onClick = { }
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.visible),
                        contentDescription = "Password",
                        tint = Color.Green
                    )
                }
            },
            shape = RoundedCornerShape(size = 32.dp),
            placeholder = {
                Text(text = "********")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedTextColor = Color.Blue,
                focusedBorderColor = Color.Green
            )
        )
    }
}

@Composable
fun LottieAnimationWidget(resId: Int) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(resId))
    val progress by animateLottieCompositionAsState(
        composition,
        iterations = LottieConstants.IterateForever
    )
    LottieAnimation(
        composition = composition,
        progress = { progress },
        modifier = Modifier.size(350.dp)
    )
}

@Composable
fun UserInputWidget() {
    var textInput by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = textInput,
        onValueChange = {
            textInput = it
        }
    )
}
