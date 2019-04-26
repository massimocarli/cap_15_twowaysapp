package uk.co.massimocarli.twowaysapp

import android.widget.CompoundButton
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener


@BindingAdapter("android:boundedChecked")
fun BoundCheckBox.setBoundedChecked(checked: Boolean) = setBoundedChecked(checked)

@InverseBindingAdapter(attribute = "android:boundedChecked")
fun BoundCheckBox.getBoundedChecked(): Boolean = isBoundedChecked()

@BindingAdapter("android:boundedCheckedAttrChanged")
fun BoundCheckBox.setListeners(attrChange: InverseBindingListener) {

  val newListener = object : CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(
      buttonView: CompoundButton?,
      isChecked: Boolean
    ) {
      buttonView?.isChecked?.let {
        attrChange.onChange()
      }
    }
  }
  setOnCheckedChangeListener(newListener)
}