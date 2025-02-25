package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun TelaDeLogin(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Card(
            modifier = Modifier
                .width(150.dp)
                .height(50.dp)
                .align(Alignment.TopEnd),
            shape = RoundedCornerShape(
                bottomStart = 32.dp
            ),
            colors = CardDefaults.cardColors(
                Color(color = 0xFFFF6347)
            )
        ) {

        }
        Card(
            modifier = Modifier
                .width(150.dp)
                .height(50.dp)
                .align(Alignment.BottomStart),
            shape = RoundedCornerShape(
                topEnd = 32.dp
            ),
            colors = CardDefaults.cardColors(
                Color(color = 0xFFFF6347)
            )
        ){

        }
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(25.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(bottom = 32.dp)
            ) {
                Text(
                    text = stringResource(R.string.title_login),
                    fontSize = 48.sp,
                    color = Color(color = 0xFFFF6347),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.title_description),
                    color = Color.Gray
                )
            }
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.End,

            ) {
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    shape = RoundedCornerShape(20.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Email,
                            contentDescription = "",
                            tint = Color(color = 0xFFFF6347)
                        )
                    },
                    label = { Text(text = stringResource(R.string.outline_first_text)) }
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                        .padding(bottom = 45.dp),
                    shape = RoundedCornerShape(20.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Lock,
                            contentDescription = "",
                            tint = Color(color = 0xFFFF6347)
                        )
                    },
                    label = { Text(text = stringResource(R.string.outline_second_text)) }
                )
                Button(
                    onClick = {},
                    modifier = Modifier
                        .height(45.dp),
                    colors = ButtonDefaults.buttonColors(
                        Color(color = 0xFFFF6347)
                    ),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Text(
                        text = stringResource(R.string.sign_in)
                    )
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = ""
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(top = 15.dp)) {
                    Text(
                        text = stringResource(R.string.sign_in_description)
                    )
                    Text(
                        text = stringResource(R.string.sign_up),
                        color = Color(color = 0xFFFF6347),
                        fontWeight = FontWeight.Bold
                    )
                }

            }
        }
    }
}




@Preview(showSystemUi = true)
@Composable
private fun TelaDeLoginPreview() {
    TelaDeLogin()
}