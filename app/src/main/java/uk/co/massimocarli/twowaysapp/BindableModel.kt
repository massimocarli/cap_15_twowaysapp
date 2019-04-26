package uk.co.massimocarli.twowaysapp

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class BindableModel : BaseObservable() {

  var _value: Boolean = false

  @Bindable
  fun getValue(): Boolean = _value

  fun setValue(value: Boolean) {
    if (_value != value) {
      _value = value
      notifyPropertyChanged(BR.value)
    }
  }
}