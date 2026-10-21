package com.example.actividad_4.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Colores del tema (Índigo y Gris neutro / MD3)
private val PrimaryIndigo = Color(0xFF4F46E5)
private val SlateDark = Color(0xFF0F172A)
private val SlateMedium = Color(0xFF334155)
private val SlateMuted = Color(0xFF64748B)
private val BorderColor = Color(0xFFE2E8F0)
private val BackgroundColor = Color(0xFFFAF8FF)

@Composable
fun RegisterScreen() {
    Scaffold(
        containerColor = BackgroundColor,
        topBar = {
            // 1. Botón de flecha hacia atrás arriba a la izquierda
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                IconButton(
                    onClick = { /* Sin acción */ },
                    modifier = Modifier
                        .size(44.dp)
                        .background(Color.White, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Volver",
                        tint = SlateDark
                    )
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            // 2. Título grande
            Text(
                text = "Crea tu cuenta",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp,
                    color = SlateDark
                )
            )

            Spacer(modifier = Modifier.height(4.dp))

            // 3. Subtítulo
            Text(
                text = "Empieza tu viaje con nosotros",
                style = MaterialTheme.typography.bodyLarge.copy(
                    color = SlateMuted
                )
            )

            Spacer(modifier = Modifier.height(28.dp))

            // 4. Campo: Nombre completo
            OutlinedTextField(
                value = "Juan Pérez",
                onValueChange = {},
                readOnly = true,
                label = { Text("Nombre completo") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = null,
                        tint = SlateMuted
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = PrimaryIndigo,
                    unfocusedBorderColor = BorderColor,
                    focusedLabelColor = PrimaryIndigo,
                    unfocusedLabelColor = SlateMuted,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White
                ),
                singleLine = true
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 5. Campo: Correo electrónico
            OutlinedTextField(
                value = "juan.perez@ejemplo.com",
                onValueChange = {},
                readOnly = true,
                label = { Text("Correo electrónico") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = null,
                        tint = SlateMuted
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = PrimaryIndigo,
                    unfocusedBorderColor = BorderColor,
                    focusedLabelColor = PrimaryIndigo,
                    unfocusedLabelColor = SlateMuted,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White
                ),
                singleLine = true
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 6. Campo: Contraseña
            OutlinedTextField(
                value = "••••••••••••",
                onValueChange = {},
                readOnly = true,
                label = { Text("Contraseña") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = null,
                        tint = SlateMuted
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Visibility,
                        contentDescription = "Mostrar contraseña",
                        tint = SlateMuted
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = PrimaryIndigo,
                    unfocusedBorderColor = BorderColor,
                    focusedLabelColor = PrimaryIndigo,
                    unfocusedLabelColor = SlateMuted,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White
                ),
                singleLine = true
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 7. Campo: Confirmar contraseña
            OutlinedTextField(
                value = "••••••••••••",
                onValueChange = {},
                readOnly = true,
                label = { Text("Confirmar contraseña") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = null,
                        tint = SlateMuted
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = PrimaryIndigo,
                    unfocusedBorderColor = BorderColor,
                    focusedLabelColor = PrimaryIndigo,
                    unfocusedLabelColor = SlateMuted,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White
                ),
                singleLine = true
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 8. Checkbox: Acepto los términos y condiciones
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = true,
                    onCheckedChange = null,
                    colors = CheckboxDefaults.colors(
                        checkedColor = PrimaryIndigo,
                        checkmarkColor = Color.White
                    )
                )
                Spacer(modifier = Modifier.width(4.dp))
                Row {
                    Text(
                        text = "Acepto los ",
                        style = MaterialTheme.typography.bodyMedium.copy(color = SlateMedium)
                    )
                    Text(
                        text = "términos y condiciones",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = PrimaryIndigo,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // 9. Botón principal: Crear cuenta
            Button(
                onClick = { /* Sin acción */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = PrimaryIndigo,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Crear cuenta",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold
                    )
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // 10. Separador: O regístrate con
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                HorizontalDivider(modifier = Modifier.weight(1f), color = BorderColor)
                Text(
                    text = "O regístrate con",
                    modifier = Modifier.padding(horizontal = 12.dp),
                    style = MaterialTheme.typography.bodySmall.copy(color = SlateMuted)
                )
                HorizontalDivider(modifier = Modifier.weight(1f), color = BorderColor)
            }

            Spacer(modifier = Modifier.height(20.dp))

            // 11. Botón: Continuar con Google
            OutlinedButton(
                onClick = { /* Sin acción */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(1.dp, BorderColor),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.White,
                    contentColor = SlateDark
                )
            ) {
                Surface(
                    shape = CircleShape,
                    color = Color(0xFFF1F5F9),
                    modifier = Modifier.size(24.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(
                            text = "G",
                            fontWeight = FontWeight.Black,
                            fontSize = 14.sp,
                            color = Color(0xFF4285F4)
                        )
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Continuar con Google",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Medium,
                        color = SlateDark
                    )
                )
            }

            Spacer(modifier = Modifier.height(28.dp))

            // 12. Pie: ¿Ya tienes una cuenta? Inicia sesión
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "¿Ya tienes una cuenta? ",
                    style = MaterialTheme.typography.bodyMedium.copy(color = SlateMuted)
                )
                Text(
                    text = "Inicia sesión",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = PrimaryIndigo,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}

@Preview(showBackground = true, device = "spec:width=411dp,height=891dp")
@Composable
fun RegisterScreenPreview() {
    MaterialTheme {
        RegisterScreen()
    }
}
