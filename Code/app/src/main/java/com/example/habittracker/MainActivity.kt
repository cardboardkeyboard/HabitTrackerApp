package com.example.habittracker

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.os.Handler
import android.util.Log
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.os.postDelayed
import com.example.habittracker.db.File
import com.example.habittracker.db.Folder
import com.example.habittracker.db.HabitTrackerDatabase
import com.example.habittracker.db.TimeTable
import com.example.habittracker.ui.theme.HabitTrackerTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.time.LocalDate

//import java.util.logging.Handler

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        CoroutineScope(Dispatchers.IO).launch {
            val i = HabitTrackerDatabase.getInstance(applicationContext)

            /*var c = i.Dao().insertTimeTable(TimeTable(4, LocalDate.now(),"school"))
            i.Dao().insertFile(File("school","school",null))

            var topFolder = i.Dao().insertFolder(Folder("top",null))
            var a = i.Dao().insertTimeTable(TimeTable(3, LocalDate.now(),"workout"))
            i.Dao().insertFile(File("workout","workout",0))
            var b = i.Dao().insertTimeTable(TimeTable(5, LocalDate.now(),"sleep"))
            i.Dao().insertFile(File("sleep","sleep",0))

            var bottomFolder = i.Dao().insertFolder(Folder("bottom",0))
            var d = i.Dao().insertTimeTable(TimeTable(1, LocalDate.now(),"working"))
            i.Dao().insertFile(File("working","working",1))
            var e = i.Dao().insertTimeTable(TimeTable(0, LocalDate.now(),"coding"))
            i.Dao().insertFile(File("coding","coding",1))
*/

            Log.i("TEST",i.Dao().getTimeTableRowByTypeAndDate("coding", LocalDate.of(2025,7,25)).dayVal.toString())
            delay(3000)

            val intent = Intent(this@MainActivity, StartScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}
