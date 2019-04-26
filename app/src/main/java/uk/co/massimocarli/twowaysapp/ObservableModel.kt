package uk.co.massimocarli.twowaysapp

import android.widget.CompoundButton
import androidx.databinding.ObservableBoolean

class ObservableModel {

  val onCheckedChangeListener =
    object : CompoundButton.OnCheckedChangeListener {
      override fun onCheckedChanged(
        buttonView: CompoundButton?,
        isChecked: Boolean
      ) {
        value.set(isChecked)
      }
    }

  val value = ObservableBoolean()
}