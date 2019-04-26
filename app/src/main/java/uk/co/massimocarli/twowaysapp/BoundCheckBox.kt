package uk.co.massimocarli.twowaysapp

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.CheckBox

class BoundCheckBox : CheckBox {

  companion object {
    const val LOG_TAG = "BoundCheckBox"
  }

  constructor(context: Context) : this(context, null)
  constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, R.attr.checkboxStyle)
  constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

  fun setBoundedChecked(checked: Boolean) {
    super.setChecked(checked)
    Log.d(LOG_TAG, "SET BoundedChecked with value $checked")
  }

  fun isBoundedChecked(): Boolean {
    val isChecked = super.isChecked()
    Log.d(LOG_TAG, "GET BoundedChecked with value $isChecked")
    return isChecked
  }
}