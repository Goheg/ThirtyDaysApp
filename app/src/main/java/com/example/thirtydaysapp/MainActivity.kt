package com.example.thirtydaysapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thirtydaysapp.data.DayTips
import com.example.thirtydaysapp.data.dayTips
import com.example.thirtydaysapp.ui.theme.ThirtyDaysAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThirtyDaysAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ){
                    ThirtyDaysApp()
                }
            }
        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ThirtyDaysApp() {
    Scaffold(
        topBar =  {
            AppTopBar()
        }
    ) {it ->
        LazyColumn(
            contentPadding = it
        ) {
            items(dayTips){
                DayTipCard(streak = it.streak, tasksHeading = it.tasks, imageRes = it.imageTask, details = it.descriptionRes)
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(){
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "30 days wellness campaign",
                style = MaterialTheme.typography.displayLarge
                )
        }
    )
}

@Composable
fun DayTipCard(
    streak: Int,
    tasksHeading: Int,
    imageRes: Int,
    details: Int
){
    var showMore by remember {
        mutableStateOf(false)
    }


    TextButton(
        onClick = { showMore = !showMore },
        shape = RoundedCornerShape(25.dp)
        ) {
        Card(
            modifier = Modifier
        ) {
            Column (
                Modifier.padding(16.dp)
            ){
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(
                        text = "Day$streak",
                        style = MaterialTheme.typography.displayLarge
                    )
                    if (showMore){
                        Icon(Icons.Filled.KeyboardArrowUp, null)
                    } else {
                        Icon(Icons.Filled.KeyboardArrowDown, null)
                    }
                }

                Text(
                    text = stringResource(id = tasksHeading),
                    fontSize = 24.sp
                    )
                Box {
                    Image(painter = painterResource(id = imageRes), contentDescription = null )
                }
                if (showMore){
                    Text(
                        text = stringResource(id = details),
                        style = MaterialTheme.typography.displaySmall
                        )
                }
            }
        }

    }

}

@Preview
@Composable
fun GreetingPreview() {
    ThirtyDaysAppTheme {
        ThirtyDaysApp()
    }
}