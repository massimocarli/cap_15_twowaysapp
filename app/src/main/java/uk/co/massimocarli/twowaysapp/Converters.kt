package uk.co.massimocarli.twowaysapp

import androidx.databinding.InverseMethod
import java.text.SimpleDateFormat
import java.util.*

val FORMATTER = SimpleDateFormat("dd/MM/yyyy")

object DateConverters {

  fun timeToString(time: Long): String {
    val date = Date()
    date.time = time
    return FORMATTER.format(date)
  }

  @InverseMethod("timeToString")
  fun stringToTime(date: String): Long? =
    FORMATTER.parse(date)?.time
}




